public class Main {
    public static void main(String[] args) {
        int temperature = 30;
        int numberOfHumans = 45;
        boolean isSnowy = false;

        if (temperature > -20 && numberOfHumans > 20) {
            System.out.println("Можно идти гулять ");
        }

        if (isSnowy && temperature > -30) {
            System.out.println("Можно идти гулят");
        }

        if (temperature > 0 || numberOfHumans < 20) { // || - логический оператор ИЛИ (OR)
            System.out.println("Можно идти гулять");
        }

        if (isSnowy || temperature > -28 && numberOfHumans > 10) {

            System.out.println("Можно идти гулять");
        }

        if ((isSnowy || temperature > -10) && numberOfHumans == 45) {

            System.out.println("Можно идти гулять");
        }

        if (numberOfHumans != 40) {
            System.out.println("Оставайтесь дома");

        }


    }
}