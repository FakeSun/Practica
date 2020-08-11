package com.company;

import java.util.ArrayList;
import java.util.List;



public class RepeatedLinesRemover {

    public static void main(String[] args) {
        String texto = "insertar texto aqui";

        String[] lista = texto.split("\n");
        List<String> listaNoRep = new ArrayList<String>();
        
        for(String nombre: lista) {
            boolean repetido = false;
            for(String nombre2: listaNoRep) {
                if(nombre.equals(nombre2))
                    repetido = true;
            }
            if(!repetido)
                listaNoRep.add(nombre);
        }
        for(String nombre : listaNoRep) {
            System.out.println(nombre);
        }
    }
}
