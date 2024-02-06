/**
 * 
 */
package src.main.java.br.dao;

import br.com.michele.dao.generic.GenericDAO;
import br.com.michele.domain.Cliente;

/**
 * @author michele.codes
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}



}
