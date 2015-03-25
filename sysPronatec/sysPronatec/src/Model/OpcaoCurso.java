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
public class OpcaoCurso {
    @Column(name = "Opcao",nullable = false,length = 20)
    private String Opcao;

    public String getOpcao() {
        return Opcao;
    }

    public void setOpcao(String Opcao) {
        this.Opcao = Opcao;
    }
    
    
    
}
