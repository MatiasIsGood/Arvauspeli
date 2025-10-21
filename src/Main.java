package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nimi = "Teppo";
        int arvaukset = 0;

        System.out.println("Arvaa nimi: ");

        while(true){
            String arvaus = input.nextLine();

            if (arvaus.equalsIgnoreCase(nimi)){
                System.out.println("Onnea, arvasit oikein.");
                break;
            } else if(arvaus.equalsIgnoreCase("loppu")){
                break;
            }
            else {
                System.out.println("Väärin, yritä uudelleen.");
                arvaukset++;
            }

        }
        System.out.println("Sinä arvasit väärin " + arvaukset + " kertaa.");
        input.close();
    }
}