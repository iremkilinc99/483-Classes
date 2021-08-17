public class CourseContent implements Print{
    int created = 0;
    CourseManagement courseManagement;
    public CourseContent(CourseManagement courseManagement) {
        this.courseManagement = courseManagement;
    }

    @Override
    public void print() {
        created++;
        if(courseManagement.created == 1)
            System.out.println("Course content is integrated.");
        else
            System.out.println("Course content cannot be integrated. Add Course Management Unit");
    }

    public void files(){
        if(created == 1)
            System.out.println("File is installed.");
        else
            System.out.println("File cannot be installed. Integrate Course Content.");
    }

    private void data(){
        System.out.println("Data is installed.");
    }

    public void AP(){
        if(created == 1) {
            System.out.println("Assignment & Projects is installed.");
            data();
        } else
            System.out.println("Assignment & Projects cannot be installed. Integrate Course Content.");
    }

    public void EQ(){
        if(created == 1)
            System.out.println("Exam & quizzes is installed.");
        else
            System.out.println("Exam & quizzes cannot be installed. Integrate Course Content.");
    }

    public void projectBoard(){
        if(created == 1)
            System.out.println("Project Board is installed.");
        else
            System.out.println("Project Board cannot be installed. Integrate Course Content.");
    }

    public void discussionBoard(){
        if(created == 1)
            System.out.println("Discussion Board is installed.");
        else
            System.out.println("Discussion Board cannot be installed. Integrate Course Content.");
    }

    public void office(){
        if(created == 1)
            System.out.println("Office Hours & Appointment is installed.");
        else
            System.out.println("Office Hours & Appointment cannot be installed. Integrate Course Content.");
    }

    public void OnlineTraining(){
        if(created == 1)
            System.out.println("Online Training is installed.");
        else
            System.out.println("Online Training cannot be installed. Integrate Course Content.");
    }

    public void gamification(){
        if(created == 1)
            System.out.println("Gamification is installed.");
        else
            System.out.println("Gamification cannot be installed. Integrate Course Content.");
    }

    public void microLearning(){
        if(created == 1)
            System.out.println("Micro Learning is installed.");
        else
            System.out.println("Micro Learning cannot be installed. Integrate Course Content.");
    }

    public void meeting(){
        if(created == 1)
            System.out.println("Meeting is installed.");
        else
            System.out.println("Meeting cannot be installed. Integrate Course Content.");
    }

    public void community(){
        if(created == 1)
            System.out.println("Community is installed.");
        else
            System.out.println("Community cannot be installed. Integrate Course Content.");
    }

    public void healthFitness(){
        if(created == 1)
            System.out.println("Health & Fitness is installed.");
        else
            System.out.println("Health & Fitness cannot be installed. Integrate Course Content.");
    }
}
