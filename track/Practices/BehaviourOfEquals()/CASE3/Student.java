
import java.util.Objects;

class Student {

    int roll;
    String name;

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
