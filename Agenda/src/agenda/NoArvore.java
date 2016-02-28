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
public class NoArvore {
    
    private int valor;
    private ArrayList<NoArvore> nosArvore;
    
    public NoArvore (int valor) {
        this.valor = valor;
        this.nosArvore = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public ArrayList<NoArvore> getNosArvore() {
        return nosArvore;
    }
    
    public NoArvore addNoArvore (int valor){
        NoArvore novoNo = new NoArvore(valor);
        this.nosArvore.add(novoNo);
        return novoNo;
    }
    
    public NoArvore buscaNoArvore (int valor) {
        for (NoArvore temp : this.nosArvore) {
            if (temp.getValor() == valor){
                return temp;
            }
        }
        return null;
    }
    
    public void ContaNosArvore (){
//        System.out.println("" + valor);
        RaizesArvores.ContadorDeNosMaisMais();
        for (NoArvore noArvore : nosArvore) {
            noArvore.ContaNosArvore();
        }
    }
    
}
