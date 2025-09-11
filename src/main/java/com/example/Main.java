package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nimi = "Teppo";

        System.out.println("Arvaa nimi: ");

        while(true){
            String arvaus = input.nextLine();

            if (arvaus.equals(nimi)){
                System.out.println("Onnea, arvasit oikein.");
                break;
            } else {
                System.out.println("Väärin, yritä uudelleen.");
            }

        }
        input.close();
    }
}