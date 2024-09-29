package app;

public class Main {
//    public static final double MILES_TO_KILOMETERS = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        double farengate = 94;
        double celsiu = convFarengateToCelsiu(farengate);
        System.out.println("Result is " + celsiu + " celsiu.");
    }

    private static double convFarengateToCelsiu(double farengate) {
        return (farengate - 32) * 5 / 9;
    }
}