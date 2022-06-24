public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 58;
        int height = 170;
        int index = service.calculate(58, 170);
        System.out.println(("Индекс массы тела:   ") + (index));
    }
}