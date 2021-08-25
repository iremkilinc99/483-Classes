public class StudyProgramme implements Print {
    static int created = 0;
    ManagementUnit managementUnit;

    public StudyProgramme (ManagementUnit managementUnit) {
        this.managementUnit = managementUnit;
    }

    @Override
    public void print() {
        created++;
        if(managementUnit.created == 1 && created == 1)
            System.out.println("Study Programme is added.");
    }
}
