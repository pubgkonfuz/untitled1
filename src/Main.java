import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(getAgeAndTemperature(25, 40));
        System.out.println(getAgeAndTemperature(10, 47));
        System.out.println(getAgeAndTemperature(18, -29));
        System.out.println(getAgeAndTemperature(15, -20));
        System.out.println(getAgeAndTemperature(22, 30));
        System.out.println(generateRandomAge());
    }

    public static String getAgeAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }

    // mashanloskm

    //дополнительный д/з
    public static int generateRandomAge() {
        // Random = генерирует случайное число
        Random random = new Random();
        // nextInt() - означает что это целое число то что мы пишем в скобках это до какого числа он может генерировать
        int age = random.nextInt(100);
        return age;
    }
}







        






