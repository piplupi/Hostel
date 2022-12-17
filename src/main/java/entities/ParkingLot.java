package entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class ParkingLot {
    @Id
    @GeneratedValue
    private int id;
    private String car;

    public ParkingLot(String car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String Car) {
        this.car = Car;
    }

}
