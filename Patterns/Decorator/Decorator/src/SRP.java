import java.util.Date;

public class SRP {

    /**
     * Класс для сохранения инфо о сотруднике
     */
    public class Employee {
        private String name;
        private Date dob;

        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
        }

        /**
         * @return вывод сотрудника в консоль
         */
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
    }

    /**
     * Хранение и операции с зарплатой
     */
    public class Salary {
        private int baseSalary; 

        public Salary(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        /**
         * @return возвращает размер чистой зарплаты за минусом налога
         */
        public int calculateNetSalary(int index) {
            int tax = (int) (this.baseSalary * 0.25);
            return this.baseSalary - tax;
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(int baseSalary) {
            this.baseSalary = baseSalary;
        }
    }
}