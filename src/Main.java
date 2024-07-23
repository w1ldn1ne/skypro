public class Main {
    public static void main(String[] args) {
        //Первое задание
        int megaStack = 64000;
        System.out.println("Значение переменной megaStack с типом int равно " + megaStack);
        byte stack = 64;
        System.out.println("Значение переменной stack с типом byte равно " + stack);
        short midMinusStack = -32000;
        System.out.println("Значение переменной midMinusStack с типом short равно " + midMinusStack);
        long number = 2234567897679L;
        System.out.println("Значение переменной number с типом long равно " + number);
        float dot = 0.3773f;
        System.out.println("Значение переменной dot с типом float равно " + dot);
        double megaDot = 7.3481461834;
        System.out.println("Значение переменной megaDot с типом double равно " + megaDot);

        //Второе задание
        float A = 27.12f;
        long B = 987_678_965_549L;
        float C = 2.786f;
        short D = 569;
        short F = -159;
        short I = 27897;
        byte H = 67;

        //Третье задание
        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        short paper = 480;
        int paperPerStudent = paper / (luda + anna + katya);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        //Четвертое задание
        byte bottlePerMinute = 16 / 2;
        int bottlePer20Minute = 20 * bottlePerMinute;
        System.out.println("За 20 минут машина произвела " + bottlePer20Minute + " штук бутылок");
        int bottlePerDay = bottlePerMinute * 60 * 24;
        System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок");
        int bottlePerThreeDay = bottlePerDay * 3;
        System.out.println("За три дня машина произвела " + bottlePerThreeDay + " штук бутылок");
        int bottlePerMonth = bottlePerThreeDay * 10;
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");

        //Пятое задание
        byte dyeAll = 120;
        byte klass = 120 / (2 + 4);
        int whiteDye = klass * 2;
        int brownDye = klass * 4;
        System.out.println("В школе, где " + klass + " классов, нужно " + whiteDye + " банок белой краски и " + brownDye + " банок коричневой краски");

        //Шестое задание
        short banana = 5 * 80;
        short milk = (200 / 100) * 105;
        short ice = 2 * 100;
        short egg = 4 * 70;
        int smuziGramm = banana + milk + ice + egg;
        System.out.println("В граммах завтрак весит " + smuziGramm + " грамм");
        int smuziKilo = (smuziGramm / 1000);
        System.out.println("В килограммах завтрак весит " + smuziKilo + " килограмм");

        //Седьмое задание
        short ruleGramm = 7 * 1000;
        short minGrammPerDay = 250;
        short maxGrammPerDay = 500;
        int maxDay = ruleGramm / minGrammPerDay;
        System.out.println("Максимум понадобится " + maxDay + " дней");
        int minDay = ruleGramm / maxGrammPerDay;
        System.out.println("Минимум понадобится " + minDay + " дней");
        int midDay = (maxDay + minDay) / 2;
        System.out.println("В среднем понадобится " + midDay + " день");

        //Восьмое задание
        int mashaMonthOld = 67760;
        double mashaMonthNew = mashaMonthOld * 1.1;
        int mashaYearOld = mashaMonthOld * 12;
        double mashaYearNew = mashaMonthNew * 12;
        double mashaYearDiff = mashaYearNew - mashaYearOld;
        System.out.println("Маша теперь получает " + mashaMonthNew + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        int denisMonthOld = 83690;
        double denisMonthNew = denisMonthOld * 1.1;
        int denisYearOld = denisMonthOld * 12;
        double denisYearNew = denisMonthNew * 12;
        double denisYearDiff = denisYearNew - denisYearOld;
        System.out.println("Денис теперь получает " + denisMonthNew + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");
        int krisMonthOld = 76230;
        double krisMonthNew = krisMonthOld * 1.1;
        int krisYearOld = krisMonthOld * 12;
        double krisYearNew = krisMonthNew * 12;
        double krisYearDiff = krisYearNew - krisYearOld;
        System.out.println("Кристина теперь получает " + krisMonthNew + " рублей. Годовой доход вырос на " + krisYearDiff + " рублей");
    }
}
