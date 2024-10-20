class Student{
    int id;
    String name;
    int marks;
}

class Array {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "ADiking";
        s1.marks = 90;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Dada";
        s2.marks = 67;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Parthh";
        s3.marks = 34;

        Student students[] = new Student[3];
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;

        for(Student stud : students){
            System.out.println(stud.name + " : "+ stud.marks);
        }
    }
    
}
