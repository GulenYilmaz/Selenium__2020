package com.syntax.seleniumclass08__WebTablesHandle;
/*
 * 1: Table headers and rows verification
Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 5 rows and 4 columns
Print name of all column headers 
Print data of all rows
Quit Browser

 */

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/syntaxpractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]")).click();
		driver.findElement(By.linkText("Table Data Search")).click();

		driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']"));
		System.out.println("number of rows is :: "+rows.size());

		for (WebElement row : rows) {
			String rowText = row.getText();
			System.out.println(rowText);
		}

		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
		System.out.println("number of columns is :: "+cols.size());

		Iterator<WebElement> it = cols.iterator();
		while (it.hasNext()) {
			String colsText = it.next().getText();
			System.out.println(colsText);

		}
		driver.close();

	}
}
