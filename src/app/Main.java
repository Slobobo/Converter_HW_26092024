package app;

public class Main {

    public static void main(String[] args) {

        System.out.println("Converter App. farengate to celsiu and vise-versa");

        double farengate = 94;
        double celsiu = 18;

        double celsiuConversion = convFarengateToCelsiu(farengate);
        double farengateConversion = convCelsiuToFarengate(celsiu);

        System.out.println(farengate + " farengate equilse " + celsiuConversion + " celsium.");
        System.out.println(celsiu + " celsiu equilse " + farengateConversion + " farengate.");
    }

    private static double convFarengateToCelsiu(double farengate) {
        return (farengate - 32) * 5 / 9;
    }

    private static double convCelsiuToFarengate(double celsiu) {
        return (celsiu * 9 / 5) + 32;
    }
}