public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public static void main(String[] args) {
        String name="kemal";
        double salary=2000.0;
        int workHours=45;
        int hireYear=1985;
        Employee employee =new Employee(name,salary,workHours,hireYear);
        double vergiBonusBirlikteMaas=salary + employee.bonus() - employee.tax();
        double toplamMaas=vergiBonusBirlikteMaas + employee.raiseSalary();
        System.out.println(employee);
        System.out.println("Vergi ve Bonus ile Birlikte Maas : " + vergiBonusBirlikteMaas);
        System.out.println("Toplam Maas = " + toplamMaas);
    }
    double raiseSalary() { //maas artısı return eden metod
        return ((2021 - hireYear) < 10) ? salary * 0.05 : (2021 - hireYear) < 20 ? salary * 0.10 : salary * 0.15;
    }
     double bonus() {    //bonus hesaplayıp return eden metod
        return (workHours > 40) ? (workHours - 40) * 30 : 0;
    }
    double tax() {      //vergiyi return eden metod
        return (salary < 1000) ? salary : salary * 0.03;
    }
    public String toString() {
        return "Adi : " + name +
                "\nMaasi :" + salary +
                "\nCalisma Saati :" + workHours +
                "\nYili : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaas Artisi : " + raiseSalary();
}}