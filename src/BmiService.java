public class BmiService {
    public double calculate(double massa, double height) {
        double BodyMassIndex = massa / (height * 2);
        return BodyMassIndex;
    }
}
