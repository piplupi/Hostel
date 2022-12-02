package entities;

public class Person {
    private int id;
    private String voornaam;
    private String achternaam;

    public int getId () {return id;}

    public void setId () {this.id = id;}

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


}
