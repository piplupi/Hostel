package entities;

public class Rooms {

    private Integer id;
    private Package packageId;
    private Parking parkingId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Package getPackageId() {
        return packageId;
    }

    public void setPackageId(Package packageId) {
        this.packageId = packageId;
    }

    public Parking getParkingId() {
        return parkingId;
    }

    public void setParkingId(Parking parkingId) {
        this.parkingId = parkingId;
    }

}
