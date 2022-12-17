package repositories;

import entities.ParkingLot;
import jakarta.persistence.EntityManager;

public class ParkingLotRepository {

    private EntityManager entityManager;

    public ParkingLotRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


//    public List<Parking> getParking() {
//        String query = "select p.id ";
//        TypedQuery<Parking> typedQuery = entityManager.createQuery(query, Parking.class);
//        List<Parking> parkingList = typedQuery.getResultList();
//        return parkingList;
//    }

//    "select wi.id, p.id pid, p.naam pnaam, a.id aid, a.afdeling afdeling_naam" +
//            " from werkplaats_informatie wi" +
//            " join persoon p" +
//            " on p.id = wi.persoon_id" +
//            " join afdeling a  " +
//            " on a.id = wi.afdeling_id";

        public ParkingLot insertParking(ParkingLot car){
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
