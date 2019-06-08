package SDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class STest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd= new FirefoxDriver();
		wd.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
		WebElement Email=wd.findElement(By.id("email"));
		           Email.sendKeys("kiran@gmail.com");
		           Thread.sleep(1000);
		WebElement Password=wd.findElement(By.id("password"));
		           Password.sendKeys("123456");
		           Thread.sleep(1000);
		WebElement Singin =wd.findElement(By.xpath("//*[@id='form']/div[3]/div/button"));
		           Singin.click();
		           Thread.sleep(1000);
		WebElement User=wd.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		           User.click();
		           Thread.sleep(1000);
		WebElement AddUser=wd.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		           Thread.sleep(1000);
		           AddUser.click();
		           Thread.sleep(1000);
		WebElement Username=wd.findElement(By.id("username"));
		           Thread.sleep(1000);
		           Username.sendKeys("Gajanan");
		           Thread.sleep(1000);
		WebElement Mobile=wd.findElement(By.id("mobile"));
		           Thread.sleep(1000);
		           Mobile.sendKeys("9673920863");
		           Thread.sleep(1000);
		WebElement email=wd.findElement(By.id("email"));
		           Thread.sleep(1000);
		           email.sendKeys("gd@gmail.com");
		           Thread.sleep(5);
		WebElement gender=wd.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/label"));
		System.out.println(gender.getText());
		           Thread.sleep(1000);
        WebElement male=wd.findElement(By.id("Male"));
                   Thread.sleep(1000);
                   male.click();
                   Thread.sleep(1000);
        Select s=new Select(wd.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
                   Thread.sleep(1000);
                   s.selectByVisibleText("HP");
                   Thread.sleep(1000);
        WebElement password=wd.findElement(By.id("password"));
                   Thread.sleep(1000);
                   password.sendKeys("12345678");
        WebElement Submit=wd.findElement(By.id("submit"));
                   Thread.sleep(1000);
                   Submit.click();
                   Thread.sleep(1000);
                   System.out.println("User created");
                   Thread.sleep(1000);
                   Alert al = wd.switchTo().alert();
                   Thread.sleep(1000);
           		al.accept(); 
           		
           		Thread.sleep(3000);
           		
           		WebElement User1=wd.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		           User1.click();
		           Thread.sleep(1000);
		        WebElement usrest=wd.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
		           Thread.sleep(1000);
		        for(int j=2;j<=5;j++)
		        {
		        	for(int i=1;i<=5;i++)
		        	{
		        	  WebElement table=wd.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
		        	  System.out.print(" " + table.getText());
		        	}
		        	System.out.println();
		        }
		        
		        
		

	}

}
