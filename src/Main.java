public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();



    }


    public static void Task1() {
        System.out.println("Задача №1");
        int clientOS = 3;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой оперативки не существует, купи себе нормальный телефон!");
        }

    }

    public static void Task2() {
        System.out.println("Задача №2");
        int clientDeviceYear = 2016;
        int clientOs = 0;
        int iOs = 0;
        int Android = 1;
        if (clientOs == iOs && (clientDeviceYear <= 2015 || clientDeviceYear > 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
        }

        if (clientOs == Android && (clientDeviceYear <= 2015 || clientDeviceYear > 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегчённую версию приложения для android по ссылке");

            }
        }
    }
    public static void Task3() {
        System.out.println("Задача №3");
        int year = 1992;
        boolean leapYear = (year%4==0 ) && (year%100!=0) || (year%400==0);
        if (leapYear) {
            System.out.println(year + (" год является високосным"));
        }else {
            System.out.println(year + ( " год не является високосным"));
        }
    }
    public static void Task4() {
        System.out.println("Задача №4");
        int deliveryDistance = 15;
        boolean oneDay = (deliveryDistance <20);
        if (oneDay) {
            System.out.println("Потребуется 1 день");
        }else {
            boolean twoDays = (deliveryDistance >20) && (deliveryDistance <60);
            if (twoDays) {
                System.out.println("Потребуется 2 дня");
            }else {
                boolean threedays = (deliveryDistance >60) && (deliveryDistance <100);
                if (threedays) {
                    System.out.println("Потребуется 3 дня");
                }else {
                    System.out.println("Доставка не предусмотрена");
                }
            }
        }
    }
    public static void Task5() {
        System.out.println("Задача №5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц он же январь, принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println(monthNumber + " месяц он же феврвль, принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + " месяц он же март, принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println(monthNumber + " месяц он же апрель, принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println(monthNumber + " месяц он же май, принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println(monthNumber + " месяц он же июнь, принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println(monthNumber + " месяц он же июль, принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println(monthNumber + " месяц он же август, принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println(monthNumber + " месяц он же сентябрь, принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println(monthNumber + " месяц он же октябрь, принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println(monthNumber + " месяц он же ноябрь, принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println(monthNumber + " месяц он же декабрь, принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}




