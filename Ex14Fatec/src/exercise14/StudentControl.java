package exercise14;

import java.util.ArrayList;
import java.util.List;

public class StudentControl {
    private List<Student> students = new ArrayList<>();

    public void adicionar(Student student) {
        students.add(student);
    }

    public Student pesquisarPorTitulo(String nome) {
        for (Student student : students) {
            if (student.getNome().contains(nome)) {
                return student;
            }
        }
        return null;
    }
}
