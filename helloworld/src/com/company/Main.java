package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {


       public static void main(String[] args)  {
         for (int i = 0; i < 5; i++) {
             System.out.println("Hi there");

         }

           int b = 0;
         while (b<10){
             System.out.println(2*b);
             b++;
         }

         int c = 27;
         if(c==27){
             System.out.println("Boo!");
         }
           Random random = new Random();
           System.out.println(random.nextInt(100));
        }
    }

