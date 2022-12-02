import entities.Package;
import repositories.PackageRepository;
import services.PackageServices;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PackageServices packageServices = new PackageServices();

        Package insertPackage1 = new Package("room only");
        Package insertPackage2 = new Package("room+food+parking");
        Package insertPackage3 = new Package("room+food");
        Package insertPackage4 = new Package("room+parking");

        packageServices.insertPackage(insertPackage1);
        packageServices.insertPackage(insertPackage2);
        packageServices.insertPackage(insertPackage3);
        packageServices.insertPackage(insertPackage4);


        List<Package> packages = packageServices.getPackages();
        packages.forEach( type -> {
            System.out.println("ID = " + type.getId()
                    + " Type = " + type.getType());
        });

    }
}