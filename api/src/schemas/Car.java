package schemas;

public class Car extends Vehicule {
    private int numberOfSeats;
    public Car(String brand, String model,double rentalRatePerDay, int numberOfSeats){
        super(brand,model,rentalRatePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    public void displayDetails(){
        super.desplayDetails();
        System.out.println("Number of Seats:" + this.numberOfSeats );
    }
}


