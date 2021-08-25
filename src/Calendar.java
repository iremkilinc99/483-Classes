public class Calendar implements Print{
    int created = 0;
    StudyProgramme studyProgramme;
    public Calendar(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        studyProgramme.print();
        print();
    }

    @Override
    public void print() {
      created++;
      if(studyProgramme.created == 1)
         System.out.println("Calendar is added.");
      else
          System.out.println("Calendar can not be added. Add Study Programme unit");
    }
}
