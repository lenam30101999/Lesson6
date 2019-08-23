package com.k003.nam;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        bookInfo[] array = new bookInfo[50];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sum of book: ");
        int number = scan.nextInt();

        for (int i = 0; i < number; i++){
            System.out.println("1.IT");
            System.out.println("2.LA");
            System.out.println("3.LS");

            System.out.println("Choose: ");
            int choice = scan.nextInt();

            switch (choice){
                case 1:{
                    array[i] = new IT();
                    array[i].Input();
                    break;
                }

                case 2:{
                    array[i] = new LA();
                    array[i].Input();
                    break;
                }

                case 3:{
                    array[i] = new LS();
                    array[i].Input();
                    break;
                }
            }
        }

        System.out.println("Code\t\tName\t\tAuthor\t\tPublisher\t\tMajor\t\tNumber");
        for (int i = 0; i < number; i++)
            array[i].Output();
    }
}
