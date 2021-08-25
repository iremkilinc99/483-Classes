public class TeacherV extends Teacher implements Print{
    public TeacherV(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Teacher(V) is added.");
    }
}
