public class TrackingProgress implements Print{
    int created = 0;
    StudyProgramme studyProgramme;

    public TrackingProgress(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        studyProgramme.print();
        print();
    }

    @Override
    public void print() {
        created++;
        if(studyProgramme.created == 1)
            System.out.println("Tracking Progress is added.");
        else
            System.out.println("Tracking Progress can not be added. Add Study Programme unit");
    }
}
