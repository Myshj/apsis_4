package models;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class Specialist extends HasId {
    private static final String getAllString = "SELECT * FROM specialists;";
    private static final String getByIdString = "SELECT * FROM specialists WHERE id=?;";
    private static final String deleteByIdString = "DELETE FROM specialists WHERE id=?;";
    private static final String insertString = "INSERT INTO specialists (id, first_name, second_name, last_name) VALUES (?, ?, ?, ?);";


    private String firstName;
    private String secondName;
    private String lastName;

    public static Specialist getById(
            Connection conn,
            int id
            ) throws SQLException{
        PreparedStatement statement = conn.prepareStatement(getByIdString);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        rs.first();
        return getSpecialistFromResultSet(rs);
    }

    public static Set<Specialist> getAll(
            Connection conn
    ) throws SQLException{
        HashSet<Specialist> ret = new HashSet<>();
        PreparedStatement statement = conn.prepareStatement(getAllString);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            ret.add(getSpecialistFromResultSet(rs));
        }
        return ret;
    }

    public static void deleteById(
            Connection conn,
            int id
    ) throws SQLException{
        PreparedStatement statement = conn.prepareStatement(deleteByIdString);
        statement.setInt(1, id);
        statement.execute();
    }

    public static void insert(
            Connection conn,
            int id,
            String firstName,
            String secondName,
            String lastName
    ) throws SQLException{
        PreparedStatement statement = conn.prepareStatement(insertString);
        statement.setInt(1, id);
        statement.setString(2, firstName);
        statement.setString(3, secondName);
        statement.setString(4, lastName);
        statement.execute();
    }

    private static Specialist getSpecialistFromResultSet(ResultSet rs) throws SQLException {
        return new Specialist(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("second_name"),
                rs.getString("last_name")
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Specialist(int id, String firstName, String secondName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
