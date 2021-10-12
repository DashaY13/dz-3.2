public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massa = 76.0;
        double height = 1.78;
        double BodyMassIndex = service.calculate(massa, height);
        System.out.println(BodyMassIndex);
        }
    }
