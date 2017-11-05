package models.named.types;

import models.named.Named;

public class TypeOfMeter extends Named {
    public TypeOfMeter(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_meters WHERE id=?";
}
