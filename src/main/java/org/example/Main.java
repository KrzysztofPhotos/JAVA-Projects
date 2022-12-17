package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maciej");
        int liczba = 24;
        dodatniaUjemna(liczba);
        System.out.println("\n");
        System.out.println(jakaJestLiczba(liczba));
    }

    public static void dodatniaUjemna(int number){
        if (number == 0){
            System.out.println("Liczba równa 0");
        }
        else if (number < 0) {
            System.out.println("Liczba ujemna");
        }
        else {
            System.out.println("Liczba dodatnia");
        }
    }
    public static boolean czydodatnia(int number){
        boolean wynik;
        if(number >= 0){
            wynik = true;
        }
        else {
            wynik = false;
        }
        return wynik;
    }
    public static String czyJestDodatnia2(boolean result){
        String zmiennaKoncowa;
        if(result == true){
            zmiennaKoncowa = "Liczba jest dodatnia";
        }
        else {
            zmiennaKoncowa = "Liczba jest ujemna";
        }
        return zmiennaKoncowa;
    }
    public static String jakaJestLiczba(int number){
        String wynik;
        if (number < 0){
            wynik = "Liczba jest mniejsza od zera";
        } else if (number == 0) {
            wynik = "Liczba jest równa 0";
        } else {
            wynik = "Liczba jest większa od zera";
        }
        return wynik;
    }
}