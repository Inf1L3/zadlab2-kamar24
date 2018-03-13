package pl.edu.ur.main;

import java.util.Scanner;


public class Main {

   @SuppressWarnings("empty-statement")
   public static void main(String[] args) {
       int z=1;
       while(z!=0){
       System.out.println("1. Zadanie 1");
           System.out.println("2. Zadanie 2");
           System.out.println("3. Zadanie 3");
           System.out.println("4. Zadanie 4");
           System.out.println("0. Koniec pracy.");
       Scanner odczyt= new Scanner(System.in);
       z= odczyt.nextInt();
       switch(z){
           case 1:
           {Zadania.zadanie1();
           break;
           }
           case 2:
           {Zadania.zadanie2();
            break;  
            }
           case 3:
           {Zadania.zadanie3();
           break;
           }
           case 4:
           {Zadania.zadanie4();
            break;
           }}}}}
        
       
               
    /*
       zadanie 3 4 6 7
       Scanner odczyt= new Scanner(System.in);
    
    int zmienna;
     
    while (zmienna!=0){
    zmienna=odczyt.nextInt();
   
    switch(zmienna){
    case 1:
       System.out.println("styczen");
       break;
    case 2:
       System.out.println("luty");
       break;
    case 3:
       System.out.println("marzec");
       break;
    case 4:
       System.out.println("kwiecien");
       break;
    case 5:
       System.out.println("maj");
       break;
    case 6:
       System.out.println("czerwiec");
       break;
    case 7:
       System.out.println("lipiec");
       break;
    case 8:
       System.out.println("sierpien");
       break;
    case 9:
       System.out.println("wrzesien");
       break;
    case 10:
       System.out.println("pazdziernik");
       break;
    case 11:
       System.out.println("listopad");
       break;
    case 12:
       System.out.println("grudzien");
       break;
}}
    
    
    
   
    
  
        
    int b=0;
    int c=0;
    int skok=1;
    do{
            c+=skok;
            b+=1;
            System.out.println("c= "+c);
            System.out.println("Obieg pentli nr "+(b));
            
   }
    while(c<1000);
    }  
       
    int b=0;
    int c=0;
    int skok=1;
    while(c<1000){
            c+=skok;
            b+=1;
            System.out.println("c= "+c);
            System.out.println("Obieg petli nr "+(b));
            
   
    
    
    }
   
  
     
    for(int i=20;i>=0;i--){
        if(i==2 || i==6 || i==9 || i==15 || i==19){
        continue;}
        System.out.println(i);
   
   }
 
int a,b,c,delta;

a=b=c=0;
Scanner deltaa= new Scanner(System.in);
System.out.println("Podaj a:");
a=deltaa.nextInt();
Scanner deltab= new Scanner(System.in);
System.out.println("Podaj b:");
b=deltab.nextInt();
Scanner deltac= new Scanner(System.in);
System.out.println("Podaj c:");
c=deltac.nextInt();
delta=b*b-4*a*c;

System.out.println("Delta= "+delta);
System.out.println("Delta= "+delta);
System.out.println("Delta= "+delta); 

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
       
   */

