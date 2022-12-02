package entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Parking {
    @Id
    @GeneratedValue
    private int id;
    private String Car;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String Car) {
        this.Car = Car;
    }

}
