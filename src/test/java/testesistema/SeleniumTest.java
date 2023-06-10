package testesistema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author marcelo.soares
 */
public class SeleniumTest {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    public SeleniumTest() {
    }
    
    @BeforeAll
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    
    @Test
    public void testCampoNomeVazio(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("");
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions. assertTrue(resultado.getText().equals("Preencha o campo nome"));
    }
    
    @Test
    public void testCampoNomePreenchido(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions.assertTrue(resultado.getText().equals("Preencha o campo endereco"));
    }
    
    @Test
    public void testCampoEnderecoVazio(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        campoEndereco.sendKeys("");
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions.assertTrue(resultado.getText().equals("Preencha o campo endereco"));
    }
    
    @Test
    public void testCampoEnderecoPreenchido(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        campoEndereco.sendKeys("Porto Alegre");
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions.assertTrue(resultado.getText().equals("Selecione um valor para o campo sexo"));
    }
    
    @Test
    public void testCampoSexoVazio(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        campoEndereco.sendKeys("Porto Alegre");
        campoSexo.sendKeys("");
        
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions.assertTrue(resultado.getText().equals("Selecione um valor para o campo sexo"));
    }
    
    @Test
    public void testCampoSexoPreenchido(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        campoEndereco.sendKeys("Porto Alegre");
        campoSexo.sendKeys("Masculino");
        
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions.assertTrue(resultado.getText().equals("Preencha o campo idade, somente com numeros"));
    }
    
     @Test
    public void testCampoIdadeVazio(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        campoEndereco.sendKeys("Porto Alegre");
        campoSexo.sendKeys("Masculino");
        campoIdade.sendKeys("");
        
        salvar.click();
        WebElement resultado = driver.findElement(By.id("resultado"));
        Assertions.assertTrue(resultado.getText().equals("Preencha o campo idade, somente com numeros"));
    }
    
     @Test
    public void testCampoIdadePreenchido(){
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement salvar = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys("Marcelo");
        campoEndereco.sendKeys("Porto Alegre");
        campoSexo.sendKeys("Masculino");
        campoIdade.sendKeys("40");
        
        salvar.click();
         Alert alert = driver.switchTo().alert();
         Assertions.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
    }
    
    @Test
    public void testTituloPagina() {
        driver.get("C:\\Users\\fatec.senai\\Documents\\NetBeansProjects\\BANCODADOS\\src\\main\\java\\sistema\\trabalho2-1.html");

        String tituloExperado ="Trabalho 2-1";
        Assertions.assertEquals(tituloExperado,driver.getTitle());
    }
    
    
    
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
    
}
