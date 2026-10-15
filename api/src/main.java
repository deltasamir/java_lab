import schemas.*;

public class main {
    public static void main(String[] args) {
       Car car1 = new Car("Toyota","Hilux",44.99,5);
       Car car2 = new Car("Nissan","Patrol",52,7);
       Car car3 = new Car("Toyota","Land cruiser",52.9,7);


    Truck truck1 = new Truck("Man","TGS 41.520",120,41);
    Truck truck2 = new Truck("Scania","S580 V8",130,40);
    Truck truck3 = new Truck("Mercedes","Actros 1845",140,45);

    Vehicule[] fleet = {car1,car2,car3,truck1,truck2,truck3};
int ndays = 5;
    //desplay the objects
System.out.println("=== FLEET RENTAL DETAILS ===");
    for (Vehicule v : fleet){
        v.desplayDetails();
        double costFor5days = v.getRentalRatePerDay(ndays);
        System.out.println("Rental cost for " + ndays + ":"+ costFor5days);
        System.out.println("====================================");
    }
    }
}


