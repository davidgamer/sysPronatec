/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author David
 */
@Entity
@Table(name = "Escolaridade")
public class Escolaridade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEscolaridade", nullable = false, updatable = false, insertable = false)
    private Long IdEscolaridade;

    @Column(name = "GrauEscolaridade", nullable = false, length = 20)
    private String GrauEscolaridade;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Escolaridade")
    private List<Candidato> Candidato;

    public Long getIdEscolaridade() {
        return IdEscolaridade;
    }

    public void setIdEscolaridade(Long IdEscolaridade) {
        this.IdEscolaridade = IdEscolaridade;
    }

    public String getGrauEscolaridade() {
        return GrauEscolaridade;
    }

    public void setGrauEscolaridade(String GrauEscolaridade) {
        this.GrauEscolaridade = GrauEscolaridade;
    }

    public List<Candidato> getCandidato() {
        return Candidato;
    }

    public void setCandidato(List<Candidato> Candidato) {
        this.Candidato = Candidato;
    }

}
