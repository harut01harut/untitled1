package com.company;





public class Main {




    public static void main(String[] args){

         int[] i = new int[100];


        for (int b=1; b<=100; b++ )
        {

            if(b%5==0 && b%7==0) {
                System.out.print("fuzzbuzz");
            }else if(b%5==0){
                System.out.print("fuzz");
            }else if(b%7==0){
                System.out.print("buzz");
            }else{
                System.out.print(b);
            }
            System.out.print(" ");
        }


    }

    }

