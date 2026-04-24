public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // 5-digit salary (10000 to 99999)
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Years of service (1 to 10)
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → Old Salary, Column 1 → Bonus, Column 2 → New Salary
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] result = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }
        return result;
    }

    // Method to calculate and display totals in tabular format
    public static void displaySummary(double[][] employeeData, double[][] salaryData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = salaryData[i][0];
            double bonus = salaryData[i][1];
            double newSalary = salaryData[i][2];
            double years = employeeData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t%.0f\t\t%.0f\t%.2f\t\t%.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL\t%.0f\t\t\t%.2f\t\t%.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] salaryData = calculateBonus(employeeData);

        displaySummary(employeeData, salaryData);
    }
}
