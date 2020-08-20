package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey there! What's your name?");

        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();

        System.out.println("Hi " + name + "! How old are you?");
        int age= scanner.nextInt();

        System.out.println(name + " is " + age + " years old!");
        scanner.close();
    }
}
