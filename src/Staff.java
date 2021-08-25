public class Staff implements Print{
    static int created = 0;
    UserManagement userManagement;

    public Staff(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public void print() {
        created++;
        if (userManagement.created == 1 && created == 1)
            System.out.println("Staff is added.");
    }
}
