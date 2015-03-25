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
public class Telefone {
    
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "IdTelefone",nullable = false)
    private int IdTelefone;
   @Column(name = "TelefoneCelular",nullable = false)
    private Integer TelefoneCelular;
   @Column(name = "TelefoneResidencial",nullable = false)
    private Integer TelefoneResidencial;

    public Telefone() {
    }

    public Telefone(int IdTelefone, Integer TelefoneCelular, Integer TelefoneResidencial) {
        this.IdTelefone = IdTelefone;
        this.TelefoneCelular = TelefoneCelular;
        this.TelefoneResidencial = TelefoneResidencial;
    }

   
   
    public int getIdTelefone() {
        return IdTelefone;
    }

    public void setIdTelefone(int IdTelefone) {
        this.IdTelefone = IdTelefone;
    }

    public Integer getTelefoneCelular() {
        return TelefoneCelular;
    }

    public void setTelefoneCelular(Integer TelefoneCelular) {
        this.TelefoneCelular = TelefoneCelular;
    }

    public Integer getTelefoneResidencial() {
        return TelefoneResidencial;
    }

    public void setTelefoneResidencial(Integer TelefoneResidencial) {
        this.TelefoneResidencial = TelefoneResidencial;
    }

    
}
