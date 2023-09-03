// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CarServiceApp {
    public static void main(String[] args) {

        CarServiceStation serviceStation = new CarServiceStation();

        String carType = "Hatchback";
        String[] serviceCodes = {"BS01", "EF01"};

        String bill = serviceStation.generateBill(carType, serviceCodes);

        System.out.println("Service Bill:\n" + bill);

    }
}