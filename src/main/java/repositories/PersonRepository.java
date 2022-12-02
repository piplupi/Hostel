package repositories;

import entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PersonRepository {

    private EntityManager entityManager;

    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Person> getPersonen() {
        String query = "select a from Personen a";
        TypedQuery<Person> typedQuery = entityManager.createQuery(query, Person.class);
        List<Person> persoonList = typedQuery.getResultList();
        return persoonList;
    }

    public Person insertPerson(Person info){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(info);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return info;
    }

}
