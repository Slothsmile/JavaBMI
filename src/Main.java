public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKG = 98;
        double heightM = 1.87;
        int BMI = service.calculate(weightKG, heightM);
        System.out.println("Your BMI index is : " + BMI);
    }
}
