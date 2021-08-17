public class ManagementUnit implements Print{
    int created = 0;
    @Override
    public void print() {
        created++;
        System.out.println("Management unit is added.");
    }
}
