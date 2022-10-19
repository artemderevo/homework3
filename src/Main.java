public class Main {
    public static void main(String[] args){
        int TotalCans = 120;
        int WhiteCansPerClass = 2;
        int BrownCansPerClass = 4;
        int CansPerClass = WhiteCansPerClass + BrownCansPerClass;
        int TotalClasses = TotalCans / CansPerClass;
        int TotalWhiteCans = TotalClasses * WhiteCansPerClass;
        int TotalBrownCans = TotalClasses * BrownCansPerClass;
        System.out.println("В школе, где " + TotalClasses + " классов, нужно " + TotalWhiteCans + " банок белой краски и " + TotalBrownCans + " банок коричневой краски");


    }

}