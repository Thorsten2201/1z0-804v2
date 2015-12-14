package de.bbq.java.vce.Iz0804v2;

interface Event {

String getCategory();

}

public class CueSports {

public String getCategory() {

return "Cue sports";

}

//} // remove for Original

//public class Snooker extends CueSports implements Event { // Line 9 Original
public static class Snooker extends CueSports implements Event { // Line 9 corrected
public static void main(String[] args) {

Event obj1 = new Snooker(); // Line 11

CueSports obj2 = new Snooker(); // Line 12

System.out.print(obj1.getCategory() + ", " + obj2.getCategory());

}
} // move before 'Line 9 Original' for Original
}
//answer correct Class Snooker is public. Should be declared in a separate file.