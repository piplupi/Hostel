package repositories;

import entities.Package;
import entities.Rooms;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class RoomsRepository {
    private EntityManager entityManager;

    public RoomsRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
