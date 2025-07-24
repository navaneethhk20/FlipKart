package org.example.sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class LoginToApp {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
    }
}
