package models.named.consumers;

import models.Specialist;
import models.named.Subunit;

public class ConsumerOfElectricity extends Consumer {
    public static final String getByIdString = "SELECT * FROM consumers_of_electricity WHERE id=?";

    private float nominalPower;
    private float averageConsumptiomPerDay;
    private float nominalCurrent;
    private float maximalCurrent;
    private float nominalVoltage;
    private float maximalVoltage;

    public float getNominalPower() {
        return nominalPower;
    }

    public void setNominalPower(float nominalPower) {
        this.nominalPower = nominalPower;
    }

    public float getAverageConsumptiomPerDay() {
        return averageConsumptiomPerDay;
    }

    public void setAverageConsumptiomPerDay(float averageConsumptiomPerDay) {
        this.averageConsumptiomPerDay = averageConsumptiomPerDay;
    }

    public float getNominalCurrent() {
        return nominalCurrent;
    }

    public void setNominalCurrent(float nominalCurrent) {
        this.nominalCurrent = nominalCurrent;
    }

    public float getMaximalCurrent() {
        return maximalCurrent;
    }

    public void setMaximalCurrent(float maximalCurrent) {
        this.maximalCurrent = maximalCurrent;
    }

    public float getNominalVoltage() {
        return nominalVoltage;
    }

    public void setNominalVoltage(float nominalVoltage) {
        this.nominalVoltage = nominalVoltage;
    }

    public float getMaximalVoltage() {
        return maximalVoltage;
    }

    public void setMaximalVoltage(float maximalVoltage) {
        this.maximalVoltage = maximalVoltage;
    }

    public ConsumerOfElectricity(
            int id,
            String name,
            Specialist responsible,
            Subunit subunit,
            float nominalPower,
            float averageConsumptiomPerDay,
            float nominalCurrent,
            float maximalCurrent,
            float nominalVoltage,
            float maximalVoltage
    ) {
        super(id, name, responsible, subunit);
        this.nominalPower = nominalPower;
        this.averageConsumptiomPerDay = averageConsumptiomPerDay;
        this.nominalCurrent = nominalCurrent;
        this.maximalCurrent = maximalCurrent;
        this.nominalVoltage = nominalVoltage;
        this.maximalVoltage = maximalVoltage;
    }
}
