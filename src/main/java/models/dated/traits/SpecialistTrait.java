package models.dated.traits;

import models.Model;
import models.Specialist;

import java.util.Date;

public abstract class SpecialistTrait extends Model {
    private Specialist specialist;
    private Date gained;

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public Date getGained() {
        return gained;
    }

    public void setGained(Date gained) {
        this.gained = gained;
    }

    public SpecialistTrait(Specialist specialist, Date gained) {

        this.specialist = specialist;
        this.gained = gained;
    }
}
