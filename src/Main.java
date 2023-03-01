public class Main {
    public static int check(int leapYear) {
        if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println(leapYear + " является високосным");
        } else {
            System.out.println(leapYear + " не является високосным");
        }
        return leapYear;
    }

    public static void operatingSystem(int client_OS, int deviceYear) {
        if (client_OS == 1 && deviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (deviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (client_OS == 0 && deviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int delivery(int deliveryDistance) {
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            return -1;

        }

        int day = 1;

          if (deliveryDistance >= 20) {
            ++day;
        }  if (deliveryDistance >= 60) {
            ++day;
        }
        //   return day;
        return day;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        check(year);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        operatingSystem(clientOS, clientDeviceYear);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int distance = 45;
        int day = delivery(distance);
        System.out.println("Доставка в пределах " + distance + " км занимает " +day+" суток.");
    }
}