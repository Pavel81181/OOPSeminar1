public class ISP {
    
    /**
     * интерфейс для площади
     */
    public interface ShapeArea { 
        double area();
    }
    /**
     * интерфейс для объема
     */ 
    public interface ShapeVolume { 
        double volume();
    }

    
    /**
     * класс для круга
     */
    public class Circle implements ShapeArea { 
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    /**
     * класс для куба
     */
    public class Cube implements ShapeArea, ShapeVolume { 
        private int edge;

        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double area() {
            return 6 * edge * edge;
        }

        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }

}
