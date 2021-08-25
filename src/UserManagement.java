public class UserManagement implements Print{
    int created = 0;
    ManagementUnit managementUnit;
    public UserManagement (ManagementUnit managementUnit) {
        this.managementUnit = managementUnit;
        created++;
    }

    @Override
    public void print() {
        if(managementUnit.created == 1)
            System.out.println("User Management Unit is added.");
    }
}
