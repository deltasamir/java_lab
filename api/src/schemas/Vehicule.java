package schemas;

public class Vehicule {
    private String brand;
    private String model;
    private double rentalRatePerDay;

    public Vehicule( String brand, String model, double rentalRatePerDay){
        this.brand = brand;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }
    public double getRentalRatePerDay(int day){
        return rentalRatePerDay * day;
    }

    public void desplayDetails(){
        System.out.println("Brand:" + this.brand);
        System.out.println("Model:" + this.model);
    }
}


