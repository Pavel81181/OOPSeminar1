public class DIP {
    /**
     * Интерфейс для работы с различными двигателями
     */
    public interface iEngine {
        public void start();
    } 
    
    
    /**
     * Класс для автомобиля
     */
    public class Car {
        private iEngine engine;

        public Car(iEngine engine) {
            this.engine = engine;
        }

        public void start() {
            this.engine.start();
        }
    }

    /**
     * Класс для работы с бензиновым двигателем
     */
    public class PetrolEngine implements iEngine {
        @Override
        public void start() {
        }
    }

    /**
     * Класс для работы с дизельным двигателем
     */
    public class DiselEngine implements iEngine {
        @Override
        public void start() {
        }
    }

    /**
     * Класс для работы с электрическим двигателем
     */
     public class ElectroEngine implements iEngine {
        @Override
        public void start() {
        }
    }

    
}
