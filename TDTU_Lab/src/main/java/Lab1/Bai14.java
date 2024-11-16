/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai14 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        vendingMachine();
    }
    
    @SuppressWarnings("empty-statement")
    public static void vendingMachine() {
        int op;
        int money, change;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Coca");
            System.out.println("2. Pessi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Sutdown Machine");
            System.out.println("Please enter the number: ");
            op = sc.nextInt();
            
            switch (op) {
                case 1 -> {
                    System.out.print("The price of Coca is: 2$, please enter the amount of money: \n");
                    money=sc.nextInt();
                    change = money - 2;
                    if (change > 0) 
                        System.out.printf("Your change is %d$\n", change);
                    else 
                        System.out.println("Not enough money to buy this item. Please select again.");
                }
                    case 2 -> {
                        System.out.print("The price of Pessi is: 2$, please enter the amount of money: \n");
                        money=sc.nextInt();
                        change = money - 2;
                        if (change > 0)
                            System.out.printf("Your change is %d$\n", change);
                        else
                            System.out.println("Not enough money to buy this item. Please select again.");
                }
                    case 3 -> {
                        System.out.print("The price of Sprite is: 2$, please enter the amount of money: \n");
                        money=sc.nextInt();
                        change = money - 2;
                        if (change > 0)
                            System.out.printf("Your change is %d$\n", change);
                        else
                            System.out.println("Not enough money to buy this item. Please select again.");
                }
                    case 4 -> {
                        System.out.print("The price of Snack is: 2$, please enter the amount of money: \n");
                        money=sc.nextInt();
                        change = money - 2;
                        if (change > 0)
                            System.out.printf("Your change is %d$\n", change);
                        else
                            System.out.println("Not enough money to buy this item. Please select again.");
                }
                    case 5 -> System.out.println("Machine is shutting down.");
                default -> System.out.println("Invalid choice!");
            }
        }while (op != 5);
    }
}
