public class Main {
    public static void main(String[] args){
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        double MashaD = Masha * 0.1 + Masha;
        double DenisD = Denis * 0.1 + Denis;
        double KristinaD = Kristina * 0.1 + Kristina;
        int MashaY = Masha * 12;
        int DenisY = Denis * 12;
        int KristinaY = Kristina * 12;
        double MashaDY = MashaD * 12;
        double DenisDY = DenisD * 12;
        double KristinaDY = KristinaD * 12;
        double MashaPlus = MashaDY - MashaY;
        double DenisPlus = DenisDY - DenisY;
        double KristinaPlus = KristinaDY - KristinaY;
        System.out.println("Маша теперь получает " + MashaD + " рублей. Годовой доход вырос на "+ MashaPlus + " рублей");
        System.out.println("Денис теперь получает " + DenisD + " рублей. Годовой доход вырос на "+ DenisPlus + " рублей");
        System.out.println("Кристина теперь получает " + KristinaD + " рублей. Годовой доход вырос на "+ KristinaPlus + " рублей");

    }

}