public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000;
            boolean registered = true;
            long expected = 30;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            System.out.println(actual);
    }
}