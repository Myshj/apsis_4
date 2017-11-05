package models.named.types;

import models.named.Named;

public class TypeOfCategoryOfAdmission extends Named {
    public TypeOfCategoryOfAdmission(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_categories_of_admission WHERE id=?";
}
