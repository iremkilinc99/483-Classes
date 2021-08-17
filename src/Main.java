import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ManagementUnit managementUnit = new ManagementUnit();
        StudyProgramme studyProgramme = new StudyProgramme(managementUnit);
        Calendar calendar = new Calendar(studyProgramme);
        CourseManagement courseManagement = new CourseManagement(managementUnit);
        CourseContent courseContent = new CourseContent(courseManagement);
        Courses courses = new Courses(courseManagement);
        UserManagement userManagement = new UserManagement(managementUnit);
        Staff staff = new Staff(userManagement);
        Student student = new Student(userManagement);
        Teacher teacher = new Teacher(userManagement);
        TrackingProgress trackingProgress = new TrackingProgress(studyProgramme);

        int f = -1;
        while ((f = scanner.nextInt()) != 0) {
            switch (f) {
                case 1: managementUnit.print(); break;
                case 2: userManagement.print(); break;
                case 3: courseManagement.print(); break;
                case 4: studyProgramme.print(); break;
                case 5: student.print(); break;
                case 6: teacher.print(); break;
                case 7: staff.print(); break;
                case 8: courses.print();  break;
                case 9: courseContent.print(); break;
                case 10: calendar.print(); break;
                case 11: trackingProgress.print(); break;
                case 12: courseContent.files(); break;
                case 13: courseContent.AP(); break;
                case 14: courseContent.EQ(); break;
                case 15: courseContent.projectBoard(); break;
                case 16: courseContent.discussionBoard(); break;
                case 17: courseContent.office(); break;
                case 18: courseContent.OnlineTraining(); break;
                case 19: courseContent.gamification(); break;
                case 20: courseContent.microLearning(); break;
                case 21: courseContent.meeting(); break;
                case 22: courseContent.community(); break;
                case 23: courseContent.healthFitness(); break;
            }
        }
    }
}