package services;

import configuration.JPAConfiguration;
import entities.Person;
import repositories.PersonRepository;

public class PersonServices {

    private final PersonRepository repository;

    public PersonServices() {
        this.repository = new PersonRepository(JPAConfiguration.getEntityManager());
    }


    public Person insertPerson(Person voornaam , Person achternaam, Person packageId, Person parkingId, Person roomId) {
        return repository.insertPerson(voornaam, achternaam, packageId, parkingId, roomId);
    }

}
