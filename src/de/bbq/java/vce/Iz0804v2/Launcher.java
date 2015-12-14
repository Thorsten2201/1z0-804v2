package de.bbq.java.vce.Iz0804v2;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
	private void navigate() {
		System.out.println("Ausgabe der Programms: \r\n");
		switch (this.input) {
		case 1:
			Painting.main(null);
			break;
		case 2:
			Fibonacci q = new Fibonacci(10);
			Date d1 = new Date();
			q.compute();
			Date d2 = new Date();
			long diff = d2.getTime() - d1.getTime();
			System.out.println("Time in milliseconds: " + diff + " seconds.");   
			Fibonacci qb = new Fibonacci(10);
			Date d1b = new Date();
			qb.compute();
			Date d2b = new Date();
			long diffb = d2b.getTime() - d1b.getTime();
			System.out.println("Time in milliseconds: " + diffb + " seconds diffenent way.");   			
			break;
		case 3:
			CompareTest.main(null);
			break;
		case 4:
			Garden.main(null);
			break;
		case 5:
			Main.main(null);
			break;
		case 6:
			Print01.main(null);
			break;	
		case 7:
			TestRideable.main(null);
			break;
		case 8:
			Director.main(null);
			break;
		case 9:
			try {
				SleepOtherThread.main(null);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				showMessage(e.getLocalizedMessage());
			}
			break;		
		case 10:
			// The program Prints each Record with a valid connection because it compiles fine
			TestSQL.main(null);
			break;					
		case 11:

			break;					
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	// Returns promt-text
	private String getSubSection(StringBuffer header) {
		String name = null;
		int i = 0;
		header.setLength(0);
		header.append("Bitte wählen sie das Beispiel:");
		name = ++i + ". Painting (Pastel, *Enamel, Fresco, *Gouache)\r\n";
		name += ++i + ". Fibonacci \r\n";
		name += ++i + ". CompareTest \r\n";		
		name += ++i + ". Garden \r\n";		
		name += ++i + ". What is the result? \r\n";	
		name += ++i + ". We have 002 Blue pants that cost $24,99\r\n";
		name += ++i + ". Rideable\r\n";	
		name += ++i + ". John Harry\r\n";	
		name += ++i + ". SleepOtherThread\r\n";	
		name += ++i + ". Assume that the SQL query returns records.\r\n";		
		name += ++i + ". Programm beenden";
		this.exitInput = i;
		return name;
	}
	/////////////////////////////////////////////////////////////////////////////////////
	
	private Scanner scanner = new Scanner(System.in);
	private StringBuffer header = new StringBuffer();

	private int exitInput = 0;

	private int input;

	public boolean cont = true;

	public static void main(String[] args) {
		Launcher l = new Launcher();
		l.Start(true);
	}

	public void Start(boolean init) {
		if (init) {
			System.out.println("Willkommen zum VCE-Debugger.");
			showPromt();
			while (getInput()) {
				if (this.input >= exitInput) {
					this.cont = false;
				}
				if (!this.cont) {
					System.out.println("Programm beendet.");
					break;
				} else {
					navigate();
					showPromt();
				}
			}
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////
	// Input handling
	private void showPromt() {
		String out = getSubSection(this.header);
		this.header.append("\r\n" + out);
		System.out.println();
		System.out.println(this.header.toString());
	}

	private boolean getInput() {
		this.input = scanInput();
		if (this.input > this.exitInput) {
			scanner.close();
			return false;
		}
		return true;
	}

	private int scanInput() {
		String s = "";
		try {
			s = scanner.nextLine();
		} catch (Exception e) {
			s = "1";
		}
		StringTokenizer t = new StringTokenizer(s);
		Integer ret = 0;
		try {
			ret = Integer.parseUnsignedInt(s);
		} catch (Exception ex) {
		}
		try {
			ret = Integer.parseUnsignedInt(t.nextToken());
		} catch (Exception e) {

		}
		return ret;
	}

	public void showMessage(String... messages) {
		StringBuffer st = new StringBuffer();
		for (int index = 0; index < messages.length; index++) {
			st.append(messages[index]);
			if (index != messages.length - 1) {
				st.append("\n\r");
			}
		}
		System.out.println(st.toString());
		getInput();
		// continue while loop
	}

	// MessageBox for external code
	public String showInput(String s) {
		System.out.println(s);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		return input;
	}

	public int showConfirm(String s, boolean cancel) {
		System.out.println(s + "\r\n1:Ja 2:Nö" + (cancel ? " 3:Abbruch!" : ""));
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			return showConfirm(s, cancel); // (cancel?3:2);
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////


}
