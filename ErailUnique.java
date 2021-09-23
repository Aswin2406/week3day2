package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String pagetitle = driver.getTitle();
		System.out.println("titel of the page :"+pagetitle);
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS",Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("CBE",Keys.ENTER);
	//	driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(5000);
		List<WebElement> listoftrainnames = driver.findElements(By.xpath( "//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		int size = listoftrainnames.size();
		System.out.println("avilable of train list:"+	size );
		
		Set<String> listtrain =new HashSet<String>();
		
		
		for (WebElement webEle : listoftrainnames) {
			webEle.getText();
			System.out.println(webEle.getText());
			
		}
		
	
		
		}
		
		
	//	  for (int i = 0; i < size ; i++) {
		//	  System.out.println("list od trains:"+ listoftrainnames.get(i).getText());
			
		
	
		}
		
		
	
			
		
	  
		
			
		
		
		
		
	


