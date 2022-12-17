package services;

import configuration.JPAConfiguration;
import repositories.ParkingLotRepository;
import entities.ParkingLot;

public class ParkingLotServices {

    private final ParkingLotRepository repository;

    public ParkingLotServices() {
        this.repository = new ParkingLotRepository(JPAConfiguration.getEntityManager());
    }

    public ParkingLot insertParking(ParkingLot car) {
        return repository.insertParking(car);
    }

}

