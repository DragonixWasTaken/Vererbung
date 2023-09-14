//Autor: Greimel David
//Klasse 2a APC | Lehrgang 1 | 12.09.2023
public class Employee extends Person {
    // Private Attribute für Mitarbeiter ID, Vorgesetzten ID und Gehalt
    private String employeeId;
    private String supervisorId;
    private float salary;

    // Konstruktor um die Mitarbeiterinformationen zu initialisieren
    public Employee(String ln, String fn, String empId, int a, String supervisorId, float salary) {
        // Ruft den Konstruktor der Basisklasse Person auf um Name und Alter zu initialisieren
        super(ln, fn);
        this.employeeId = empId;
        this.supervisorId = supervisorId;
        this.salary = salary;
    }

    // Methode zur Rückgabe der Mitarbeiter-ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Methode zur Rückgabe der Vorgesetzten-ID
    public String getSupervisorId() {
        return supervisorId;
    }

    // Methode zur Aktualisierung der Vorgesetzten ID
    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    // Methode zur Rückgabe des Gehalts
    public float getSalary() {
        return salary;
    }

    // Methode zur Aktualisierung vom Gehalt
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Methode zur Erhöhung vom Gehalt um den Betrag
    public void salaryIncrease(float increaseAmount) {
        this.salary += increaseAmount;
    }

    // Methode zur Ausgabe von allen Mitarbeiterinformationen
    public void printAll() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Full Name: " + fullName());
        System.out.println("Age: " + age);
        System.out.println("Supervisor ID: " + supervisorId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // verwendung
        Employee employee = new Employee("Muster", "Max", "EMP123", 30, "SUP456", 50000.0f);
        employee.printAll();

        // Erhöht das Gehalt um 10%
        employee.salaryIncrease(0.10f);
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}
