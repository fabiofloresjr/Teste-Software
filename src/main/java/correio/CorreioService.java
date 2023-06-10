/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correio;

/**
 *
 * @author fatec.senai
 */
public class CorreioService {
    
    public String buscaEndereco(String cep){
        if ("9000000".equals(cep)){
            return "Porto Alegre";
        }
        if ("8000000".equals(cep)){
            return "Av. Assis Brasil";
        }
        return cep;
    }
}
