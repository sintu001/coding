import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tax Calculator App");
        System.out.println("-------Welcome-------");
        System.out.print("Enter total person count: ");
        int personCount = sc.nextInt();

        String[] names = new String[personCount];
        long[] incomes = new long[personCount];

        for (int i = 0; i < personCount; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter " + names[i] + "'s Annual Income: ");
            incomes[i] = sc.nextLong();
        }

        System.out.println("\n-------------------------");

        for (int i = 0; i < personCount; i++) {
            calculateTax(names[i], incomes[i]);
        }

        sc.close();
    }

    public static void calculateTax(String name, long income) {
        double taxAmount = 0;

        if (income >= 300000) {
            taxAmount = income * 0.20;
        } else if (income >= 100000) {
            taxAmount = income * 0.10;
        }

        System.out.println(name + " : ₹ " + taxAmount);
    }
}
