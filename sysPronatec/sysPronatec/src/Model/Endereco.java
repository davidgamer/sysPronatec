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

}
