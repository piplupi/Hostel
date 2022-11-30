import entities.Package;
import repositories.PackageRepository;
import services.PackageServices;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PackageServices packageServices = new PackageServices();

        Package insertPackage1 = new Package("food and room");
        Package insertPackage2 = new Package("only room");

        packageServices.insertPackage(insertPackage1);
        packageServices.insertPackage(insertPackage2);

        List<Package> packages = packageServices.getPackages();
        packages.forEach( type -> {
            System.out.println("ID = " + type.getId()
                    + " Type = " + type.getType());
        });


    }
}