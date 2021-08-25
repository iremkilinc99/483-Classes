public class AdministrativeStaff extends Staff implements Print{
    public AdministrativeStaff(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Administrative Staff is added.");
    }
}
