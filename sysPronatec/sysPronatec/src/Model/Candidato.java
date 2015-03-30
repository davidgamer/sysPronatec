/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
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

public class Candidato  {

    @Id
    @Column(name = "IdPessoaCandidato", nullable = false, updatable = true, insertable = false)
 
    private Integer IdPessoaCandidato;

    @Column(name = "NIS", nullable = false)
    private int NIS;

    @Column(name = "Profissao", nullable = false, length = 20)
    private String Profissao;

    @Column(name = "DispHorario", nullable = false, length = 10)
    private String DispHorario;

   @OneToOne
   @JoinColumn(name = "IdPessoa") 
   
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

    public Integer getIdPessoaCandidato() {
        return IdPessoaCandidato;
    }

    public void setIdPessoaCandidato(Integer IdPessoaCandidato) {
        this.IdPessoaCandidato = IdPessoaCandidato;
    }

    public int getNIS() {
        return NIS;
    }

    public void setNIS(int NIS) {
        this.NIS = NIS;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String Profissao) {
        this.Profissao = Profissao;
    }

    public String getDispHorario() {
        return DispHorario;
    }

    public void setDispHorario(String DispHorario) {
        this.DispHorario = DispHorario;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa Pessoa) {
        this.Pessoa = Pessoa;
    }

    public Escolaridade getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(Escolaridade Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Atendimento> getAtendimento() {
        return Atendimento;
    }

    public void setAtendimento(List<Atendimento> Atendimento) {
        this.Atendimento = Atendimento;
    }
    

}
