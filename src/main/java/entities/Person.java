package entities;

public class Person {
    private int id;
    private String voornaam;
    private String achternaam;
    private int packagesId;
    private int parkingId;
    private int roomId;

    public Person(String voornaam, String achternaam, int packagesId, int parkingId, int roomId) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getPackagesId() {
        return packagesId;
    }

    public void setPackagesId(int packagesId) {
        this.packagesId = packagesId;
    }

    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


}
