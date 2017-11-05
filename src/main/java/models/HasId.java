package models;

public abstract class HasId extends Model {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HasId(int id) {

        this.id = id;
    }
}
