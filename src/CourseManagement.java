public class CourseManagement implements Print{
    int created = 0;
    ManagementUnit managementUnit;
    public CourseManagement (ManagementUnit managementUnit) {
           this.managementUnit = managementUnit;
    }

    @Override
    public void print() {
        created++;
        if(managementUnit.created == 1)
            System.out.println("Course Management Unit is added.");
        else
            System.out.println("Course Management Unit cannot be added. Add management unit.");
    }
}
