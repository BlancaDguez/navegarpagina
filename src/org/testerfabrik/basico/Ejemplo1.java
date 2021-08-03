package org.testerfabrik.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ejemplo1 {
    public static void main (String[] args ){
       //instanciar objeto webdriver
        WebDriver driver;

        //Instanciar variables
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String actualResult;
        String expectResult = "Welcome: Mercury Tours";

        //indica la localizacion del archivo edgedriver.exe en la propiedad webdrive.edge.driver
        //getProperty donde esta localizado el proyecto base
       System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
       driver = new EdgeDriver();

       //navegara a la pagina
        driver.get(baseUrl);
        
        //obtener el titulo
        actualResult = driver.getTitle();

        //inprimir el resultado

        System.out.println(actualResult.contentEquals(expectResult)?"Prueba paso!" + actualResult:"prueba fail");
        //driver.close();



    }

}
