public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println();
        System.out.println("1.62 / 55");
        System.out.println(service.calculate(1.62,55 ));

        System.out.println();
        System.out.println("1.78 / 90");
        System.out.println(service.calculate(1.78,90 ));

        System.out.println();
        System.out.println("1.55 / 45");
        System.out.println(service.calculate(1.55,45 ));


    }
}