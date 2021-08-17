public class Student implements Print{
    int created = 0;
    UserManagement userManagement;
    public Student(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public void print() {
        created++;
        if(userManagement.created == 1)
            System.out.println("Student is added.");
        else
            System.out.println("Student cannot be added. Add User Management Unit.");
    }
}
