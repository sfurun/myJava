package gitProject;

public class Employee {

    private String name;
    private int salary;
    private int workHours;
    private int hireYear;
    public int vergi;
    public int bonus;
    public int yil;
    private int zam;

    Employee(String name, int salary, int hireYear, int workHours) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }
 
    public void tax() {
        if (this.salary < 1000) {
            vergi = 0;
            System.out.println(vergi);
        } else if(this.salary > 1000) {
            vergi = this.salary * 3 / 100;
            this.salary -= vergi;
            System.out.println("Vergi:" + vergi);
        }
    }

    public void bonus() {
        if (workHours>40) {
            bonus = (workHours - 40) * 30;
            System.out.println("Bonus:" + bonus);
            this.salary += bonus;
        }
    }

    public void raiseSalary() {
        yil = (2021 - hireYear);
        if (yil < 10) {
            this.zam = salary * (5 / 100);
            System.out.println("Maa� Art���:" + zam);
            System.out.println("Toplam Maa�:" + (salary += this.zam));
        } else if (yil > 9 && yil < 20) {
            this.zam = salary * 1 / 10;
            System.out.println("Maa� Art���:" + zam);
            System.out.println("Toplam Maa��:" + (salary += zam));
        } else if (yil > 19) {
            this.zam = salary * (15 / 100);
            System.out.println("Maa� Art���:" + zam);
            System.out.println("Toplam Maa�:" + (salary += zam));

        }
    }

    public void showInfos() {
        System.out.println("Ad�:" + name);
        System.out.println("Br�t Maa��:" + salary);
        System.out.println("Ba�lang�� Y�l�:" + hireYear);
        System.out.println("�al��ma Saati:" + workHours);
        tax();       
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile Birlikte Net Maa�:" + this.salary);
    }
}
