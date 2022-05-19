package page;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);




    public ProductPage(){
        methods = new Methods();
        }

        public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"content\"]/div[3]/div[4]/div[1]/div/div[1]/select/option[6]"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.id("product-495679"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-495679\"]/div[2]/div[2]/a[2]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-542991\"]/div[2]/div[2]/a[3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-495680\"]/div[2]/div[2]/a[2]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-495684\"]/div[2]/div[2]/a[2]"));
        methods.waitBySeconds(2);
        }

        public void attributeTest(){
            String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
            System.out.println("Alinan text: " + attribute);
            logger.info("Alinan text: " + attribute);
            methods.waitBySeconds(5);

        }

        public void textControlTest(){
            String text = methods.getText(By.cssSelector(".common-sprite"));
            System.out.println("Alinan text: " + text);
            logger.info("Alinan text:" + text);
            methods.waitBySeconds(1);
        }


        public void valueControlTest(){
            methods.sendKeys(By.id("search-input"),"testinium");
            String value = methods.getValue(By.id("search-input"));
            System.out.printf("Alinan text: " + value);
            logger.info("Alinan text: " + value);
            Assert.assertEquals("testinium", value);
            methods.waitBySeconds(5);
        }



}


