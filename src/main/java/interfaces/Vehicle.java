package interfaces;

public class Vehicle implements Engine, FuelTank{

        @Override
        public void start() {
                System.out.println("start vehicle");
        }

        @Override
        public void stop() {
                System.out.println("stop vehicle");
        }

        @Override
        public void refuel(double amount) {
                System.out.println("refuel vehicle");
        }

        @Override
        public double getFuelLevel() {
                return 0;
        }

        //usage example
        void test(){
                System.out.println(FuelTank.calculateMilesPerGallon(12,12));
        }
}



