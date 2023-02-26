public class Main {
    public static int check(int leapYear) {
        if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println(leapYear + " является високосным");
        } else {
            System.out.println(leapYear + " не является високосным");
        }
        return leapYear;
    }

    public static void operatingSystem(int client_OS, int DeviceYear) {
        if (client_OS == 1 && DeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (DeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (client_OS == 0 && DeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void delivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает двое суток.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает трое суток.");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
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
        int distance = 95;
        delivery(distance);
    }
}