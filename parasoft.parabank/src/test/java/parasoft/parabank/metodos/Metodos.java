package parasoft.parabank.metodos;

import org.openqa.selenium.By;

import com.github.dockerjava.api.model.Driver;

import parasoft.parabank.drivers.Drivers;

public class Metodos extends Drivers {
	/**
	 * Metodo clicar em um elemento passando uma class By
	 * 
	 * @param elemento
	 * @param passoTeste
	 * @author Adilson Theodoro
	 */
	public void clicar(By elemento, String passoTeste) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******" + "Erro no passo " + passoTeste + "******");
			System.out.println("******Causa do erro ****** " + e.getCause());
			System.out.println("****** Mensagem de erro ****** " + e.getMessage());
		}
	}

	/**
	 * Metodo preecher em um elemento web passando uma class By
	 * 
	 * @param elemento
	 * @param texto
	 * @param passoTeste
	 * @author Adilson Theodoro
	 */
	public void preencher(By elemento, String texto, String passoTeste) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("******" + "Erro no passo " + passoTeste + "******");
			System.out.println("******Causa do erro ****** " + e.getCause());
			System.out.println("****** Mensagem de erro ****** " + e.getMessage());
		}

	}

	public void validarMensagem(By msgRegistroSucesso, String string) {
		// TODO Auto-generated method stub
		
	}

}
