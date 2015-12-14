package de.bbq.java.vce.Iz0804v2;

public class Garden {

	public static void main(String[] args) {
		// Original Line: Embryophyta e = new new Embryophyta();
		Embryophyta e = new Garden().new Embryophyta();
		// Original Line: Embryophyta c = new Carrot();
		Carrot c = new Garden().new Carrot();
		System.out.print(e.growthDirection() + c.growthDirection());
	}

	// Original Line: private class Plant {
	abstract class Plant {
		abstract String growthDirection();
	}

	class Carrot extends Embryophyta {
		String growthDirection() {
			return "down ";
		}
	}

	public class Embryophyta extends Plant {
		String growthDirection() {
			return "Up ";
		}
	}

}
