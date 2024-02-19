package com.skilldistillery.makechange;

import java.util.Scanner;
import java.lang.Math;

public class MakeChangeHomework {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("How much is the purchase price?");
        double purchasePrice = kb.nextDouble();
        System.out.println("How much money was tendered from the customer?");
        double tenderedAmount = kb.nextDouble();
        kb.close();

        int purchaseCents = (int) (purchasePrice * 100);
        int tenderedCents = (int) (tenderedAmount * 100);

        int changeCents = tenderedCents - purchaseCents;

        if (changeCents < 0) {
            System.out.println("Incorrect amount: $" + Math.abs(changeCents) / 100.0 + " still owed!");
            return;
        } 
        else if (changeCents == 0) {
            System.out.println("You've given the exact amount, thank you and have a good day!");
            return;
        }

        System.out.println("Your change is: $" + changeCents / 100 + "." + (changeCents % 100) / 10 + changeCents % 10);

	        int twentyBills = changeCents / 2000;
	        changeCents %= 2000;

	        int tenBills = changeCents / 1000;
	        changeCents %= 1000;

	        int fiveBills = changeCents / 500;
	        changeCents %= 500;

	        int oneBills = changeCents / 100;
	        changeCents %= 100;

	        int quarters = changeCents / 25;
	        changeCents %= 25;

	        int dimes = changeCents / 10;
	        changeCents %= 10;

	        int nickels = changeCents / 5;
	        changeCents %= 5;

	        int pennies = changeCents;

	        if (twentyBills > 0) {
	            System.out.println(twentyBills + (twentyBills == 1 ? " $20 Bill" : " $20 Bills"));
	        }
	        if (tenBills > 0) {
	            System.out.println(tenBills + (tenBills == 1 ? " $10 Bill" : " $10 Bills"));
	        }
	        if (fiveBills > 0) {
	            System.out.println(fiveBills + (fiveBills == 1 ? " $5 Bill" : " $5 Bills"));
	        }
	        if (oneBills > 0) {
	            System.out.println(oneBills + (oneBills == 1 ? " $1 Bill" : " $1 Bills"));
	        }
	        if (quarters > 0) {
	            System.out.println(quarters + (quarters == 1 ? " quarter" : " quarters"));
	        }
	        if (dimes > 0) {
	            System.out.println(dimes + (dimes == 1 ? " dime" : " dimes"));
	        }
	        if (nickels > 0) {
	            System.out.println(nickels + (nickels == 1 ? " nickel" : " nickels"));
	        }
	        if (pennies > 0) {
	            System.out.println(pennies + (pennies == 1 ? " penny" : " pennies"));
	        }
	    }
	
	}

