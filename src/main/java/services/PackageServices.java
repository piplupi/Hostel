package services;

import configuration.JPAConfiguration;
import entities.Package;
import repositories.PackageRepository;

import java.util.List;

public class PackageServices {

    private final PackageRepository repository;

    public PackageServices() {this.repository = new PackageRepository(JPAConfiguration.getEntityManager());}

    public List<Package> getPackages() {
        return repository.getPackage();
    }

    public Package insertPackage(Package type) {
        return repository.insertPackage(type);
    }

}


