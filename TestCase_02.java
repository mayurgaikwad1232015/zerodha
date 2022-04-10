package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Conf;

public class Test_Cases {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", Conf.driverpath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	SignUp_POM ss = new SignUp_POM(driver);
	Utility util = new Utility();
	ss.enterFirstName(util.readExcelData(1,0));
	ss.enterLastName(util.readExcelData(1,1));
	ss.mobileNo(util.readExcelData(1,2));
	ss.enterNewPassword(util.readExcelData(1,3));
	ss.selectBdayDate(util.readExcelData(1,4));
	ss.selectBdayMonth(util.readExcelData(1,5));
	ss.selectBdayYear(util.readExcelData(1,6));
	ss.clickOnRadio();
	driver.navigate().refresh();
	ss.enterFirstName(util.readExcelData(2,0));
	ss.enterLastName(util.readExcelData(2,1));
	ss.mobileNo(util.readExcelData(2,2));
	ss.enterNewPassword(util.readExcelData(2,3));
	ss.selectBdayDate(util.readExcelData(2,4));
	ss.selectBdayMonth(util.readExcelData(2,5));
	ss.selectBdayYear(util.readExcelData(2,6));
	ss.clickOnRadio();
	driver.navigate().refresh();
	ss.enterFirstName(util.readExcelData(3,0));
	ss.enterLastName(util.readExcelData(3,1));
	ss.mobileNo(util.readExcelData(3,2));
	ss.enterNewPassword(util.readExcelData(3,3));
	ss.selectBdayDate(util.readExcelData(3,4));
	ss.selectBdayMonth(util.readExcelData(3,5));
	ss.selectBdayYear(util.readExcelData(3,6));
	ss.clickOnRadio();
	driver.navigate().refresh();
	driver.quit();
}
}
