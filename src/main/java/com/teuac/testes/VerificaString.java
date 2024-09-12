package com.teuac.testes;


import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra");
        String palavra = sc.nextLine();

        int contador = 0;

        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.toLowerCase().charAt(i) == 'a'){
                contador++;
            }
        }

        System.out.println("O caractere 'a' está presente "+ contador+ " vezes na palavra "+palavra+".");


    }
}
