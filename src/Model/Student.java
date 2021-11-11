package Model;

import Model.Person;

        import java.util.ArrayList;
        import java.util.List;

/**
 * Student mosteneste Person
 *studentid se genereaza automat
 */
public class Student extends Person {
    private static int next_id = 10000;
    private long studentid;
    private int credits;
    private List<Course> enrolledcourse;

    /**
     * constructor
     * @param name nume
     * @param vorname prenume
     */
    public Student(String name, String vorname){
        super(name, vorname);
        this.studentid = ++next_id;
        this.credits = 0;
        this.enrolledcourse = new ArrayList<>();
    }

    public int getCredits() {
        return credits;
    }

    public long getStudentid() {
        return studentid;
    }

    /**
     * @param c Cursul pe care il adauga
     */
    public void addCourse(Course c){
        this.enrolledcourse.add(c);
        this.credits += c.getCredits();
    }

    /**
     * @param c Cursul pe care is sterge
     */
    public void removeCourse(Course c){
        this.enrolledcourse.remove(c);
        this.credits -= c.getCredits();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid= " + studentid + "  studentname= " + this.getName() + " " + this.getVorname() +
                '}';
    }

    public List<Course> getEnrolledcourse() {
        return enrolledcourse;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}