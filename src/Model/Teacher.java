package Model;

import Model.Course;
import Model.Person;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Course> course;

    public Teacher(String name, String vorname){
        super(name, vorname);
        this.course = new ArrayList<>();
    }
}
