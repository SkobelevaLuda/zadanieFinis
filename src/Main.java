public class Main {
    public static void main(String[] args) {

        // задание 1.

        System.out.println(" Задание 1. ");
        int clientOs = 1;
        int clientAndroid = 0;
        int client = 1;
        if (client == 0 || client == 1) {
        }
        if (client == 1) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        }
        if (client == 0) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }

        // задание 2.

        System.out.println(" Задание 2. ");
        int clientDeviceYear = 2015;
        int clietOs = 1;
        int clietAndroid = 0;
        int clien = 1;
        if (clien == 0 || clien == 1) {
        }
        if (clien == 1) {

            if (clientDeviceYear >= 2015) {
                System.out.println(" Установите обычную версию приложения для iOS по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            }

        }
        if (clien == 0) {

            if (clientDeviceYear >= 2015) {
                System.out.println(" Установите обычную версию приложения для Android по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            }
        }

        // задание 3.
        System.out.println(" Задание 3 ");
        int year = 2020;
        if ((year % 4 == 0 && year % 400 == 0) ^ year % 100 != 0) {
            System.out.println(" Год високосный! ");
        } else {
            System.out.println(" Год не високосный! ");
        }
        // задание 4.
        System.out.println(" Задание 4 ");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            int day = 1;
            System.out.println(" Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int day = 2;
            System.out.println(" Потребуется дней: " + day);
        } else {
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                int day = 3;
                System.out.println(" Потребуется дней: " + day);


            }


        }

        // задача 5.
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println(" Январь ");
                break;
            case 2:
                System.out.println(" Февраль ");
                break;
            case 3:
                System.out.println(" Март ");
                break;
            case 4:
                System.out.println(" Апрель ");
                break;
            case 5:
                System.out.println("Май ");
                break;
            case 6:
                System.out.println("Июнь ");
                break;
            case 7:
                System.out.println("Июль ");
                break;
            case 8:
                System.out.println("Август ");
                break;
            case 9:
                System.out.println("Сентябрь ");
                break;
            case 10:
                System.out.println("Октябрь ");
                break;
            case 11:
                System.out.println("Ноябрь ");
                break;
            case 12:
                System.out.println("Декабрь ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
        }
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println("Такого дня не существует");
        }


    }
}
