public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // int weight = 58;
        // int height = 180;
        int index = service.calculate(45, 180);
        System.out.println(("Индекс массы тела:   ") + (index));
    }
}