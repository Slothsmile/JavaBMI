public class BmiService {
    public int calculate(int weightKG, double heightM) {
        double result;
        result = weightKG / (heightM * heightM);
        return (int) result;
    }
}
