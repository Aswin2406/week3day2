package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.ajio.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 Thread.sleep(5000);
		 String titleofthepage = driver.getTitle();
		 System.out.println("title of the page:"+titleofthepage);
		 
		 driver.findElement(By.name("searchVal")).sendKeys("Bag");
		 driver.findElement(By.xpath( "//span[@class='ic-search']")).click();
		 driver.findElement(By.xpath( "//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		 driver.findElement(By.id("verticalsizegroupformat")).click();
		 driver.findElement(By.xpath( "//input[@id='modal-Men - Fashion Bags']/following::label")).click();
		 driver.findElement(By.xpath( "//div[@class='facet-filter-modal__form-actions']//following::button")).click();
		 String text = driver.findElement(By.className("length")).getText();
		 System.out.println("no of item avaiable:"+ text);
		 List<WebElement> listofbrands = driver.findElements(By.className("brand"));
		 System.out.println("list of brand avaiable:"+ listofbrands.size());
		 for (WebElement webElement : listofbrands) {
			 String text2 = webElement.getText();
			 System.out.println("list of brands :"+ text2);
			
		}
		 List<WebElement> listofnameofbags = driver.findElements(By.className("name"));
		 System.out.println("name of bags avaiable:"+ listofnameofbags.size());
		 
		  for (WebElement webElement1 : listofnameofbags) {
			  String text3 = webElement1.getText();
			  System.out.println("list of bag names:"+ text3);
			
		}
		 
		 
		 
		 
		 


	}

}
