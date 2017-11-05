package models.named.types;

import models.named.Named;

public class TypeOfQualification extends Named {
    public TypeOfQualification(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_qualifications WHERE id=?";
}
