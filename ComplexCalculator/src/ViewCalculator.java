import java.util.Scanner;

public class ViewCalculator {
    Scanner in = new Scanner(System.in);

    private iCalculable calculator;

   
    public ViewCalculator() {
            this.calculator = new Decorator(new Calculator(), new Logger());
            run();
        }
    

   
    /**
     * Метод, запускающий работу комплексного калькулятора
     */
    public void run() {
        while (true) {
            double[] primaryArg = promptArray("\u001B[32mВведите первый аргумент:\n\u001B[0m");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("\u001B[32mВведите команду (*, /, +, - , =) : \u001B[0m");
                if (cmd.equals("*")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double[] result = calculator.getResult();
                    System.out.printf("\u001B[34mРезультат: %s + %si\n\u001B[0m",
                            Math.round(result[0] * 1000.0) / 1000.0,
                            Math.round(result[1] * 1000.0) / 1000.0); // результат округляю до трех знаков после запятой
                    break;
                }
            }
            String cmd = prompt("\u001B[31mЕще посчитать (Y/N)?\n\u001B[0m");
            if (cmd.toLowerCase().equals("y")) {
                calculator.setPrimaryArg(new double[2]); // добавил сброс значения primaryArg в 0
                continue;
            }
            break;
        }
    }

    /**
     * Выводит сообщение с запросом ввести данные типа String. Принимает данные от
     * пользователя и возвращает их
     * 
     * @param message текст сообщения
     * @return введенные пользователем данные (String)
     */
    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }

   
    /**
     * Выводит сообщение с запросом ввести данные типа Double. Принимает два
     * значения от пользователя и возвращает их
     * 
     * @param message текст сообщения
     * @return введенные пользователем данные (возвращается double[]. вещественная
     *         часть хранится в [0] ячейке, мнимая часть хранится в [1] ячейке)
     */
    private double[] promptArray(String message) {
        double[] arr = new double[2];
        System.out.print(message);
        System.out.print("Введите вещественную часть: ");
        arr[0] = Double.parseDouble(in.nextLine());
        System.out.print("Введите мнимую часть: ");
        arr[1] = Double.parseDouble(in.nextLine());
        return arr;
    }
}