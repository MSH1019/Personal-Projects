package PersonalTrainingProjects;
import java.util.ArrayList;

public class Student {
    String name;
    int studentId;
    int grade;

    public Student (String name, int studentId, int grade) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    public void disPlayDetails(Student student) {
        System.out.println("Student's name: " + name + "/ Student ID: " + 
                            studentId + "/ Grade: " + grade);

        if (grade >= 70){
            System.out.println("Distinction");
        }
        else if(grade >= 50 && grade <70) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        }
    

    public static void main (String[] args) {
        ArrayList <Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ahmed", 2323, 21));
        studentList.add(new Student("Mohamed", 10232, 100));
        studentList.add(new Student("Adam", 12112, 54));

        for (Student student : studentList){
            student.disPlayDetails(student);
        }



    }


}



