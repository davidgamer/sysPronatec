/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author David
 */
@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAtendimento",nullable = false)
    private long IdAtendimento;
    @Column(name = "Cadastrador",nullable = false,length = 20)
    private String Cadastrador;
    @Column(name = "DataCadastro",nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar DataCadastro;
    @Column(name = "UnidadeAtendimento",nullable = false,length = 20)
    private String UnidadeAtendimento;
    @Column(name = "RepreCadastro",nullable = false,length = 40)
    private String RepreCadastro;
    @Column(name = "FormaAcesso",nullable = false,length = 10)
    private String FormaAcesso;

    public Atendimento() {
    }

    public Atendimento(long IdAtendimento, String Cadastrador, Calendar DataCadastro, String UnidadeAtendimento, String RepreCadastro, String FormaAcesso) {
        this.IdAtendimento = IdAtendimento;
        this.Cadastrador = Cadastrador;
        this.DataCadastro = DataCadastro;
        this.UnidadeAtendimento = UnidadeAtendimento;
        this.RepreCadastro = RepreCadastro;
        this.FormaAcesso = FormaAcesso;
    }

    
    public long getIdAtendimento() {
        return IdAtendimento;
    }

    public void setIdAtendimento(long IdAtendimento) {
        this.IdAtendimento = IdAtendimento;
    }

    public String getCadastrador() {
        return Cadastrador;
    }

    public void setCadastrador(String Cadastrador) {
        this.Cadastrador = Cadastrador;
    }

    public Calendar getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Calendar DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public String getUnidadeAtendimento() {
        return UnidadeAtendimento;
    }

    public void setUnidadeAtendimento(String UnidadeAtendimento) {
        this.UnidadeAtendimento = UnidadeAtendimento;
    }

    public String getRepreCadastro() {
        return RepreCadastro;
    }

    public void setRepreCadastro(String RepreCadastro) {
        this.RepreCadastro = RepreCadastro;
    }

    public String getFormaAcesso() {
        return FormaAcesso;
    }

    public void setFormaAcesso(String FormaAcesso) {
        this.FormaAcesso = FormaAcesso;
    }
    
    
}
