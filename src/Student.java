public class Student implements Print{
    static int created = 0;
    UserManagement userManagement;
    public Student(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public void print() {
        created++;
        if(userManagement.created == 1 && created == 1)
            System.out.println("Student is added.");
    }
}
