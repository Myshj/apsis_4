package models.dated.traits;

import models.Specialist;
import models.named.types.TypeOfRole;

import java.util.Date;

public class Role extends SpecialistTrait {
    public static final String getByPkString = "SELECT * FROM roles WHERE type=? AND specialist=?";
    private TypeOfRole type;

    public Role(
            Specialist specialist,
            Date gained,
            TypeOfRole type
    ) {
        super(specialist, gained);
        this.type = type;
    }

    public TypeOfRole getType() {
        return type;
    }

    public void setType(TypeOfRole type) {
        this.type = type;
    }
}
