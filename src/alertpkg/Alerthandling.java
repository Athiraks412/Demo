package alertpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://echoecho.com/javascript4.htm");
        driver.findElement(By.name("B1")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept(); // to select ok button
        driver.findElement(By.name("B2")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();  //to select cancel

	}

}
