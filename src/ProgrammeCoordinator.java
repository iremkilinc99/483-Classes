public class ProgrammeCoordinator extends Staff implements Print{
    public ProgrammeCoordinator(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Programme Coordinator is added.");
    }
}
