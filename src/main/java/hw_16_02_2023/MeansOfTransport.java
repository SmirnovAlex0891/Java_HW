package hw_16_02_2023;

public enum MeansOfTransport {
    PLANE(1.1) {
        @Override
        void printTravel() {
            System.out.println("Travel time on plane: " + 1 + " hour, " + 10 + " minutes");
        }
    },
    TRAIN(8.14) {
        @Override
        void printTravel() {
            System.out.println("Travel time on train: " + 8 + " hours, " + 14 + " minutes");
        }
    },
    CAR(6.27) {
        @Override
        void printTravel() {
            System.out.println("Travel time on car: " + 6 + " hours, " + 27 + " minutes");
        }
    },
    BICYCLE(37) {
        @Override
        void printTravel() {
            System.out.println("Travel time on bicycle: " + 1 + " day, " + 13 + " hours");
        }
    },
    FOOT(118) {
        @Override
        void printTravel() {
            System.out.println("Travel time on foot: " + 4 + " day, " + 22 + " hours");
        }
    };

    private double travelTime;

    MeansOfTransport(double travelTime) {
        this.travelTime = travelTime;
    }

    abstract void printTravel();

    public double getTravelTime() {
        return travelTime;
    }
}
