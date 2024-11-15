package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kaprekar {

    public int kaprekarOp(int numeros){
        String numString=""+numeros;
        String[] numerosDivididos=numString.split("");
        List<Integer> numDivEnteros=new ArrayList<>();
        for (String num:numerosDivididos){
            numDivEnteros.add(Integer.parseInt(num));
        }
        List<Integer> lista1=ordenar(numDivEnteros);
        List<Integer> lista2=ordenar(numDivEnteros);
        int numero1;
        int numero2;
        numero1=lista1.get(3)*1000;
        numero1+=lista1.get(2)*100;
        numero1+=lista1.get(1)*10;
        numero1+=lista1.get(0);
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

    private List<Integer> ordenar(List<Integer> numDivEnteros) {
        Collections.sort(numDivEnteros);
        return numDivEnteros;
    }

    public int kaprekarOp(int numeros){
        String numString=""+numeros;
        String[] numerosDivididos=numString.split("");
        List<Integer> numDivEnteros=new ArrayList<>();
        for (String num:numerosDivididos){
            numDivEnteros.add(Integer.parseInt(num));
        }
        List<Integer> lista1=ordenar(numDivEnteros);
        List<Integer> lista2=ordenar(numDivEnteros);
        int numero1;
        int numero2;
        if(lista2.size()>3)
            numero1=lista1.get(3)*1000;
        numero1+=lista1.get(2)*100;
        numero1+=lista1.get(1)*10;
        numero1+=lista1.get(0);
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

    private List<Integer> ordenar(List<Integer> numDivEnteros) {
        Collections.sort(numDivEnteros);
        return numDivEnteros;
    }

    public int itKaprekar(int num){
        int result = kaprekarOp(num);
        int result2 = 0;
        int contador = 1;
        while (contador < 3){
            result = result2;
            result2 = kaprekarOp(result);

            contador++;
        }
        return contador;
    }
}
