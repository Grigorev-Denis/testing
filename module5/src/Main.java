import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        float sum;

        while (true) {
            System.out.println("Введите количество месяцев ");
            month = sc.nextInt();
            if (month <= 0) {
                System.out.println("Количество месяцев не должно быть меньше 1");
            } else {
                break;
            }

        }

        while (true) {
            System.out.println("Введите сумму ");
            sum = sc.nextFloat();
            if (sum <= 0) {
                System.out.println("Сумма не должна быть меньше 0");
            } else {
                break;
            }

        }

        float totalMoney = sum; // Итого денег на счете

        for (int i = month; i > 0; i--){
            totalMoney = totalMoney * 1.07f;
        }

        String forPrint = String.format(Locale.US,"%.2f",totalMoney); // округляем до 2х знаков после запятой + локализуем чтоб разделитель был точкой
        System.out.println("Сумма на вкладе составляет: " + forPrint+ " рублей.");


    }
}

/*


while (month > 0) {
            totalMoney = totalMoney * 1.07f;
            month--;
        }
        */

