/**
 * 
 */
package src.main.java.br.dao;

import br.com.michele.dao.generic.IGenericDAO;
import br.com.michele.domain.Venda;
import br.com.michele.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author michele.codes
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
