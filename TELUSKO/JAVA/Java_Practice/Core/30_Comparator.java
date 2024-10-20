import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student age = "+age+ " name is "+name+".";
    }

    public int compareTo(Student that) {
        if(this.age>that.age){
            return 1;
        }else{
            return -1;
        }
    }
}

class Comparatorss {
    public static void main(String[] args) {

        Comparator<Student> com = (i,j)-> i.age>j.age ? 1:-1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "ADiking"));
        studs.add(new Student(98, "Pranav"));
        studs.add(new Student(29, "Parth"));
        studs.add(new Student(26, "Tirth"));

        Collections.sort(studs,com);
        // Collections.sort(studs); // w/o using comaprator
        for(Student s : studs){
            System.out.println(s);
        }
        
    }
}
