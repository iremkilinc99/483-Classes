public class TeachingAssistant extends Teacher implements Print{
    public TeachingAssistant(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Teaching assistant is added.");
    }
}
