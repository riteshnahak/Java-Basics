package comparator;

public class Student implements Comparable<Student>{
    // for comparing anything instead of integer it should implement comparable
    // sort is implementing comparable
    int age;
    String name;
    String tech;

    public Student(int age, String name, String tech) {
        this.age = age;
        this.name = name;
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }


    // For ascending sorting
//    @Override
//    public int compareTo(Student that) {
//        return this.age- that.age;
//        // first object -Second object
//    }

    // for descending sorting
//    @Override
//    public int compareTo(Student that) {
//        return that.age-this.age;
//    }

    // for name sorting in ascending i.e a to z
//    @Override
//    public int compareTo(Student that) {
//        return this.name.compareTo(that.name);
//    }


    // for name sorting in descending i.e z to a
    @Override
    public int compareTo(Student that) {
        return that.name.compareTo(this.name);
    }



}
