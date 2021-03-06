/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author David
 */
@Entity
@Table(name = "Atendimento")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAtendimento", nullable = false, updatable = false, insertable = false)
    private long IdAtendimento;

    @Column(name = "Cadastrador", nullable = false, length = 20)
    private String Cadastrador;

    @Column(name = "DataCadastro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar DataCadastro;

    @Column(name = "UnidadeAtendimento", nullable = false, length = 20)
    private String UnidadeAtendimento;

    @Column(name = "RepreCadastro", nullable = false, length = 40)
    private String RepreCadastro;

    @Column(name = "FormaAcesso", nullable = false, length = 10)
    private String FormaAcesso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPessoaCandidato", nullable = false)
    private Candidato Candidato;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "Atendimento")
    private List<Curso> Curso;
}
