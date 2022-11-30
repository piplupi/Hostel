package repositories;

import entities.Package;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PackageRepository {

    private EntityManager entityManager;

    public PackageRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Package> getPackage() {
        String query = "select p from Package p";
        TypedQuery<Package> typedQuery = entityManager.createQuery(query, Package.class);
        List<Package> packageList = typedQuery.getResultList();
        return packageList;
    }

    public Package insertPackage(Package type){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(type);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return type;
    }

}
