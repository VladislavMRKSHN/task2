import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar;

        // Запрос суммы
        System.out.print("Введите сумму в долларах: ");
        dollar = scanner.nextDouble();

        // Проверка, чтобы сумма была положительная
        if (dollar < 0) {
            System.out.println("Сумма не может быть отрицательна. Введите положительное значение.");
            return;
        }

        // Вычисление
        double euro = dollar * 0.85;

        // Вывод результата
        System.out.println("Сумма долларов " + dollar + " равна " + euro + " евро");
    }
}
