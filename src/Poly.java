public class Poly
{
    public static void main(String[] args)
    {
       Employee employee = new Employee("Eko");
       employee.sayHello("Budi");

       employee = new Manager("Eko");
       employee.sayHello("Budi");

       employee = new VicePresident("Budi");
       employee.sayHello("Budi");

       sayHello(new Employee("Eko"));
       sayHello(new Manager("Budi"));
       sayHello(new VicePresident("Joko"));
    }

    static void sayHello (Employee employee)
    {
        if(employee instanceof  VicePresident)
        {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello vp "+ employee.name);
        }
        System.out.println("Hello" + employee.name);

    }
}
