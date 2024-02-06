package src.main.java.br.services;

import br.com.michele.dao.IProdutoDAO;
import br.com.michele.domain.Produto;
import br.com.michele.services.generic.GenericService;

@author michele.codes

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}