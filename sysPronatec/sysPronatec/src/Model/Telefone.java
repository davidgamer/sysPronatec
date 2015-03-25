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

    
}
