package models;

import models.named.consumers.Consumer;
import models.named.types.TypeOfPlace;

public class Place extends Model {
    public static final String getByIdString = "SELECT * FROM places WHERE id=?";
    private Consumer consumer;
    private TypeOfPlace type;

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public TypeOfPlace getType() {
        return type;
    }

    public void setType(TypeOfPlace type) {
        this.type = type;
    }

    public Place(
            Consumer consumer,
            TypeOfPlace type
    ) {

        this.consumer = consumer;
        this.type = type;
    }
}
