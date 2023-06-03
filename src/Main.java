public class Main {

    public static void main(String[] args) {
	task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte smallBox = 20;
        short container = 150;
        int composition = 40000;
        long hangar = 1000000000L;
        float a = 3.75f;
        double b = 7.785679;
        System.out.println("Значение переменной smallBox с типом byte равно " + smallBox);
        System.out.println("Значение переменной bigBox с типом short равно " + container);
        System.out.println("Значение переменной composition с типом int равно " + composition);
        System.out.println("Значение переменной hangar с типом long равно " + hangar);
        System.out.println("Значение переменной a с типом float равно " + a);
        System.out.println("Значение переменной b с типом double равно " + b);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float floatAnswer = 27.12f;
        System.out.println(floatAnswer);
        long longAnswer = 987678965549L;
        System.out.println(longAnswer);
        double doubleAnswer = 2.786;
        System.out.println(doubleAnswer);
        short shortAnswer1 = 569;
        System.out.println(shortAnswer1);
        short shortAnswer2 = -159;
        System.out.println(shortAnswer2);
        int intAnswer = 27897;
        System.out.println(intAnswer);
        byte byteAnswer = 67;
        System.out.println(byteAnswer);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int paper = 480;
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        System.out.println("На каждого ученика рассчитано " + paper/(firstClass+secondClass+thirdClass) + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottleMachineInTwoMinutes = 16;
        int bottleMachineInTwentyMinutes = bottleMachineInTwoMinutes * 10;
        int bottleMachineForDay = bottleMachineInTwentyMinutes * 3 * 12;
        int bottleMachineForThreeDays = bottleMachineForDay * 3;
        long bottleMachineForMonth = bottleMachineForThreeDays * 10;
        System.out.println("За 20 минут машина произвела " + bottleMachineInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleMachineForDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleMachineForThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleMachineForMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int totalWhitePaint = totalPaint / (whitePaintForOneClass + brownPaintForOneClass) * whitePaintForOneClass;
        int totalBrownPaint = totalPaint / (whitePaintForOneClass + brownPaintForOneClass) * brownPaintForOneClass;
        int totalClass = totalBrownPaint / brownPaintForOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananaWeight = 80;
        int totalBananaWeight = bananaWeight * 5;
        short oneHundredMl = 105;
        int twoHundredMl = oneHundredMl * 2;
        short iceCream = 100;
        int twoIceCreams = iceCream * 2;
        short egg = 70;
        int fourEggs = egg * 4;
        int totalWeightInGrams = totalBananaWeight + twoHundredMl + twoIceCreams + fourEggs;
        float totalWeightInKilograms = totalWeightInGrams / 1000f;
        System.out.println(totalWeightInGrams);
        System.out.println(totalWeightInKilograms);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int minWeightLoss = 250;
        int maxWeightLoss = 500;
        int totalWeightLossKg = 7;
        int totalWeightLossGr = totalWeightLossKg * 1000;
        int dayForMinWeightLoss = totalWeightLossGr / minWeightLoss;
        int dayForMaxWeightLoss = totalWeightLossGr / maxWeightLoss;
        int averageNumberOfDays = (dayForMaxWeightLoss+dayForMinWeightLoss)/2;
        System.out.println(dayForMaxWeightLoss);
        System.out.println(dayForMinWeightLoss);
        System.out.println(averageNumberOfDays);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int salaryIncrease = 10;
        int year = 12;
        long mashaSalaryIncrease = mashaSalary * salaryIncrease / 100 + mashaSalary;
        long denisSalaryIncrease = denisSalary * salaryIncrease / 100 + denisSalary;
        long kristinaSalaryIncrease = kristinaSalary * salaryIncrease / 100 + kristinaSalary;
        long mashaAnnualIncrease = mashaSalaryIncrease*year - mashaSalary*year;
        long denisAnnualIncrease = denisSalaryIncrease*year - denisSalary*year;
        long kristinaAnnualIncrease = kristinaSalaryIncrease*year - kristinaSalary*year;
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaAnnualIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisAnnualIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaAnnualIncrease + " рублей");
    }
}
