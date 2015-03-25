/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author David
 */
@Entity
public class Candidato {
    
 @Column(name = "NIS",nullable = false)   
private int NIS;
 @Column(name = "Profissao",nullable = false,length = 20)
private String Profissao;
 @Column(name = "DispHorario",nullable = false,length = 10)
private String DispHorario;

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

 
 
}
