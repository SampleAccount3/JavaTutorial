public class IT extends Human implements IworkAble, IcompanyAble {


    public IT(String name, int age) {
        super(name, age);
    }
    @Override
    public String getJob() {
        return "Programmer";
    }

    @Override
    public int getSalary() {
        return 123;
    }

    @Override
    public String getCompanyName() {
        return "Wilcon";
    }

    @Override
    public String getCompanyAddress() {
        return "Quezon";
    }

    // Method to display information
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Company Name: " + getCompanyName());
        System.out.println("Company Address: " + getCompanyAddress());
        System.out.println("Job: " + getJob());
        System.out.println("Salary: " + getSalary());
    }
}
