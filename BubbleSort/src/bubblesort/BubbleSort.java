/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;
/**
 *
 * @author Christian
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vetor para ser ordenado
        int[] dadosBubble = {6, 5, 4, 3, 2, 1};
        //Variável auxiliar para realizar a troca dos valores
        int aux = 0;
        //Contador do número de iterações
        int numeroIteracoes = 0;

        //Condição de verificação do vetor se está em ordem para sair do loop
        boolean emOrdem = true;
        System.out.println("  Antes: " + Arrays.toString(dadosBubble));
        do {
            emOrdem = true;
            for (int i = 1; i < 6; i++) {
                //Começa pegando o segundo elemento do vetor e compara com o anterior para verificar se é maior. Se sim, troca as posição, senão, continua
                if (dadosBubble[i - 1] > dadosBubble[i]) {
                    
                    aux = dadosBubble[i];
                    dadosBubble[i] = dadosBubble[i - 1];
                    dadosBubble[i - 1] = aux;

                    // sinaliza que o vetor não está em ordem ainda
                    emOrdem = false;
                    // incrementa a variável com mais 1 para determinar o número de iterações
                    numeroIteracoes++;
                }
            }
        } while (!emOrdem); // Enquanto emOrdem for false, repete o loop
        
        System.out.println(" Depois: " + Arrays.toString(dadosBubble));
        System.out.println(" Número de Iterações de Troca de Posição: " + numeroIteracoes);

    }

}
