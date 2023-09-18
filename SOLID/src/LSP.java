public class LSP {
    


    public class Rectangle  {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

       
        public int area() {
            return this.width * this.height;
        }
    }

    /**
     * В качестве исправлений убрал наследование у прямоугольника, поскольку у квадрата все стороны одинаковы
     * оставил только одну переменную для размера стороны. Переписал метод вычисления площади.
     */
    public class Square  {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

       
        public int area() {
            return this.side * this.side;
        }
    }

}
