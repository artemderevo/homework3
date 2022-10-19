public class Main {
    public static void main(String[] args){
        int BottlesPer2Minutes = 16;
        int BottlesPer20Minutes = BottlesPer2Minutes * 10;
        int BottlesPerDay = BottlesPer20Minutes * 3 * 24;
        int BottlesPer3Days = BottlesPerDay * 3;
        int BottlesPer30Days = BottlesPer3Days * 10;
        System.out.println("За 20 минут машина произвела " + BottlesPer20Minutes + "  бутылок");
        System.out.println("За 1 день машина произвела " + BottlesPerDay + " бутылок");
        System.out.println("За 3 дня машинна произвела " + BottlesPer3Days + " бутылок");
        System.out.println("За месяц машина произвела " + BottlesPer30Days + " бутылок");


    }

}