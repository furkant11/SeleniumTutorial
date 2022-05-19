package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }
    public void login(){
    methods.click(By.xpath("//div[@class='menu-top-button login']"));
    methods.waitBySeconds(2);
    methods.sendKeys(By.id("login-email"),"furkan99ua@hotmail.com");
    methods.waitBySeconds(2);
    methods.sendKeys(By.xpath("//input[@id='login-password']"),"Ff000099+");
    methods.waitBySeconds(2);
    methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
    methods.waitBySeconds(2);
    Assert.assertTrue("login basarisiz",methods.isElementVisible(By.xpath("//input[@id='search-input']")));
    }
}
