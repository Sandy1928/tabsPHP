package travelspages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.basepage;

public class hotels extends basepage{

	public hotels(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement btnlogin;
	
	@FindBy(xpath="//span[contains(text(),'Hotels')]")
	WebElement lnkhotels;
	
	@FindBy(id="s2id_autogen8")
	WebElement cityto;
	
	@FindBy(id="travellersInput")
	WebElement travellersinput;
	
	
	

	public void bookhotel() throws InterruptedException {
	//login en pagina de inicio	
	//	user.click();
	//	user.sendKeys("user@phptravels.com" + Keys.TAB);
	//	pass.sendKeys("demouser"+Keys.ENTER);
	//	btnlogin.click();
		
	//booking en un hotel	
		lnkhotels.click();
		WebElement cityto = driver.findElement(By.linkText("Search by Hotel or City Name"));
		cityto.click();
		cityto.sendKeys("London");
		Thread.sleep(3000);
		cityto.sendKeys(Keys.ENTER);
		WebElement datein = driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']"));
		datein.click();
		datein.sendKeys("13/03/2019" + Keys.TAB );
		WebElement dateout = driver.findElement(By.xpath("//input[@placeholder='Check out']"));
		dateout.sendKeys("16/03/2019");
		travellersinput.click();
		WebElement adults = driver.findElement(By.id("adultInput"));
//		adults.sendKeys("2");
		if(adults.getText().equals("2"));
		WebElement childs = driver.findElement(By.id("childInput"));
		childs.click();
		childs.clear();
		childs.sendKeys("2");
		WebElement search = driver.findElement(By.xpath("//form[@name='fCustomHotelSearch']//button[@type='submit'][contains(text(),'Search')]"));
		search.click();
		
		WebElement downbtn =driver.findElement(By.xpath("//tr[2]//td[1]//div[3]//a[1]//button[1]"));
		downbtn.sendKeys(Keys.PAGE_DOWN);
		
		WebElement swissotel = driver.findElement(By.xpath("//b[contains(text(),'Swissotel Le Plaza Basel')]"));
		swissotel.click();	
		Thread.sleep(2000);
		
		WebElement btn3 = driver.findElement(By.xpath("//html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"));
		btn3.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		WebElement btn4 = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[4]/div[2]/div[1]/div[2]/form[1]/div[5]/input[3]"));
		btn4.sendKeys(Keys.PAGE_DOWN);
		
		WebElement chkboxdelux = driver.findElement(By.xpath("//tbody//tr[1]//td[1]//div[2]//div[2]//div[1]//div[3]//div[1]//label[1]//div[1]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(chkboxdelux);
		actions.build().perform();
		
		chkboxdelux.click();
		WebElement booknow = driver.findElement(By.xpath("//button[contains(text(),'Book Now')]"));
		Thread.sleep(2000);
		booknow.click();
		
		WebElement signin = driver.findElement(By.id("signintab"));
		signin.click();
		user.click();
		user.sendKeys("user@phptravels.com" + Keys.TAB);
		pass.sendKeys("demouser");
		WebElement ckbxnotes = driver.findElement(By.xpath("//form[@id='loginform']//div[@class='control__indicator']")); 
		ckbxnotes.click();		
		WebElement notes = driver.findElement(By.xpath("//div[@id='special2']//textarea[@placeholder='You can enter any additional notes or information you want included with your order here...']"));
		notes.click();
		notes.sendKeys("Wine and flowers");
		notes.sendKeys(Keys.PAGE_DOWN);
		WebElement switch4 = driver.findElement(By.xpath("//tbody//tr[1]//td[4]//label[1]//span[1]//span[2]"));
		Thread.sleep(2000);
		if(switch4.getText().equals("No")) {
			switch4.click();	
		}else {
			System.out.println("primer switch ya estaba en YES");
		}
		WebElement switch3 = driver.findElement(By.xpath("//tbody//tr[2]//td[4]//label[1]//span[1]//span[2]"));
		if(switch3.getText().equals("No")) {
			switch3.click();	
		}else {
			System.out.println("segundo switch ya estaba en YES");
		}	
		notes.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.name("login"));
		confirm.click();
//		WebElement pdf = driver.findElement(By.id("btn"));
//		pdf.click();
		
		
		
		Thread.sleep(5000);
		
	}

}
