package de.bbq.java.vce.Iz0804v2;

interface Rideable {

// Original Line:	public String ride() { return "riding "; }
	public abstract String ride(); 
}

class Horse implements Rideable {

public String ride() { return "cantering "; }

}

class Icelandic extends Horse implements Rideable {

public String ride() { return "tolting "; }

}

class TestRideable {

public static void main(String[] args) {

Rideable r1 = new Icelandic();

Rideable r2 = new Horse();

Horse h1 = new Icelandic();

System.out.println(r1.ride() + r2.ride() + h1.ride());

}

}
