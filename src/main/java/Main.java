import models.Specialist;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String myDriver = "com.mysql.jdbc.Driver";
        Class.forName(myDriver);
        String myUrl = "jdbc:mysql://192.168.99.100:32769/mydb?useUnicode=true&characterEncoding=utf-8";
        try (
                Connection conn = DriverManager.getConnection(
                        myUrl,
                        "root",
                        "1111"
                )
        ) {


            System.out.println(Specialist.getAll(conn));
            Specialist.insert(
                    conn,
                    5,
                    "Василь",
                    "Васильович",
                    "Васильов"
            );
            System.out.println(Specialist.getAll(conn));
            Specialist.deleteById(conn, 5);
            System.out.println(Specialist.getAll(conn));
        } catch (Exception e) {
            System.err.println("Exception");
            System.err.println(e.getMessage());
        }
    }
}
