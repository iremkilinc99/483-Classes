public class Courses implements Print{
    int created = 0;
    CourseManagement courseManagement;
    public Courses(CourseManagement courseManagement) {
        this.courseManagement = courseManagement;
    }

    @Override
    public void print() {
        created++;
        if(courseManagement.created == 1)
            System.out.println("Courses is added.");
        else
            System.out.println("Courses cannot be added. Add Course Management Unit");
    }
}
