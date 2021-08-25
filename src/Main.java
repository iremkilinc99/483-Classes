import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ManagementUnit managementUnit = new ManagementUnit();
        StudyProgramme studyProgramme = new StudyProgramme(managementUnit);
        CourseManagement courseManagement = new CourseManagement(managementUnit);
        CourseContent courseContent = new CourseContent(courseManagement);
        Courses courses = new Courses(courseManagement);
        UserManagement userManagement = new UserManagement(managementUnit);

        int f = -1;
        managementUnit.print();
        userManagement.print();
        courseManagement.print();
        courses.print();
        courseContent.print();

        while ((f = scanner.nextInt()) != 0) {
            switch (f) {
                case 1: Undergraduate undergraduate = new Undergraduate(userManagement);  break;
                case 2: Graduate graduate = new Graduate(userManagement); break;
                case 3: Worker worker = new Worker(userManagement); break;
                case 4: TeacherV teacherV = new TeacherV(userManagement);  break;
                case 5: StudyAdvisor studyAdvisor = new StudyAdvisor(userManagement); break;
                case 6: TeachingAssistant teachingAssistant = new TeachingAssistant(userManagement); break;
                case 7: ProgrammeCoordinator programmeCoordinator = new ProgrammeCoordinator(userManagement); break;
                case 8: AdministrativeStaff administrativeStaff = new AdministrativeStaff(userManagement); break;
                case 9: courseContent.files();break;
                case 10: AudioFile audioFile = new AudioFile(courseContent); break;
                case 11: DocumentFile documentFile = new DocumentFile(courseContent); break;
                case 12: ImageFile imageFile = new ImageFile(courseContent); break;
                case 13: VideoFile videoFile = new VideoFile(courseContent); break;
                case 14: courseContent.AP(); break;
                case 15: courseContent.EQ(); break;
                case 16: courseContent.projectBoard(); break;
                case 17: courseContent.discussionBoard(); break;
                case 18: courseContent.office(); break;
                case 19: courseContent.OnlineTraining(); break;
                case 20: courseContent.gamification(); break;
                case 21: courseContent.microLearning(); break;
                case 22: courseContent.meeting(); break;
                case 23: courseContent.community(); break;
                case 24: courseContent.healthFitness(); break;
                case 25: Calendar calendar = new Calendar(studyProgramme); break;
                case 26: TrackingProgress trackingProgress = new TrackingProgress(studyProgramme); break;
            }
        }
    }
}