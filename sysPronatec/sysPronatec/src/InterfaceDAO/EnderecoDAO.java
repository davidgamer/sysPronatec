/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDAO;

import Model.Endereco;

/**
 *
 * @author David
 */
public interface EnderecoDAO {
    public Endereco salvar(Endereco endereco);
    public Endereco remover(Endereco endereco);
    public Endereco editar(Endereco endereco);
    public Endereco buscar(Endereco endereco);
}
