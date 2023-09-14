package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassHash implements iGetModel {
    private Map<Long, Student> studentMap;

    public ModelClassHash(Map<Long, Student> studentMap) {
        this.studentMap = new HashMap<>();
        
    }

    public void addStudent(Long id, Student student) {
        studentMap.put(id, student);

    }

    public void deleteStudent(Long id) {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
        }
        else {
            System.out.println("Student does not exist");
        }

    }

    @Override
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudents'");
    }

}
