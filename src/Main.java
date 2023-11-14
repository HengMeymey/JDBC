import modal.Student;
import service.StudentService;
import service.serviceimpl.StudentServiceImpl;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
//        System.out.println(studentService.insertStudent(new Student(2,"Meymey","female","Java", 40.5F,new Timestamp(2023))));
//        System.out.println(studentService.updateStudent(new Student(1,"Bopha","female","frontend",30,new Timestamp(2023))));
        System.out.println(studentService.deleteStudent(1));
        System.out.println("Here are all the students ");
        System.out.println(studentService.getAllStudents());
    }
}
