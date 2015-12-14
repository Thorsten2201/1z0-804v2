package de.bbq.java.vce.Iz0804v2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestSQL {
private static Connection conn;

public static void main(String[] args) {

try {
	
String query = "SELECT * FROM Item";

Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery(query);

ResultSetMetaData rsmd = rs.getMetaData(); // Line 14

int colCount = rsmd.getColumnCount();

while (rs.next()) {

for (int i = 1; i <= colCount; i++) {

System.out.print(rs.getObject(i) + " "); // Line 17

}

System.out.println();

}
} catch (Exception e) {
	// it has no compile errors, exceptions are not asked for
}}
}
