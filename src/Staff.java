public class Staff implements Print{
    int created = 0;
    UserManagement userManagement;

    public Staff(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public void print() {
        created++;
        if(userManagement.created == 1)
            System.out.println("Staff is added.");
        else
            System.out.println("Staff cannot be added. Add User Management Unit.");
    }
}
