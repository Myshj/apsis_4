package models;

import java.util.Date;

public class Indication extends Model {
    public static final String getByPkString = "SELECT * FROM indications WHERE meter=? AND place=?";
    private Specialist entered;
    private Meter meter;
    private float value;
    private Date date;

    public Specialist getEntered() {
        return entered;
    }

    public void setEntered(Specialist entered) {
        this.entered = entered;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Indication(
            Specialist entered,
            Meter meter,
            float value,
            Date date
    ) {

        this.entered = entered;
        this.meter = meter;
        this.value = value;
        this.date = date;
    }
}
