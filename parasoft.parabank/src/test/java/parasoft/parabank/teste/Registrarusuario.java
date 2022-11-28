package parasoft.parabank.teste;

import org.junit.Before;
import org.junit.Test;

import parasoft.parabank.metodos.Metodos;
import parasoft.parabank.page.RegistrarUsuarioPage;
import parasoft.parabank.runner.Executa;

public class Registrarusuario {

	RegistrarUsuarioPage registrar = new RegistrarUsuarioPage();

	// Before executa antes do teste
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();

	}

	@Test
	public void testeRegistrarUsuario() {
		registrar.acessarFormulario();

		// dados que irão preencher formulario home parabank
		registrar.enviarFormulario("firstName", "lastName", "address", " Barueri", "Sao Paulo", "zipCode", "phone",
				"ssn", "Adilson2", "123456", "123456");
	}

	@Test // prencher com dados em branco
	public void testeRegistrarUsuarioEmBranco() {
		registrar.enviarFormulario(null, null, null, null, null, null, null, null, null, null, null);
	}

	@Test // preencher compo com senha diferente
	public void testeRegistrarUsuarioSenhaDiferentes() {
		registrar.enviarFormulario(null, null, null, null, null, null, null, null, null, null, "0000");
	}

	@Test // registra usuario ja cadastrado
	public void testeRegistrarUsuarioJacadastrado() {
		registrar.enviarFormulario("firstName", "lastName", "address", " Barueri", "Sao Paulo", "zipCode", "phone",
				"ssn", "Adilson2", "123456", "123456");
	}

}
