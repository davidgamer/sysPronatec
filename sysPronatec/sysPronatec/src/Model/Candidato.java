/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "Candidato")
public class Candidato {

    @Id
    @Column(name = "IdPessoaCandidato", nullable = false, updatable = false, insertable = false)
    private Integer IdPessoaCandidato;

    @Column(name = "NIS", nullable = false)
    private int NIS;

    @Column(name = "Profissao", nullable = false, length = 20)
    private String Profissao;

    @Column(name = "DispHorario", nullable = false, length = 10)
    private String DispHorario;

   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "IdPessoa", nullable = false) 
    private Pessoa Pessoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdEscolaridade", nullable = false)
    private Escolaridade Escolaridade;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "Candidato")
    private List<Telefone> telefones;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "IdAtendimento")
    private List<Atendimento> Atendimento;

}
