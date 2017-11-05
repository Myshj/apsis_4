package models.named.types;

import models.named.Named;

public class TypeOfPosition extends Named {
    public TypeOfPosition(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_positions WHERE id=?";
}
