package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        System.out.println("girilen sayıları küçükyen büyüğe doğru sıralama yapıcaz");
        Scanner input =new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("lütfen il sayıyı giriniz");
        number1= input.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        number2=input.nextInt();
        System.out.println("lütfen üçüncü sayıyı giriniz");
        number3=input.nextInt();
        if ((number1>number2)&&(number1>number3)){
            if (number2>number3){
                System.out.println("küçükten büyüğe doğru sıralama"+number3+"<"+number2+"<"+number1);
            }else{
                System.out.println("küçükten büyüğe doğru sıralama"+number2+"<"+number3+"<"+number1);
            }
        }else if ((number2>number1)&&(number2>number3)){
            if (number1>number3){
                System.out.println("küçükten büyüğe doğru sıralama"+number3+"<"+number1+"<"+number2);
            }else{
                System.out.println("küçükten büyüğe doğru sıralama"+number1+"<"+number3+"<"+number2);
            }


        }else{
            if (number1>number2){
                System.out.println("küçükten büyüğe sıralama "+number2+"<"+number1+"<"+number3);
            }else if (number2>number1){
                System.out.println("küçükten büyüğe sıralama "+number1+"<"+number2+"<"+number3);

            }

        }



    }
}
