package de.qytera.webpage.provider;

/*
import com.mysql.cj.Session;
import org.bouncycastle.util.Strings;
import org.testng.annotations.DataProvider;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProviderDB {


    @DataProvider(name = "dp")
    public static Object[][] getDataDB() throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        Session session = null;



            // Connect method #2
            String dbURL2 = "jdbc:postgresql://localhost:5432/test";
            String user = "postgres";
            String pass = "test";

            conn = DriverManager.getConnection(dbURL2, user, pass);


            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM data;");


            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            int firstUsefulColumn = 2;

            List<List<String>> rows = new ArrayList<>();

            for (int row = 0; rs.next(); row++) {
                rows.add(new ArrayList<>());
                System.out.println(rows);
                for (int i = firstUsefulColumn; i <= columnsNumber; i++) {
                    rows.get(row).add(rs.getString(i));
                    System.out.println(rows);
                }
            }

            Object[][] content = new Object[rows.size()][];

            for (int i = 0; i < rows.size(); i++) {
                content[i] = rows.get(i).toArray();
            }

            System.out.println(Arrays.toString(content));

            while (rs.next()) {

                for (int i = 2; i <= columnsNumber; i++) {
                    if (i > 1) {
                        //System.out.print(", ");

                        String columnValue = rs.getString(i);
                        System.out.print(columnValue + ";"); // + " " + rsmd.getColumnName(i));
                        String[] columns = Strings.split(columnValue, ';');
                        content[i] = new String[columns.length];
                        System.out.println(content[i]);

                    }
                }
                System.out.println("");
            }


            rs.close();
            stmt.close();
            conn.close();

            if (conn != null) {
                System.out.println("Connected to database #2");
            }

            return content;



    }
}

*/
