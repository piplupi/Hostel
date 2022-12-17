package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("ALL")
@Entity
@Table
public class Rooms {

    @Id
    @GeneratedValue
    private Integer id;
    private Person personId;
    private ParkingLot parkingLotId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public ParkingLot getParkingId() {
        return parkingLotId;
    }

    public void setParkingId(ParkingLot parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

}
