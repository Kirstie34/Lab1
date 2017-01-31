package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        boolean areaAndPerimeter = true;

        while (areaAndPerimeter) {
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        System.out.println();

        System.out.print("Enter Length: ");
        float length = scan1.nextFloat();

        System.out.print("Enter Width: ");
        float width = scan1.nextFloat();

        System.out.print("Enter Height: ");
        float height = scan1.nextFloat();

        System.out.println("Area: " + (length * width));

        System.out.println("Perimeter: " + ((length * 2) + (width * 2)));

        System.out.println("Volume: " + (length * width * height));
        System.out.println();

        System.out.print("Continue? (y/n): ");
        char yN = scan1.next().charAt(0);

        System.out.println();

        if(yN == 'y') {
            areaAndPerimeter = true;
        } else {
                areaAndPerimeter = false;
                System.out.println("Bye!");




          }
         }
        }

    }

