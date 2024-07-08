public class BmiService {

    public int calculate(double heightMeter, int weightKg) {

        int index;
        index = (int) (weightKg / (heightMeter * heightMeter));

        return index;

    }
}
