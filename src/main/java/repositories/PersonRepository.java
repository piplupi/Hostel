package repositories;

import entities.Package;
import entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.security.SecureRandom;
import java.util.List;

public class PersonRepository {

    private EntityManager entityManager;

    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    public List<Person> getPerson() {
//        String query = "select p from Person p";
//        TypedQuery<Person> typedQuery = entityManager.createQuery(query, Person.class);
//        List<Person> personList = typedQuery.getResultList();
//        return personList;
//    }

    public Person insertPerson(Person voornaam, Person achternaam , Person packageId, Person parkingId, Person roomId){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(insertPerson(voornaam, achternaam , packageId, parkingId, roomId));
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return insertPerson(voornaam, achternaam , packageId, parkingId, roomId);
    }

}
