public class Main {
    public static void main(String[] args){
        int NumberOfStudentsLP = 23;
        int NumberOfStudentsAS = 27;
        int NumberOfStudentsEA = 30;
        int TotalSheetsOfPaper = 480;
        int SheetsOfPaperPerStudent = 480 / (NumberOfStudentsLP + NumberOfStudentsAS + NumberOfStudentsEA);
        System.out.println("На каждого ученика рассчитано " + SheetsOfPaperPerStudent + " листов бумаги");


    }

}