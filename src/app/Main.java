package app;

public class Main {
//    public static final double MILES_TO_KILOMETERS = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");
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