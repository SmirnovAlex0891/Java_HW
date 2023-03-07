package hw_16_02_2023;

public class HwOne {
    public static void main(String[] args) {
        MeansOfTransport m1 = MeansOfTransport.PLANE;
        MeansOfTransport m2 = MeansOfTransport.TRAIN;
        MeansOfTransport m3 = MeansOfTransport.CAR;
        MeansOfTransport m4 = MeansOfTransport.BICYCLE;
        MeansOfTransport m5 = MeansOfTransport.FOOT;

        m1.printTravel();
        m2.printTravel();
        m3.printTravel();
        m4.printTravel();
        m5.printTravel();
        System.out.println("Days: " + (int) (m5.getTravelTime() / 24) + ", hours " + m5.getTravelTime() % 24);
    }

}
