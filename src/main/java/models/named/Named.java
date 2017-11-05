package models.named;

import models.HasId;
import models.Model;

public abstract class Named extends HasId {

    public Named(int id, String name) {

        super(id);
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Named(id=%d, name=%s)",
                getId(),
                name
        );
    }
}
