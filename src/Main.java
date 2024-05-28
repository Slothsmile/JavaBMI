public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKG = 98;
        int heightCM = 187;
        int BMI = service.calculate(weightKG, heightCM);
        System.out.println(BMI);
    }
}
