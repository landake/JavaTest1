public class Tax {
    public static void main(String[] args) {
        Employee emp1 = new Employee("UserA",5000);
        Employee emp2 = new Employee("UserB",10000);
        Employee emp3 = new Employee("UserC",15000);
        Employee emp4 = new Employee("UserD",60000);


        System.out.print(emp1.getName()+"的应纳税额是:");
        emp1.selfTax();
        System.out.print(emp2.getName()+"的应纳税额是:");
        emp2.selfTax();
        System.out.print(emp3.getName()+"的应纳税额是:");
        emp3.selfTax();
        System.out.print(emp4.getName()+"的应纳税额是:");
        emp4.selfTax();
    }

}
