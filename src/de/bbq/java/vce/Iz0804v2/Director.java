package de.bbq.java.vce.Iz0804v2;

class Pupil {

String name = "unknown";

public String getName() {return name;}

}

class John extends Pupil {

String name = "John";

}

class Harry extends Pupil {

String name = "Harry";

public String getName() {return name;}

}

public class Director {

public static void main(String[] args) {

Pupil p1 = new John();

Pupil p2 = new Harry();

System.out.print(p1.getName() + " ");

System.out.print(p2.getName());

}

}
