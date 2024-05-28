public class BmiService {
    public int calculate(int weightKG, int heightCM) {
        int result = weightKG / (heightCM * heightCM);
        return result;
    }
}
