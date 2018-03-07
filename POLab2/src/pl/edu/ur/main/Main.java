package pl.edu.ur.main;

import java.util.Scanner;


public class Main {

   public static void main(String[] args) {
        
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
 */
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





 
}}
