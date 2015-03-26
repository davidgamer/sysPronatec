/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author David
 */
@Entity
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCurso", nullable = false, updatable = false, insertable = false)
    private Long IdCurso;
    
    @Column(name = "NomeCurso", nullable = false, length = 20)
    private String NomeCurso;
    
    @Column(name = "LocalCurso", nullable = false, length = 20)
    private String Local;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdAtendimento", nullable = false)
    private Atendimento Atendimento;

    public Long getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Long IdCurso) {
        this.IdCurso = IdCurso;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public Atendimento getAtendimento() {
        return Atendimento;
    }

    public void setAtendimento(Atendimento Atendimento) {
        this.Atendimento = Atendimento;
    }

   
   

}
