public class Teacher implements Print{
    int created = 0;
    UserManagement userManagement;
    public Teacher(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public void print() {
        created++;
        if(userManagement.created == 1)
            System.out.println("Teacher is added.");
        else
            System.out.println("Teacher cannot be added. Add User Management Unit.");
    }
}
