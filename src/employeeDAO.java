import java.util.List;

public interface employeeDAO {
    //CRUD Operation
    public List<Employee> getAllEmp();
    public void  addEmp(Employee newWmp);
    public void updateEmp (Employee newEmp);
    public void deleteEmp (int id);
    public Employee findEmp (int id);
}
