
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 78; // указывать занчение в килограммах
        int height = 180; // указывать значение в сантиметрах
        int bodyMassIndex = (int) service.calculate(mass,height);
        System.out.println("Ваш вес: " + mass + "кг. Ваш рост: " + height + "см.");
        System.out.println("Индекс массы тела для выших параметров = " + bodyMassIndex);

    }
}