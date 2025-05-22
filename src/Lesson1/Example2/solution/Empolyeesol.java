package Lesson1.Example2.solution;

public class Empolyeesol {
    private int id;

    public int getID(int id) {
        this.id = id;
        return id;
    }
    printPerformanceData performance = new printPerformanceData();
    double salary = new CalculateSalary().calculateSalary(60);
    FetchBioData bioData = new FetchBioData();
}
