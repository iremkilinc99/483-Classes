public class UserManagement implements Print{
    int created = 0;
    ManagementUnit managementUnit;
    public UserManagement (ManagementUnit managementUnit) {
        this.managementUnit = managementUnit;
    }

    @Override
    public void print() {
        created++;
        if(managementUnit.created == 1)
            System.out.println("User Management Unit is added.");
        else
            System.out.println("User Management Unit cannot be added. Add management unit.");
    }
}
