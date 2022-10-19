public class Main {
    public static void main(String[] args){
        int TotalWeight = 7 * 1000;
        int DaysWithMinWeightLoss = TotalWeight / 250;
        int DaysWithMaxWeightLoss = TotalWeight / 500;
        int AverageDaysToLoseWeight = (DaysWithMinWeightLoss + DaysWithMaxWeightLoss) / 2;
        System.out.println("Спортсмен потратит " + DaysWithMinWeightLoss + " дней с потерей веса 250 граммов в сутки; " + DaysWithMaxWeightLoss + " дней с потерей веса 500 граммов в сутки. В среднем у него уйдет " + AverageDaysToLoseWeight + " день.");
    }

}