package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista= new ArrayList<>();

        Frases test= new Frases();
        test.randomi();
        test.mostrarLista();
        lista=test.getLista();

        metodoAnonimo(lista);

        System.out.println("\n****Utilizando Lambda***\n");
        lista.clear();
        test.randomi();
        test.mostrarLista();
        lista=test.getLista();

        metodoLambda(lista);

        System.out.println("\n****Utilizando referencias***\n");
        lista.clear();
        test.randomi();
        test.mostrarLista();
        lista=test.getLista();

        metodoReferencia(lista);

    }

    public static void mostrarLista( ArrayList<String> lista){
        for (String ola:lista) {
            System.out.println(ola);}
    }

    public static void metodoAnonimo(ArrayList<String> lista){

        System.out.println("\n****Por clase anonima***\n");
        Anon anon= new Anon(){
            public void acomodoAlfa( ArrayList<String> lista) {
                Collections.sort(lista);
                System.out.println("-----Acomodo alfabetico----");
                mostrarLista(lista);
            }public void acomodotamaño( ArrayList<String> lista) {
                lista.sort(Comparator.comparingInt(String::length));
                System.out.println("-----Segundo acomodo por tamaño----");
                mostrarLista(lista);
            }
        };
        anon.acomodoAlfa(lista);
        anon.acomodotamaño(lista);
    }

    public static void metodoLambda(ArrayList<String> lista){

        ArrayList<String> finalLista = lista;
        Lambdaa sorteoAlfa=(ArrayList<String> list) -> {
            Collections.sort(finalLista);
            return finalLista;
        };
        Lambdaa sortetama=(ArrayList<String> list)->{
            finalLista.sort(Comparator.comparingInt(String::length));
            return finalLista;
        };

        System.out.println("-----Acomodo alfabetico----");
        mostrarLista(sorteoAlfa.organizar(finalLista));
        System.out.println("-----Segundo acomodo por tamaño----");
        mostrarLista(sortetama.organizar(finalLista));
    }
    public static void metodoReferencia(ArrayList<String> lista){
        Lambdaa alfa = Frases::acomodoAlfa;
        Lambdaa tama= Frases::acomodoTamaño;

        System.out.println("-----Acomodo alfabetico----");
        mostrarLista(alfa.organizar(lista));

        System.out.println("-----Segundo acomodo por tamaño----");
        mostrarLista(tama.organizar(lista));
    }
}
