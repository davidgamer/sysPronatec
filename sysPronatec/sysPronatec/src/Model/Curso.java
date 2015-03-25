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

public class Curso {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCurso",nullable = false)
    private  Long IdCurso;
    @Column(name = "NomeCurso",nullable = false,length = 20)
    private String NomeCurso;
    @Column(name = "LocalCurso",nullable = false,length = 20)
    private String Local;
}
