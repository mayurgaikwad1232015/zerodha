package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp_POM {
// Declaration
	@FindBy(xpath="//input[@name='firstname']") private WebElement fName;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lName;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement Mob_No;
	@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement Password;
	@FindBy(xpath="//select[@name='birthday_day']") private WebElement Bday ;
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement Bdaymonth ;
	@FindBy(xpath="//select[@name='birthday_year']") private WebElement BdayYear ;
	@FindBy(xpath="//input[@type='radio']") private WebElement gender ;

	//Initialization
	SignUp_POM(WebDriver ddd){
		PageFactory.initElements(ddd, this);
	}
	
	//Usage
	public void enterFirstName(String name) {
		fName.sendKeys(name);
}
	public void enterLastName(String lastname) {
		lName.sendKeys(lastname);
}
	public void mobileNo(String Mo_No) {
		Mob_No.sendKeys(Mo_No);
}
	public void enterNewPassword(String pass) {
		Password.sendKeys(pass);
}
	public void selectBdayDate(String birthday) {
		Select sel = new Select(Bday);
				sel.selectByVisibleText(birthday);
	}
	
	public void selectBdayMonth(String month) {
		Select x = new Select(Bdaymonth);
				x.selectByValue(month);
	}
	
	public void selectBdayYear(String birthdayYear) {
		Select sel = new Select(BdayYear);
				sel.selectByVisibleText(birthdayYear);
	}
	public void clickOnRadio() {
		gender.click();
	}
}
