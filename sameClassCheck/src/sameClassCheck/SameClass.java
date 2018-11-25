package sameClassCheck;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\eclipse-workspace\\chromedriver.exe");

			WebDriver driver = new ChromeDriver ();
			driver.get("C:\\Users\\swapn\\Desktop\\sameClassAutomationCheck\\index.html");
			driver.manage().window().maximize();
			WebElement a = driver.findElement(By.xpath("(//*[@class='same'])"));
			int maxSize = driver.findElements( By.xpath("//*[@class='same']") ).size();
			int minSize = 1;
			//int i = 1;
			while(minSize != maxSize+1) {	
				String textPicker = driver.findElement(By.xpath("(//*[@class='same'])["+minSize+"]")).getText();
				System.out.println(textPicker);
				minSize++;
			}
			

	}

}
