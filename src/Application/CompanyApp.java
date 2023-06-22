package Application;

import data.Company;

public class CompanyApp
{
    public static void main(String[] args)
    {
        Company company = new Company();
        company.setName("Hello world");

        Company.Employee employee = company.new Employee();

        employee.setName("Srul");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
