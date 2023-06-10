/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package testecorreio;

import correio.CorreioService;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;


/**
 *
 * @author fatec.senai
 */

public class CorreioServiceTest {
    
    public CorreioServiceTest() {
    }
    
    @Test
    public void portoAlegreTest(){
        CorreioService correio = Mockito.mock(CorreioService.class);
        when(correio.buscaEndereco("9000000")).thenReturn("Porto Alegre");
        Assertions.assertEquals("Porto Alegre", correio.buscaEndereco("9000000"));
    }
    
    @Test
    public void assisBrasilTest(){
        CorreioService correio = Mockito.mock(CorreioService.class);
        when(correio.buscaEndereco("8000000")).thenReturn("Av. Assis Brasil");
        Assertions.assertEquals("Av. Assis Brasil", correio.buscaEndereco("8000000"));
    }
    
}
