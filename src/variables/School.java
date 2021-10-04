package variables;

public class School {

    private int classroomCount = 10;
    private int studentCount = 86;
    private int teacherCount = 14;
    private int averageTeacherSalary = 70000;
    private double totalExpenditure = 1206720.86;
    private double totalBudget = 1500000;
    private String schoolName = "Red Mountain High School";
    private boolean isAccredited = true;

    private int studentsPerClassroom() {
        double result = (double)studentCount / (double) classroomCount;
        return (int) Math.round(result);
    }
    private double averageStudentsPerClassroom() {
        return studentCount / classroomCount;
    }

    private double costPerStudent() {
        return (totalExpenditure - (averageTeacherSalary * teacherCount)) / studentCount;
    }

    private double costPerClassroom() {
        return costPerStudent() * studentsPerClassroom();
    }

    private boolean isWithinBudget() {
        return totalBudget > totalExpenditure;
    }

    private double roundToNearestCent(double num) {
        num *= 100;
        int result = (int)num;
        return ((double)result) / 100;
    }
    public void main() {
        System.out.println("Students per classroom: " + studentsPerClassroom());
        System.out.println("Cost per student: " + costPerStudent());
        System.out.println("Cost per classroom: " + costPerClassroom());
    }
}
