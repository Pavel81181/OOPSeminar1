public class OCP {
    
    public class SpeedCalculation {
        /**
         * Рассчитывает допустимую скорость
         * 
         * @param vehicle автомобиль
         * @return допустимая скорость
         */
        public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * vehicle.getSpeedRate();
        }
    }

    /**
     * Обобщенный класс для всех автомобилей
     */
    public class Vehicle {
        private int maxSpeed;
        private String type;
        private double speedRate; 

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public String getType() {
            return this.type;
        }

        public double getSpeedRate() {
            return speedRate;
        }
    }

    /**
     * Дочерний класc для легкового автомобиля
     */
    public class Car extends Vehicle {

        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
            super.speedRate = 0.8;
        }

        /**
         * Ввод коэффициента максимальной скорости 
         * @param speedRate коэффицент для расчета максимальной скорости 
         */
        public void setSpeedRate(double speedRate) {
            super.speedRate = speedRate;
        }
    }

    /**
     * Дочерний класс для автобуса
     */
    public class Bus extends Vehicle {

        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
            super.speedRate = 0.6;
        }

        /**
         * Ввод коэффициента максимальной скорости 
         * @param speedRate коэффицент для расчета максимальной скорости 
         */
        public void setSpeedRate(double speedRate) {
            super.speedRate = speedRate;
        }
    }
}
