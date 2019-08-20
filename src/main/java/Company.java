import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {

    public List<String> createEmployeesList() {
        List<String> employees = new ArrayList<String>();
        employees.add("Ala Alecka, 30, 3000");
        employees.add("Marcin Marciński, 34, 4000");
        employees.add("Zenek Zenkowski, 55, 6450");
        employees.add("Kot Kotowski, 44, 3533");
        employees.add("Pies Piesowski, 44, 3533");
        employees.add("Maciek Maciecki, 28, 9000");
        employees.add("Jan Jankowski, 29, 4000");
        employees.add("Włodek Włodkowski, 76, 5000");
        employees.add("Malina Malinowska, 54, 3000");
        employees.add("Franek Frankowski, 42, 5500");
        employees.add("Bartosz Bartoszewski, 30, 7300");
        return employees;
    }

    public int countAverageAge(List<String> employees) {
        String[] singleEmp;
        int result = 0;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            int ageValue = Integer.parseInt(singleEmp[1].trim());
            result = result + ageValue;
        }
        return result / employees.size();
    }

    public double countAverageSalary(List<String> employees) {
        String[] singleEmp;
        int result = 0;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            int salaryValue = Integer.parseInt(singleEmp[2].trim());
            result = result + salaryValue;
        }
        return result / employees.size();
    }

    public void raiseSalaryForWomen(double averageSalary, int averageAge, List<String> employees) {
        String[] singleEmp;
        String[] empData;
        double salary;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            salary = Double.parseDouble(singleEmp[2].trim());
            int age = Integer.parseInt(singleEmp[1].trim());
            String fullName = singleEmp[0];
            empData = fullName.split(" ");
            if (empData[0].endsWith("a") && (age < averageAge) && (salary < averageSalary)) {
                salary = 1.2 * salary;
                System.out.println("New salary of " + fullName + " is: " + salary);
            }
        }
    }

    public void dismissAnimals(List<String> employees) {
        String[] animals = {"pies", "kot", "mysz", "slon", "ptak", "lew"};
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i).toLowerCase();
            for (int j = 0; j < animals.length; j++) {
                if (employee.contains(animals[j])) {
                    employees.remove(employees.get(i));
                    i--;
                    System.out.println("Animal " + animals[j] + " has been dismissed from the company!");
                }
            }
        }
    }

    public void raiseSalaryForMen(List<String> employees) {
        String[] singleEmp;
        String[] empData;
        double salary;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            salary = Double.parseDouble(singleEmp[2].trim());
            String fullName = singleEmp[0].trim().toLowerCase();
            empData = fullName.split(" ");
            if (!empData[0].endsWith("a")) {
                salary = salary + 100;
                System.out.println("New salary of " + fullName + " is: " + salary);
            }
        }
    }


    public void delegateEmployee(List<String> employees) {
        String[] singleEmp;
        String[] empData;
        double salary;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            salary = Double.parseDouble(singleEmp[2].trim());
            String fullName = singleEmp[0].trim().toLowerCase();
            empData = fullName.split(" ");
            String lastName = empData[1].trim();
            if (lastName.length() > 7) {
                salary = salary / 4.3;
                System.out.println("Salary of " + fullName + " is: " + salary + " euro");
            }
        }
    }

    public void countAnnualSalary(List<String> employees) {
        double salary;
        double annualSalary;
        double extraSalary;
        String[] singleEmp;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            salary = Double.parseDouble(singleEmp[2].trim());
            annualSalary = salary * 12;
            if (annualSalary < 70000) {
                extraSalary = annualSalary * 0.1;
                System.out.println("Extra salary: " + extraSalary + " " + Arrays.toString(singleEmp));
            }
        }
    }

    public void goHome(List<String> employees) {
        String[] singleEmp;
        double retirement = 0;
        double salary;
        for (int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            singleEmp = employee.split(",");
            salary = Double.parseDouble(singleEmp[2].trim());
            int age = Integer.parseInt(singleEmp[1].trim());
            if (age >= 55) {
                retirement = (salary * 1.3) * 0.5;
                employees.remove(employee);
                i--;
                System.out.println("retirement: " + retirement);
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        List<String> employees = company.createEmployeesList();
        int averageAge = company.countAverageAge(employees);
        double averageSalary = company.countAverageSalary(employees);
        //company.raiseSalaryForWomen(averageSalary,averageAge,employees);
        //company.dismissAnimals(employees);
        // company.raiseSalaryForMen(employees);
        //company.delegateEmployee(employees);
        //company.countAnnualSalary(employees);
        company.goHome(employees);
    }
}
//    I. Zadeklaruj listę pracowników firmy (lista stringów):
//        Elementy:
//        Imię Nazwisko, wiek, pensja netto w zł
//
//        1. Ala Alecka, 30, 3000
//        2. Marcin Marciński, 34, 4000
//        3. Zenek Zenkowski, 55, 6450
//        4. Kot Kotowski, 44, 3533
//        5. Maciek Maciecki, 28, 9000
//        6. Jan Jankowski, 29, 4000
//        7. Włodek Włodkowski, 76, 5000
//        8. Malina Malinowska, 54, 3000
//        9. Franek Frankowski, 42, 5500
//        10. Bartosz Bartoszewski, 30, 7300
//
//        Napisz algorytmy, które:
//        a) policzą średni wiek pracowników firmy
//        b) policzą średnie wynagrodzenie pracowników
//        c) podniesie wynagrodzenie kobietom o 20%, które są młodsze niż średnia wieku oraz mają niższe wynagrodzenie od średniego
//        d) zwolni zwierzęta z firmy (usunie je z listy)
//        e) Wszystkim mężczyznom podniesie wynagrodzenie o 100zł
//        f) Wyśle pracowników którzy mają nazwisko dłuższe niż 7 znaków do pracy za granicą. Tacy pracownicy dostają wynagrodzenie w euro. Przelicz ich wynagrodzenie, przyjmując 1euro = 4.30 zl
//        g) policzy roczne wynagrodzenie każdego pracownika. Jeżeli będzie niższe niż 70000, pracownik dostaje "trzynastkę" równą 10% jego wynagrodzenia netto.
//        h) Wyśle pracownika na emeryturę. Pracownik może iść na emeryturę wtedy, gdy ma przynajmniej 55 lat. Dostaje wtedy emeryturę równą 50% swojego wynagrodzenia brutto oraz jest usuwany z listy.