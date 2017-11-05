package models.named;

public class Subunit extends Named {
    public Subunit(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM subunits WHERE id=?";
}
