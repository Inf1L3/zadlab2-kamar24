/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Lukasz
 */
public class Zadania {

    

    static void zadanie1() {
        //Zadanie 3
   
       double[] tab= new double[10];
       int i;
       for(i=0;i<10;i++)
       {
           System.out.println("Podaj element tablicy nr: "+i);
       Scanner odczyt = new Scanner(System.in);
        tab[i] = odczyt.nextDouble(); 
        
       }
       int z = 1;
       while(z!=0){
           System.out.println("1. Wypisywanie od pierwszego elementu.");
           System.out.println("2. Wypisywanie od ostatniego elementu.");
           System.out.println("3. Wypisywanie elementów nieparzystych.");
           System.out.println("4. Wypisywanie elementów parzystych.");
           System.out.println("0. Koniec pracy.");
           
           Scanner odczyt= new Scanner(System.in);
           z=odczyt.nextInt();
           
           switch(z){
              case 1:
               for(i=0;i<10;i++){
               System.out.println(tab[i]);}
             break;
             case 2:
               for(i=9;i>0;i--){
               System.out.println("Elemenet tablicy od ostatniego: "+i+"= "+tab[i]);}
             break;
             case 3:
               for(i=0;i<10;i=i+2){
               System.out.println("Elemenet tablicy nieparzyste: "+i+"= "+tab[i]);}
             break;
             case 4:
               for(i=1;i<10;i=i+2){
               System.out.println("Elemenet tablicy parzyste: "+i+"= "+tab[i]);}
             break;
               
               
           }
           
       }
       
   
    }
    //ZADANIE 4
    static void zadanie2() {
        double[] tab= new double[10];
       int i;
       double suma = 0,srednia = 0;
       double iloczyn=1;
       double min,max=0;
       for(i=0;i<10;i++)
       {
           System.out.println("Podaj element tablicy nr: "+i);
       Scanner odczyt = new Scanner(System.in);
        tab[i] = odczyt.nextDouble(); 
        }
       int z = 1;
       while(z!=0){
           System.out.println("1. Suma tablicy.");
           System.out.println("2. Iloczyn tablicy.");
           System.out.println("3. Srednia tablicy");
           System.out.println("4. Minimalna wartosc tablicy.");
           System.out.println("5. Maksymalna wartosc tablicy");
           System.out.println("0. Koniec pracy.");
           
           Scanner odczyt= new Scanner(System.in);
           z=odczyt.nextInt();
           
           switch(z){
              case 1:
               for(i=0;i<10;i++){
                suma=suma+tab[i];
                }
               System.out.println("Suma tablicy= "+suma);
             break;
             case 2:
               for(i=0;i<10;i++){
                iloczyn=iloczyn*tab[i];
                 }
               System.out.println("Iloczyn tablicy= "+iloczyn);
             break;
             case 3:
                 suma=0;
               for(i=0;i<10;i++){
                suma=suma+tab[i];}
                srednia=suma/10;
                System.out.println("Srednia tablicy= "+srednia);
                
             break;
             case 4:
                 min=tab[0];
                 for(i=1;i<10;i++){
                 if(min>tab[i]){
                     min=tab[i];
                 }
                 }
                 System.out.println("Min tablicy= "+min);
                 
             break;
             case 5:
               max=tab[0];
                 for(i=1;i<10;i++){
                 if(max<tab[i]){
                     max=tab[i];
                 }
                 }
                 System.out.println("Max tablicy= "+max);
                 break;
       
       
       
       
       

       
    }}}
    //Zadanie 6
    static void zadanie3(){
    int z=1,i=0;
        for(i=0;i>=0;i=z) 
        {if(z<0)break;else{
         System.out.println("Podaj liczbe calkowita, ujemna konczy program");
      Scanner odczyt= new Scanner(System.in);
           z=odczyt.nextInt();
        }}
        
    
} 
    //Zadanie 7
    
    static void zadanie4(){
    int ilosc;
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj ilość elementów tablicy");
    ilosc = in.nextInt();
 
    int[] tab = new int[ilosc];
    for(int i=0; i<tab.length; i++){
    System.out.println("Podaj element tablicy:");
    tab[i] = in.nextInt();
        }
    b_sort(tab);
        }
    static void b_sort(int tab[]){
    int temp;
    int zmiana = 1;
    while(zmiana > 0){
    zmiana = 0;
    for(int i=0; i<tab.length-1; i++){
    if(tab[i]>tab[i+1]){
    temp = tab[i+1];
    tab[i+1] = tab[i];
    tab[i] = temp;
    zmiana++;
    }
    }
    }
    for(int i=0; i<tab.length; i++){
    System.out.print(tab[i]+" ");
    }
    }}





    
