/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author André Cândido
 */
public class RaizesArvores {
    
    private static int contadorDeNos;
    private ArrayList <NoArvore> raizes;

    public static int getContadorDeNos() {
        return contadorDeNos;
    }

    public static void ContadorDeNosMaisMais() {
        RaizesArvores.contadorDeNos++;
    }
    
    public RaizesArvores (){
        this.raizes = new ArrayList<>();
        contadorDeNos = 0;
    }
    
    public NoArvore addNovaRaiz (int valor){
        NoArvore novoNo = new NoArvore(valor);
        this.raizes.add(novoNo);
        return novoNo;
    }
    
    public NoArvore buscaRaiz(int valor) {
        for (NoArvore temp : this.raizes) {
            if (temp.getValor() == valor){
                return temp;
            }
        }
        return null;
    }

    public ArrayList<NoArvore> getRaizes() {
        return raizes;
    } 
    
    
}
