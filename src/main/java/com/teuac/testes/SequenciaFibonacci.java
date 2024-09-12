package com.teuac.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char repetidor = 's';

        while(repetidor == 's'){

            try{

                System.out.println("Digite um numero: ");
                int numero = sc.nextInt();

                if(calculoFibonacci(numero)){
                    System.out.println("o numero "+numero+" pertence a sequencia de fibbonacci");
                }
                else{
                    System.out.println("o numero "+numero+" NÃO pertence a sequencia de fibonacci");
                }

                System.out.println("Deseja verficar outro numero ?(s/n)");
                repetidor = sc.next().charAt(0);
            }catch (Exception e){
                throw new InputMismatchException("caractere informado é ivalido");
            }


        }
    }

    public static boolean calculoFibonacci(int num){
        /*
          FORMULA ---> 5 * n^2 + 4 ou 5 * n^2 - 4

          Se o resultado dessa formula, retornar um quadraro perfeito, esse numero pertence a sequancia de fibonacci
        */
        double formula_com_soma = Math.sqrt((5.00 * Math.pow((double)num, 2)) + 4.00);
        double formula_com_subtracao = Math.sqrt((5.00 * Math.pow((double)num, 2)) - 4.00);


        return formula_com_soma == (int) formula_com_soma || formula_com_subtracao == (int) formula_com_subtracao;


    }

}
