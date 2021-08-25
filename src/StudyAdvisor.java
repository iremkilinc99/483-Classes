public class StudyAdvisor extends  Teacher implements Print{
    public StudyAdvisor(UserManagement userManagement) {
        super(userManagement);
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("Study Advisor is added.");
    }
}
