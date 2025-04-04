public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задание №1");
        int clientOS = 0;
        if (clientOS <= 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задание №2");
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычное версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычное версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задание №3");
        int year = 2024;
        if (year >= 1584) {
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        }
        System.out.println();
        System.out.println("Задание №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                ;
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }
}