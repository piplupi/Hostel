package services;

import configuration.JPAConfiguration;
import repositories.ParkingRepository;
import entities.Parking;

public class ParkingServices {

    private final ParkingRepository repository;

    public ParkingServices() {this.repository = new ParkingRepository(JPAConfiguration.getEntityManager());}

    public Parking insertParking(Parking car) {
        return repository.insertParking(car);
    }

}
