public class StudyProgramme implements Print {
    int created = 0;

    ManagementUnit managementUnit = new ManagementUnit();
    public StudyProgramme (ManagementUnit managementUnit) {
        this.managementUnit = managementUnit;
    }

    @Override
    public void print() {
        created++;
        if(managementUnit.created == 1)
            System.out.println("Study Programme is added.");
        else
            System.out.println("Study Programme cannot be added. Add management unit.");
    }
}
