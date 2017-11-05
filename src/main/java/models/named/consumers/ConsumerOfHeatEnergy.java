package models.named.consumers;

import models.Specialist;
import models.named.Subunit;
import models.named.types.TypeOfHeatEnergy;

public class ConsumerOfHeatEnergy extends Consumer {

    public static final String getByIdString = "SELECT * FROM consumers_of_heat_energy WHERE id=?";

    private TypeOfHeatEnergy type;
    private float consumptionDuringSummer;
    private float consumptionDuringWinter;

    public TypeOfHeatEnergy getType() {
        return type;
    }

    public void setType(TypeOfHeatEnergy type) {
        this.type = type;
    }

    public float getConsumptionDuringSummer() {
        return consumptionDuringSummer;
    }

    public void setConsumptionDuringSummer(float consumptionDuringSummer) {
        this.consumptionDuringSummer = consumptionDuringSummer;
    }

    public float getConsumptionDuringWinter() {
        return consumptionDuringWinter;
    }

    public void setConsumptionDuringWinter(float consumptionDuringWinter) {
        this.consumptionDuringWinter = consumptionDuringWinter;
    }

    public ConsumerOfHeatEnergy(
            int id,
            String name,
            Specialist responsible,
            Subunit subunit,
            TypeOfHeatEnergy type,
            float consumptionDuringSummer,
            float consumptionDuringWinter
    ) {
        super(id, name, responsible, subunit);
        this.type = type;
        this.consumptionDuringSummer = consumptionDuringSummer;
        this.consumptionDuringWinter = consumptionDuringWinter;
    }
}
