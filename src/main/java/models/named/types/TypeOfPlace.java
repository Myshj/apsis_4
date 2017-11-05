package models.named.types;

import models.named.Named;

public class TypeOfPlace extends Named {
    public TypeOfPlace(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_places WHERE id=?";
}
