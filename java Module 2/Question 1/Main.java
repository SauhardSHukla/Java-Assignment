import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Professor {

    private String name;
    private String employeeId;
    private String specialization;

    public Professor() {
    }

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId +
               ", Specialization: " + specialization;
    }
}

class Department {

    private String deptName;
    private String hodName;
    private List<Professor> professors;

    public Department() {
        professors = new ArrayList<>();
    }

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        professors = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    @Override
    public String toString() {
        String result = "Department: " + deptName +
                        "\nHOD: " + hodName +
                        "\nProfessors:\n";

        for (Professor p : professors) {
            result += p + "\n";
        }

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String departmentDetails = sc.nextLine();
        String[] deptData = departmentDetails.split(",");

        Department department =
                new Department(deptData[0], deptData[1]);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String professorDetails = sc.nextLine();
            String[] professorData = professorDetails.split(",");

            Professor professor = new Professor(
                    professorData[0],
                    professorData[1],
                    professorData[2]
            );

            department.addProfessor(professor);
        }

        System.out.println(department);

        sc.close();
    }
}