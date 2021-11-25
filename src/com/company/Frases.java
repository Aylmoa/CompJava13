package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
public class Frases {


    ArrayList<String> lista= new ArrayList<>();
    Frases(){}
    public ArrayList<String> getLista() {
        return lista;
    }
    public  void randomi(){
        Random random= new Random();
        for (int i = 0; i < 10; i++) {
            String ola="";
            for (int j = 0; j < 4; j++) {
                int o= random.nextInt(10);
                switch (o){
                    case 0:
                        ola=ola+"Xenomorfo es el nombre del alien en Alien ";
                        break;
                    case 1:
                        ola=ola+"La programación ";
                        break;
                    case 2:
                        ola=ola+"Como dirían por ahí ";
                        break;
                    case 3:
                        ola=ola+"Es muy eficiente ";
                        break;
                    case 4:
                        ola=ola+"Pero es necesario ";
                        break;
                    case 5:
                        ola=ola+"Pensar que esto es al azar ";
                        break;
                    case 6:
                        ola=ola+"Pero me dijeron que no ";
                        break;
                    case 7:
                        ola=ola+"El cafe es muy rico ";
                        break;
                    case 8:
                        ola=ola+"Estaba jugando halo infinite ayer ";
                        break;
                    case 9:
                        ola=ola+"A veces pienso que ";
                        break;
                    case 10:
                        ola=ola+"Zion es el nombre de una ciudad ";
                        break;
                    default:
                        System.out.println("Hubo un problema en el switch case");
                }
            }
            lista.add(ola);
        }
    }

    public void mostrarLista(){
        for (String ola:lista) {
            System.out.println(ola);}
    }

    public static ArrayList<String> acomodoAlfa(ArrayList<String> test){
        Collections.sort(test);
        return test;
    }
    public static ArrayList<String> acomodoTamaño(ArrayList<String> test){
        test.sort(Comparator.comparingInt(String::length));
        return test;
    }
}