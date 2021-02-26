package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayTest {
    @Test
    public void PlayMusica(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\angel\\Documents\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("http://youtube.com");
        navegador.findElement(By.name("search_query")).click();
        navegador.findElement(By.name("search_query")).sendKeys("Bita e o Circo - Álbum completo");
        navegador.findElement(By.id("search-icon-legacy")).click();
        navegador.findElement(By.xpath("//a[@title=\"Bita e o Circo - Álbum completo\"]")).click();
    }
}
