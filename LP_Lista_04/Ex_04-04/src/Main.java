public class Main {
    public static void main(String[] args) {

        System.out.println("Celsius\tFahrenheit");
        System.out.println("---------------------");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (9.0 / 5) * celsius + 32;
            System.out.println(celsius + "\t------ " + fahrenheit);

        }
    }
}
