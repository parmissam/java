package ir.ac.kntu;

public class Toy {

    private double basePrice;

    protected ToySize size;

    public Toy(double basePrice, ToySize size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getPrice(){
        switch (size){
            case SMALL:
                return basePrice;
            case MEDIUM:
                return 1.5 * basePrice;
            case LARGE:
                return 2 * basePrice;
            default:
                return 0;
        }
    }

    public double getPrice(double discount){
        if (discount >= 0 && discount <= 100){
            return (100 - discount ) * getPrice() /100;
        }
        return getPrice();
    }

    public double getBasePrice(){
        return basePrice;
    }
}
