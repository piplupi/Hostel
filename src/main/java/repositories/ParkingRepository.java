package repositories;

import entities.Parking;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ParkingRepository {

    private EntityManager entityManager;

    public ParkingRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    public List<Parking> getParking() {
//        String query = "select p from Parking p";
//        TypedQuery<Parking> typedQuery = entityManager.createQuery(query, Parking.class);
//        List<Parking> parkingList = typedQuery.getResultList();
//        return parkingList;
//    }

        public Parking insertParking(Parking car){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(car);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return car;
    }

}
