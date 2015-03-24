/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author David
 */
@Entity
public class Tarefa implements  Serializable{
    @Id
    @GeneratedValue
    private Long ID;
    @Column
    private String descricao;
     @Column
    private boolean finalizado;

  @Temporal(TemporalType.DATE)
  private Calendar dataFinalizacao;

    public Tarefa() {
    }

    public Tarefa(Long ID, String descricao, boolean finalizado, Calendar dataFinalizacao) {
        this.ID = ID;
        this.descricao = descricao;
        this.finalizado = finalizado;
        this.dataFinalizacao = dataFinalizacao;
    }
    

  
  
  
  
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
  
    
}
