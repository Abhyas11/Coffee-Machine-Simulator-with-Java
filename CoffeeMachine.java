package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        //displayInformation(water, milk, coffee, cups, money);
        while(run) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();


            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String val = scanner.nextLine();
                    switch (val) {
                        case "1":
                            if(water<250){
                                System.out.println("Sorry, not enough water!");
                            } else if (coffee<16) {
                                System.out.println("Sorry, not enough coffee beans");
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups");
                            } else {
                                water -= 250;
                                coffee -= 16;
                                money += 4;
                                cups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            //displayInformation(water, milk, coffee, cups, money);
                            break;
                        case "2":
                            if(water<350){
                                System.out.println("Sorry, not enough water!");
                            } else if (milk<75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffee < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                            }else {
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                money += 7;
                                cups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            //displayInformation(water, milk, coffee, cups, money);
                            break;
                        case "3":
                            if(water<200){
                                System.out.println("Sorry, not enough water!");
                            } else if (milk<100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffee < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                            }else {
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                money += 6;
                                cups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            //displayInformation(water, milk, coffee, cups, money);
                            break;
                        case "back":
                            break;

                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    cups += scanner.nextInt();
                    scanner.nextLine();
                    //System.out.println();
                    //water += w;
                    //milk += m;
                    //coffee += c;
                    //cups += cup;
                    //displayInformation(water, milk, coffee, cups, money);
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    System.out.println();
                    money = 0;
                    //displayInformation(water, milk, coffee, cups, money);
                    break;
                case "remaining":
                    displayInformation(water, milk, coffee, cups, money);
                    break;
                case "exit":
                    run = false;


            }
        }

    }

    public static void displayInformation(int water, int milk, int coffee, int cups, int money){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
}
