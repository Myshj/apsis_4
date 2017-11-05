package models.named.types;

import models.named.Named;

public class TypeOfHeatEnergy extends Named {
    public TypeOfHeatEnergy(int id, String name) {
        super(id, name);
    }

    public static final String getByIdString = "SELECT * FROM types_of_heat_energy WHERE id=?";
}
