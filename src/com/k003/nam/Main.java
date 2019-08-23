package com.k003.nam;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        bookInfo[] array = new bookInfo[50];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sum of book: ");
        int number = scan.nextInt();

        for (int i = 0; i < number; i++){
            array[i] = new bookInfo();
            array[i].Input();
        }

        System.out.println("Code\t\tName\t\tAuthor\t\tPublisher\t\tMajor\t\tNumber");
        for (int i = 0; i < number; i++)
            array[i].Output();
    }
}
