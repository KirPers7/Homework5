public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        byte clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");

        short clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        short year = 2024;
        short yearCount = (short) ((year - 1584) % 4);
        short leapYearExclude = (short) ((year - 1584) % 100);
        short leapYearInclude = (short) ((year - 1584) % 400);

        if (leapYearInclude == 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else if (leapYearExclude == 0 && year >= 1584) {
            System.out.println(year + " год не является високосным");
        } else if (yearCount == 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();

        //Задание 5
        System.out.println("Задание 5");

        byte monthNumber = 12;

        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("зима");
                    break;
            }
        } else {
            System.out.println("номер месяца больше 12");
        }
    }
}