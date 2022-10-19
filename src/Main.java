public class Main {
    public static void main(String[] args){
        int Banana = 5 * 80;
        int Milk = 105 * 2;
        int IceCream = 100 * 2;
        int Eggs = 4 * 70;
        int BreakfastWeightInG = Banana + Milk + IceCream + Eggs;
        double BreakfastWeightInKG = BreakfastWeightInG / 1000;
        System.out.println("Вес спортивного завтрака " + BreakfastWeightInG + " в граммах, " + BreakfastWeightInKG + " в килограммах");

    }

}