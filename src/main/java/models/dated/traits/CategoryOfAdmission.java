package models.dated.traits;

import models.Specialist;
import models.named.types.TypeOfCategoryOfAdmission;

import java.util.Date;

public class CategoryOfAdmission extends SpecialistTrait {
    public static final String getByPkString = "SELECT * FROM categories_of_admission WHERE type=? AND specialist=?";
    private TypeOfCategoryOfAdmission type;

    public TypeOfCategoryOfAdmission getType() {
        return type;
    }

    public void setType(TypeOfCategoryOfAdmission type) {
        this.type = type;
    }

    public CategoryOfAdmission(
            Specialist specialist,
            Date gained,
            TypeOfCategoryOfAdmission type
    ) {

        super(specialist, gained);
        this.type = type;
    }
}
