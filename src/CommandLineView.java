import java.util.Iterator;

public class CommandLineView {
    private RentABike rentaBike;
    public CommandLineView(){
        rentaBike = new RentABike("Rowery Brucea");
    }

    public void printAllBikes(){
        System.out.println(rentaBike.toString());
        Iterator iter = rentaBike.getBikes().iterator();
        while(iter.hasNext()){
            Bike bike = (Bike)iter.next();
            System.out.println(bike.toString());
        }
    }
}
