public class Main {
    public static void main(String[] args){
        CommandLineView clv = new CommandLineView();
        RentABike rentaBike = new ArrayListRentABike("Rowery Brucea");
        clv.setRentaBike(rentaBike);
        clv.printAllBikes();
    }
}
