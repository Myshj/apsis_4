package models.named.types;

import models.named.Named;

public class TypeOfRole extends Named {
    public TypeOfRole(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_roles WHERE id=?";
}
