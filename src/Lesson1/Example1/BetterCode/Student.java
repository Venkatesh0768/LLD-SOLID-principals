    package Lesson1.Example1.BetterCode;

    public class Student {
        private  int id;
        public Student(int id){
            this.id = id;
        }

        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService();

    }
