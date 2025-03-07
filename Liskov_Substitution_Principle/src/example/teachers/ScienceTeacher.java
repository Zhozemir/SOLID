package example.teachers;

import example.interfaces.CourseInstructor;
import example.staff.SchoolStaff;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach(){

        System.out.println("Taught science");

    }

}
