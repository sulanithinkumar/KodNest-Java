
class Student {

    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj; // down casting

        if (this.roll == s.roll && this.name == s.name) {
            return true;
        } else {
            return false;
        }
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
