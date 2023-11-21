import java.util.Scanner;

public enum TransportType {
    CAR {
        @Override
        public double getPrice() {
            return 0.1;
        }
    },
    BUS {
        @Override
        public double getPrice() {
            return 0.05;
        }
    },
    TRUCK {
        @Override
        public double getPrice() {
            return 0.02;
        }
    };

    public abstract double getPrice();

    public double calculateTravelCost(double distance) {
        Double calculator = getPrice() * distance;
        System.out.println("Сиз берген " + distance + "км аралык учун сизден : "+ calculator + "$ акча талап кылынат. ");

return 0;
    }
}













