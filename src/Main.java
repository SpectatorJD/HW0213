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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

   public static void task2 () {
        System.out.println("Задача 2");
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
       dog += 4;
       cat += 4;
       paper += 4;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend = friend /7;
        System.out.println(friend);

    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

    }

    public static void task6 () {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        //System.out.println(weightBoxer1 + " кг");

        var weightBoxer2 = 82.7;
        //System.out.println(weightBoxer2 + " кг");

        var allWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов составляет " + allWeightBoxers + " кг");

        var difWeightBoxers = weightBoxer2 % weightBoxer1;

        System.out.println("Разница между весами бойцов составляет " + difWeightBoxers + " кг");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        //System.out.println(weightBoxer1 + " кг");

        var weightBoxer2 = 82.7;
        //System.out.println(weightBoxer2 + " кг");

        var allWeightBoxers = weightBoxer1 + weightBoxer2;
        //System.out.println("Общий вес бойцов составляет " + allWeightBoxers + " кг");

        var difWeightBoxers = weightBoxer2 - weightBoxer1;

        System.out.println("Разница между весами бойцов составляет " + difWeightBoxers + " кг");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        var allTime = 640;

        var oneWorkerTime = 8;

        var howManyWorker = allTime / oneWorkerTime;
        System.out.println("Всего работников в компании " + howManyWorker); //первая часть задачи заканичвается тут

        var allWorkerNow = howManyWorker + 94;

        var howManyTime = oneWorkerTime * allWorkerNow;

        System.out.println("Если в компании работает " +  allWorkerNow + " человека" +
                " ,то всего " + howManyTime + " часа работы может быть поделено между сотрудниками" );//вторая часть задачи заканчивает тут


    }
}
