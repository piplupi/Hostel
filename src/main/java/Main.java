import entities.ParkingLot;
import entities.Person;
import services.ParkingLotServices;
import services.PersonServices;

public class Main {
    public static void main(String[] args) {

//        PackageServices packageServices = new PackageServices();
//        Package insertPackage1 = new Package("room only");
//        Package insertPackage2 = new Package("room+food+parking");
//        Package insertPackage3 = new Package("room+food");
//        Package insertPackage4 = new Package("room+parking");
//
//        packageServices.insertPackage(insertPackage1);
//        packageServices.insertPackage(insertPackage2);
//        packageServices.insertPackage(insertPackage3);
//        packageServices.insertPackage(insertPackage4);
//
//        List<Package> packages = packageServices.getPackages();
//        packages.forEach( type -> {
//            System.out.println("ID = " + type.getId()
//                    + " Type = " + type.getType());
//        });

                        //        ParkingLotServices parkingLotServices = new ParkingLotServices();
                        //        ParkingLot insertParking1Lot = new ParkingLot("PL0398");
                        //        parkingLotServices.insertParking(insertParking1Lot);
                        //
                                PersonServices personServices = new PersonServices();
                                Person insertPerson1 = new Person("Mabel", "Johns", 1 , 4, 5);
                                personServices.insertPerson(insertPerson1);

    }
}