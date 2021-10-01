package br.com.impacta.ejrocha.softwaretesting.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ValidacaoTextoTest {

    @Test
    public void testValidacaoTextoTrue(){

        ValidacaoTexto validacaoTexto = new ValidacaoTexto();
        List<String> listaDePalavraAceitas = Arrays.asList(
            "Rotator", 
            "bob", 
            "madam", 
            "mAlAyAlam", 
            "1", 
            "Able was I, ere I saw Elba", 
            "Madam I’m Adam", 
            "Step on no pets.", 
            "Top spot!", 
            "02/02/2020" 
        );

        for(String palavra : listaDePalavraAceitas){            
            boolean result = validacaoTexto.validarTextoPalindromo(palavra);
            assertEquals(result, Boolean.TRUE);
        }
        
    }

    @Test
    public void testValidacaoTextoFalse(){

        ValidacaoTexto validacaoTexto = new ValidacaoTexto();
        List<String> listaDePalavraNaoAceitas = Arrays.asList(
            "xyz", 
            "elephant", 
            "Country", 
            "Top . post!", 
            "Wonderful-fool", 
            "Wild imagination!" 
        );

        for(String palavra : listaDePalavraNaoAceitas){            
            boolean result = validacaoTexto.validarTextoPalindromo(palavra);            
            assertEquals(result, Boolean.FALSE);
        }
    }

}
