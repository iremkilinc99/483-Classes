public class Undergraduate extends Student implements Print{
    public Undergraduate(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Undergraduate student is added.");
    }
}
