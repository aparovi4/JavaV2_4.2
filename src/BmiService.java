public class BmiService {
    public int calculate(int weight, double height) {
        double index = weight / height / height;
        int result = (int) index;
        return result;
    }
}
