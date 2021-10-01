package br.com.impacta.ejrocha.softwaretesting.services;

public class ValidacaoTexto {

    public boolean validarTextoPalindromo(String texto) {        
        String textoSemCaracteres = this.removerCaracteresEspeciais(texto);
        String textoInvertido = this.inverterTexto(textoSemCaracteres);
        return textoSemCaracteres.equalsIgnoreCase(textoInvertido);
    }

    private String inverterTexto(String original) {
        return new StringBuilder(original).reverse().toString();
    }

    private String removerCaracteresEspeciais(String original){
        String textoFormatado = original.replaceAll("[[^a-z A-Z 0-9]]+", "");
        return textoFormatado.replaceAll("\\s", "");
    }

}
