import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Car: ");
        System.out.println(TransportType.CAR.calculateTravelCost(1000));
        System.out.println("\n"+"BUS : ");
        System.out.println(TransportType.BUS.calculateTravelCost(15));
        System.out.println("\n"+"TRUCK");
        System.out.println(TransportType.TRUCK.calculateTravelCost(12));


    }


    }




