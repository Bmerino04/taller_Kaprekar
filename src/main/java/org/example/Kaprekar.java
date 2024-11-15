package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kaprekar {

    public int kaprekarOp(int numeros){
        String numString=""+numeros;
        String[] numerosDivididos=numString.split("");
        List<Integer> numDivEnteros=new ArrayList<>();
        for (String num:numerosDivididos){
            numDivEnteros.add(Integer.parseInt(num));
        }
        List<Integer> lista1=ordenarMaximo(numDivEnteros);
        List<Integer> lista2=ordenarMinimo(numDivEnteros);
        int numero1;
        int numero2;
        numero1=lista1.get(0)*1000;
        numero1+=lista1.get(1)*100;
        numero1+=lista1.get(2)*10;
        numero1+=lista1.get(3);
        numero2=lista2.get(0)*1000;
        numero2+=lista2.get(1)*100;
        numero2+=lista2.get(2)*10;
        numero2+=lista2.get(3);
        System.out.println(numero1 + "+" + numero2);
        return numero1 - numero2;
    }

    private int restar(int maximo, int minimo) {
        int variable=0;
        variable=maximo-minimo;
        return 0;
    }

    private List<Integer> ordenarMinimo(List<Integer> numDivEnteros) {
        Collections.sort(numDivEnteros);
        return numDivEnteros;
    }

    private List<Integer> ordenarMaximo(List<Integer> numDivEnteros) {
        Collections.sort(numDivEnteros);
        Collections.reverse(numDivEnteros);
        return numDivEnteros;
    }

    public int itKaprekar(int num){
        return 0;
    }
}
