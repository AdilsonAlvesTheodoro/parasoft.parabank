package parasoft.parabank.page;

import parasoft.parabank.elementos.Elementos;
import parasoft.parabank.metodos.Metodos;

public class RegistrarUsuarioPage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	/**
	 * Metodo acessar formulario
	 * 
	 * @author Adilson Theodoro
	 */
	public void acessarFormulario() {
		metodos.clicar(el.menuRegister, "abrindo o formulario pelo menu register da HOME ");
	}

	/**
	 * Metodos enviar formulario
	 * 
	 * @author Adilson Theodoro
	 */
	public void enviarFormulario(String firstName, String lastName, String address, String city, String state,
			String zipCode, String phone, String ssn, String username, String password, String confirPassword) {

		metodos.preencher(el.firstName, firstName, "preencher o campo firstName");
		metodos.preencher(el.lastName, lastName, "preencher o campo lastName");
		metodos.preencher(el.address, address, "preencher o campo address");
		metodos.preencher(el.city, city, "Barueri");
		metodos.preencher(el.state, state, "Sao Paulo");
		metodos.preencher(el.zipcode, zipCode, "preecher o campo zipCode");
		metodos.preencher(el.phone, phone, "preecher o campo phone");
		metodos.preencher(el.ssn, ssn, "preecher o campo ssn ");
		metodos.preencher(el.username, username, " Adilson2 ");
		metodos.preencher(el.password, password, "123456");
		metodos.preencher(el.confirmpassword, confirPassword, "123456");
		metodos.clicar(el.btnRegister, "clicando no botao register para enviar o formulario");

	}

}
