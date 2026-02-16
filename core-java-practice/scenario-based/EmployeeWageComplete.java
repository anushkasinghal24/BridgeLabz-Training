import java.util.*;

// Interface (UC11)
interface IEmpWageBuilder {
    void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    void computeWage();
    int getTotalWage(String companyName);
}

// Company Class (UC9)
class CompanyEmpWage {

    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalWage;
    ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
        this.dailyWages = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + companyName +
               "\nTotal Wage: " + totalWage +
               "\nDaily Wages: " + dailyWages + "\n";
    }
}

// Builder Class (UC10, UC12)
class EmpWageBuilder implements IEmpWageBuilder{

    ArrayList<CompanyEmpWage> companyList;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
    }

    // UC8 + UC9
    public void addCompany(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours){

        companyList.add(new CompanyEmpWage(companyName, wagePerHour,
                                           maxWorkingDays, maxWorkingHours));
    }

    // UC6 Logic Included
    private void computeCompanyWage(CompanyEmpWage company){

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours <= company.maxWorkingHours &&
               totalDays < company.maxWorkingDays) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3); // UC1
            int empHours = 0;

            switch (empCheck) {  // UC4
                case 1: // Part Time
                    empHours = 4;
                    break;
                case 2: // Full Time
                    empHours = 8;
                    break;
                default: // Absent
                    empHours = 0;
            }

            totalHours += empHours;

            int dailyWage = empHours * company.wagePerHour; // UC2
            company.dailyWages.add(dailyWage);               // UC13
        }

        company.setTotalWage(totalHours * company.wagePerHour);
    }

    // UC11
    public void computeWage() {
        for (CompanyEmpWage company : companyList) {
            computeCompanyWage(company);
            System.out.println(company);
        }
    }

    // UC14
    public int getTotalWage(String companyName) {
        for (CompanyEmpWage company : companyList) {
            if (company.companyName.equalsIgnoreCase(companyName)) {
                return company.totalWage;
            }
        }
        return -1;
    }
}

// Main Class
public class EmployeeWageComplete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilder builder = new EmpWageBuilder();

        System.out.print("Enter number of companies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Company " + i);

            System.out.print("Company Name: ");
            String name = sc.nextLine();

            System.out.print("Wage Per Hour: ");
            int wagePerHour = sc.nextInt();

            System.out.print("Max Working Days: ");
            int maxDays = sc.nextInt();

            System.out.print("Max Working Hours: ");
            int maxHours = sc.nextInt();
            sc.nextLine();

            builder.addCompany(name, wagePerHour, maxDays, maxHours);
        }

        System.out.println("\n---- Computing Wages ----\n");
        builder.computeWage();

        // Query total wage
        System.out.print("\nEnter company name to get total wage: ");
        String queryCompany = sc.nextLine();

        int totalWage = builder.getTotalWage(queryCompany);

        if (totalWage != -1)
            System.out.println("Total Wage for " + queryCompany + " is: " + totalWage);
        else
            System.out.println("Company not found!");

       
    }
}
