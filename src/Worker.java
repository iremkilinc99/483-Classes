public class Worker extends Student implements Print {
    public Worker(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Worker is added.");
    }
}
