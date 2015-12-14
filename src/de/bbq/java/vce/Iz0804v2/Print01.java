package de.bbq.java.vce.Iz0804v2;

import java.io.PrintStream;

public class Print01 {

public static void main(String[] args) {

double price = 24.99;

int quantity = 2;

String color = "Blue";

// insert code here. Line ***
System.out.printf("We have$03d$s pants that cost $$3.2f.\n", quantity, color, price);

// original Line:	String out = System.out.format("We have %03d %s pants that cost $%3.2f.", quantity, color, price);
@SuppressWarnings("unused")
PrintStream out1 = System.out.format("We have %03d %s pants that cost $%3.2f.", quantity, color, price);
System.out.println(out1); 

String out = String.format("We have %03d %s pants that cost $%3.2f.\n", quantity, color, price);System.out.println(out);
System.out.printf("We have %03d %s pants that cost $%3.2f.\n", quantity, color, price);
System.out.printf("We have %s%spants that cost $%s.\n", quantity, color, price);
System.out.format("We have 002 Blue pants that cost $3.2f.\n", quantity, color, price);
}

}
