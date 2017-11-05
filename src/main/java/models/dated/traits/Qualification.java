package models.dated.traits;

import models.Specialist;
import models.named.types.TypeOfQualification;

import java.util.Date;

public class Qualification extends SpecialistTrait {

    public static final String getByPkString = "SELECT * FROM qualifications WHERE type=? AND specialist=?";
    private TypeOfQualification type;

    public TypeOfQualification getType() {
        return type;
    }

    public void setType(TypeOfQualification type) {
        this.type = type;
    }

    public Qualification(
            Specialist specialist,
            Date gained,
            TypeOfQualification type
    ) {
        super(specialist, gained);
        this.type = type;
    }
}
