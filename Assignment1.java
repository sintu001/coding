package org.example.Assignment;

import java.util.*;

public class Assignment1 {
        public static void main(String[] arg) {
            String group = null;
            Scanner scanner = new Scanner(System.in);

            System.out.println("what is your name : ");
            String name = scanner.nextLine();

            System.out.println("what is your age : ");
            int age = scanner.nextInt();

            System.out.println("what is your group : ");
            String blood_group = scanner.next();

            if (age >= 20) {
                group = "RED";
            } else if (age >= 15 && age < 20) {
                group = "BLUE";
            } else if (age >= 10 && age < 15) {
                group = "YELLOW";
            }
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Blood Group : " + blood_group);
            System.out.println("\n------------------------------------------------------------------------------------------------------------------");
            System.out.println("Your group is " + group);


        }
    }





