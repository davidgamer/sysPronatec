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
@Table(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEndereco", nullable = false, updatable = false, insertable = false)
    private Long IdEndereco;
    
    @Column(name = "Rua", nullable = false, length = 30)
    private String Rua;
    
    @Column(name = "Bairro", nullable = false, length = 20)
    private String Bairro;
    
    @Column(name = "NumeroCasa", nullable = false)
    private int NumeroCasa;
    
    @Column(name = "Complemento", nullable = false, length = 20)
    private String Complemento;
    
    @Column(name = "Logradouro", nullable = false, length = 20)
    private String Logradouro;
    
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "Endereco")
    private List<Pessoa> Pessoa;

    public Long getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Long IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public int getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(int NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public List<Pessoa> getPessoa() {
        return Pessoa;
    }

    public void setPessoa(List<Pessoa> Pessoa) {
        this.Pessoa = Pessoa;
    }
    
    

}
