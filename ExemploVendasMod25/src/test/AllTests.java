/**
 * 
 */
package br.com.michele;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author michele.codes
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}