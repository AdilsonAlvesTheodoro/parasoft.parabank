package parasoft.parabank.elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	          // Elementos do registro
	
	public By firstName = By.id("customer.firstName");
	public By lastName = By.id("customer.lastName");
	public By address = By.id("customer.address.street");
	public By city = By.id("customer.address.city");
	public By state = By.id("customer.address.state");
	public By zipcode = By.id("customer.address.zipCode");
	public By phone = By.id("customer.phoneNumber");
	public By ssn = By.id("customer.ssn");
	public By username = By.id("customer.username");
	public By password = By.id("customer.password");
	public By confirmpassword = By.id("repeatedPassword");
	public By btnRegister = By.xpath("//input[@value='Register']");
	public By menuRegister = By.xpath("//a[text()='Register']");
	


}
