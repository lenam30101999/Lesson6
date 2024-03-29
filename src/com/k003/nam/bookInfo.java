package com.k003.nam;

import java.util.Scanner;

public class bookInfo {
        protected int code;
        protected String name;
        protected String author;
        protected String publisher;
        protected String major;
        protected int number;

        public bookInfo(){
            name = "";
            author = "";
            publisher = "";
            code = 0;
            major = "";
            number = 0;
        }

        public void Input(){
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter code: ");
            code = scan.nextInt();

            System.out.println("Enter name of book: ");
            scan.nextLine();
            name = scan.nextLine().trim();

            System.out.println("Enter the author: ");
            //scan.nextLine();
            author = scan.nextLine().trim();

            System.out.println("Enter the publisher: ");
            //scan.nextLine();
            publisher = scan.nextLine().trim();

            System.out.println("Enter number of book: ");
            number = scan.nextInt();
        }

        public void Output(){
            System.out.println(code + "\t\t" + name + "\t\t" + author + "\t\t" + publisher + "\t\t" + major + "\t\t" + number);
        }
}
