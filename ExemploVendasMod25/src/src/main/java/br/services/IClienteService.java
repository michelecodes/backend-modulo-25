/**
 * 
 */
package src.main.java.br.services;

import br.com.michele.domain.Cliente;
import br.com.michele.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author michele.codes
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
