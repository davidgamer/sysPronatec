/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDAO;

import Model.Pessoa;

/**
 *
 * @author David
 */
public interface PessoaDAO {
    
    public Pessoa salvar(Pessoa pessoa);
    public Pessoa remover(Pessoa pessoa);
    public Pessoa editar(Pessoa pessoa);
    public Pessoa Buscar(Pessoa pessoa);
    
}
