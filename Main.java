package com.gmail.morovo1988;

import java.util.Scanner;

/**
 * Created by Дом on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controler m = new Controler();
        try {
            while (true) {
                System.out.println("1: Replenish account");
                System.out.println("2: Transfer money");
                System.out.println("3: Money conversion");
                System.out.println("4: Amount of money on the account in UAH");
                System.out.println("5: Create Client");
                System.out.println("6: Show Client");

                String s = sc.nextLine();
                switch (s) {
                    case "1":
                        m.replenishAccount();
                        break;
                    case "2":
                        m.transferMoney();
                        break;
                    case "3":
                        m.convertCurrency();
                        break;
                    case "4":
                        m.amountMoneyInUAH();
                        break;
                    case "5":
                        m.addClient();
                        break;
                    case "6":
                        m.viewClients();
                        break;
                    default:
                        return;

                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }finally {
            m.close();
        }
    }
}
