public class BmiService {

    public int calculate(double height_meter, int weight_kg) {

        int index;
        index = (int) (weight_kg / (height_meter * height_meter));

        return index;

    }
}
