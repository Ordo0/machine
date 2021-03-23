package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {
        action();
    }
    
    public static void action() {
        String action;
        do {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.next();
            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back " +
                            "- to main menu: ");
                    String choiceCoffee = sc.next();
                    switch (choiceCoffee) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            if (water >= 250 && beans >= 16 && cups >= 1) {
                                water -= 250;
                                beans -= 16;
                                cups -= 1;
                                money += 4;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            if (water >= 350 && beans >= 20 && cups >= 1 && milk >= 75) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups -= 1;
                                money += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            if (water >= 200 && beans >= 12 && cups >= 1 && milk >= 100) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups -= 1;
                                money += 6;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += sc.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;

                case "remaining":
                    info();
                    break;
            }
        } while (!action.equals("exit"));
    }
    public static void info() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
