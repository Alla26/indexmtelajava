public class BmiService {
    public int calculate(int weight, int height) {
        int result;
        result = weight * 10_000 / (height * height);
        return result;
    }
}
