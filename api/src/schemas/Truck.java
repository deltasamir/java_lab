package schemas;

public class Truck extends Vehicule{
    private double cargoCapacityTons;

    public Truck(String brand , String model , double rentalRatePerDay,double cargoCapacityTons){
        super(brand,model,rentalRatePerDay);
        this.cargoCapacityTons = cargoCapacityTons;

    }

    public double calculateRentalCost(int days){
        return getRentalRatePerDay(days)+ 50;
    }

    public void displayDetails(){
        super.desplayDetails();
        System.out.println("Cargo Capacity : " + this.cargoCapacityTons + " Tons");
    }

    
}
