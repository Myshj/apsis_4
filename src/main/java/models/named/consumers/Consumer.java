package models.named.consumers;

import models.Specialist;
import models.named.Named;
import models.named.Subunit;

public abstract class Consumer extends Named {
    private Specialist responsible;
    private models.named.Subunit Subunit;

    public Specialist getResponsible() {
        return responsible;
    }

    public void setResponsible(Specialist responsible) {
        this.responsible = responsible;
    }

    public models.named.Subunit getSubunit() {
        return Subunit;
    }

    public void setSubunit(models.named.Subunit subunit) {
        Subunit = subunit;
    }

    public Consumer(int id, String name, Specialist responsible, models.named.Subunit subunit) {
        super(id, name);
        this.responsible = responsible;
        Subunit = subunit;
    }
}
