
package br.com.teste.desktop.teste.mavenproject1.Model;

import java.util.Calendar;
import javax.persistence.*;

@ Entity
public class Tarefa {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String Descricao;
    private boolean finalizado;
    
    @Temporal(TemporalType.DATE)
    private Calendar datafinalizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDatafinalizacao() {
        return datafinalizacao;
    }

    public void setDatafinalizacao(Calendar datafinalizacao) {
        this.datafinalizacao = datafinalizacao;
    }
    
    
    
    
    
    
}
