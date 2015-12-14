package de.bbq.java.vce.Iz0804v2;

public class Main {
public static void main(String[] arg0) {
Vehicle v = new SportsCar();
System.out.println(v.goes());
Tank t = (Tank) v;
System.out.println(t);
}

}
class Vehicle {
public String goes() {
return "goes ";
};
}

class SportsCar extends Vehicle {
public String goes() {
return "fast ";
};
}

class Tank extends Vehicle {
public String goes() {
return "slow ";
};
}
