import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListRentABike implements RentABike {

    private String storeName;
    final List bikes = new ArrayList();

    public ArrayListRentABike(String storeName){
        this.storeName = storeName;
        bikes.add(new Bike("Shimano", "Roadmaster", 20, "11111", 15, "Dobry"));
        bikes.add(new Bike("Shimano1", "Roadmaster1", 20, "11111", 15, "Dobry"));
        bikes.add(new Bike("Shimano2", "Roadmaster2", 20, "11111", 15, "Dobry"));
        bikes.add(new Bike("Shimano3", "Roadmaster3", 20, "11111", 15, "Dobry"));
    }

    public ArrayListRentABike(){
        this("Rowery Brucea");
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String toString() {return "RentABike: " + storeName;}

    public List getBikes() {
        return bikes;
    }

    public Bike getBike(String serialNo){
        Iterator iter = bikes.iterator();
        while (iter.hasNext()){
            Bike bike = (Bike)iter.next();
            if(serialNo.equals(bike.getSerialNo()))
                return bike;
        }
        return null;
    }
}
