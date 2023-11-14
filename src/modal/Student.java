package modal;

import java.sql.Timestamp;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String classroom;
    private float scores;
    private Timestamp currentDate;
    public Student(){}

    public Student(int id, String name, String gender, String classroom, float scores, Timestamp currentDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classroom = classroom;
        this.scores = scores;
        this.currentDate = currentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public float getScores() {
        return scores;
    }

    public void setScores(float scores) {
        this.scores = scores;
    }

    public Timestamp getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Timestamp currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classroom='" + classroom + '\'' +
                ", scores=" + scores +
                ", currentDate=" + currentDate +
                '}';
    }
}
