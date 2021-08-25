public class Graduate extends  Student implements Print{

    public Graduate(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Graduate student is added.");
    }
}
