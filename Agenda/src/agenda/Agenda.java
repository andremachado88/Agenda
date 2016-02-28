/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author André Cândido
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        RaizesArvores raizes = new RaizesArvores();
        NoArvore atual = null;
        
        FileReader arq = null;
        BufferedReader lerArq = null;
        String linha = "";
        int Quantidade =0;
        
       // Scanner entrada = new Scanner (System.in);
       // System.out.println("Digite a quantidade: ");
      //  int quantidade = Integer.parseInt(entrada.nextLine());
        
        arq = new FileReader("C:\\entrada.txt"); 
        lerArq = new BufferedReader(arq); 
        linha = lerArq.readLine(); // lê a primeira linha 
        // a variável "linha" recebe o valor "null" quando o processo 
        // de repetição atingir o final do arquivo texto 
        //Ler quantidade de numeros
        Quantidade = Integer.valueOf(linha);
                  
        
        for (int i = 0; i < Quantidade; i++) {
            //Ler os numeros
            String numero = lerArq.readLine();
            
            for (int j = 0; j < numero.length(); j++) {
                int valor = Integer.parseInt("" + numero.charAt(j));
                if (j == 0){
                    atual = raizes.buscaRaiz(valor);
                    if (atual == null){
                        atual = raizes.addNovaRaiz(valor);
                    }
                }
                else {
                    NoArvore aux = atual.buscaNoArvore(valor);
                    if (aux == null){
                        aux = atual.addNoArvore(valor);
                    }
                    atual = aux;
                }
            }
        
            
        }
        
        for (int i = 0; i < raizes.getRaizes().size(); i++) {
            NoArvore temp = raizes.getRaizes().get(i);
//          //Conta os numeros
            temp.ContaNosArvore();
        }
        //Imprimi a quantidade de Nós
        System.out.println(RaizesArvores.getContadorDeNos());
        
    }
}
