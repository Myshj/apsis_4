package models;

import models.named.types.TypeOfMeter;

public class Meter extends HasId {
    public static final String getByIdString = "SELECT * FROM meters WHERE id=?";
    private Place place;
    private TypeOfMeter type;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public TypeOfMeter getType() {
        return type;
    }

    public void setType(TypeOfMeter type) {
        this.type = type;
    }

    public Meter(int id, Place place, TypeOfMeter type) {
        super(id);
        this.place = place;
        this.type = type;
    }
}
