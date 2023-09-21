public class Student <T extends Comparable<T>,V extends Number> extends Person <T,V> implements Comparable<Student <T,V>> {
    private V id;
    private V generalId;

    public V getId() {
        return id;
    }

    public Student(T name, V age) {
        super(name, age);
        this.id = generalId;
        //generalId++;

    }

    @Override 
    public String toString() {
        return "Person = " + super.getName() + " age = " + super.getAge() + " id " + id;
    } 
    @Override
    public int compareTo(Student <T,V> o) {
        return super.getName().compareTo(o.getName());
        // //System.out.println(super.getName() + " - " + o.getName());
        // if (super.getAge() == o.getAge()) {
        //     return 0;
        // } else {
        //     if (super.getAge() > o.getAge()) {
        //         return 1;
        //     } else {
        //         return -1;
        //     }
        // }

    }

}
