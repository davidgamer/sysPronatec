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
public class Escolaridade {

    @Column(name = "GrauEscolaridade", nullable = false, length = 20)
    private String GrauEscolaridade;

    public Escolaridade() {
    }

    public Escolaridade(String GrauEscolaridade) {
        this.GrauEscolaridade = GrauEscolaridade;
    }

    public String getGrauEscolaridade() {
        return GrauEscolaridade;
    }

    public void setGrauEscolaridade(String GrauEscolaridade) {
        this.GrauEscolaridade = GrauEscolaridade;
    }

}
