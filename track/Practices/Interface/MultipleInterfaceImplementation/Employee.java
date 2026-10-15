
class Employee implements Work, Project {

    public void work() {
        System.out.println("Employee working");
    }

    public void doProject() {
        System.out.println("Employee doing project");
    }
}
