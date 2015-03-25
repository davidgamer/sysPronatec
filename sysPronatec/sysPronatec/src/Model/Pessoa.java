/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Calendar;
import javax.persistence.*;
import static org.eclipse.persistence.platform.database.oracle.plsql.OraclePLSQLTypes.Int;


/**
 *
 * @author David
 */


@Entity


public class Pessoa {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPessoa",nullable = false)
    private Long IdPessoa;
    @Column(name = "Nome",nullable = false,length = 40)
    private String Nome;
    @Column(name = "CPF",nullable = false)
    private int CPF;
    @Column(name = "DataNascimento",nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar DataNasc;
    @Column(name = "NomeMae",nullable = false,length = 40)
    private String NomeMae;
    @Column(name = "Cor",nullable = false,length = 10)
    private String Cor;

    public Long getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(Long IdPessoa) {
        this.IdPessoa = IdPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Calendar getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Calendar DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String NomeMae) {
        this.NomeMae = NomeMae;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
    
    
   
}
