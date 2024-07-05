public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double height_meter = 1.87;
        int weight_kg = 98;
        int index = service.calculate(height_meter, weight_kg);


        System.out.println(index);
    }
}