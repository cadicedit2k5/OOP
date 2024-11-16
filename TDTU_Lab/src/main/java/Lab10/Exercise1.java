/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author ADMIN
 */
public class Exercise1 {
    public static class Student {
        private String name;
        private String address;
        private String sex;
        private double score;

        public Student(String name, String address, String sex, double score) {
            this.name = name;
            this.address = address;
            this.sex = sex;
            this.score = score;
        }
        
        public class StudentOperator {
            public void print() {
                System.out.printf("Student[\" %s\", \" %s\", \" %s\", \" %.1f\"]", getName(), getAddress(), getSex(), getScore());
            }
            
            public String type() {
                if (getScore() > 8) return "A";
                else if (getScore() >= 5) return "B";
                return "C";
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Nhut", "Tan Tuc", "Nam", 10);
        Student st2 = new Student("HeheBoiz", "TPHCM", "Nam", 9.9);
        // nếu main không trong cùng class thì phải Student.StudentOperator operator = new Student.StudentOperator(); 
//        StudentOperator operator = new StudentOperator();

        Student.StudentOperator operator1 = st1.new StudentOperator();
        Student.StudentOperator operator2 = st2.new StudentOperator();

        // Printing student details and grades
        operator1.print(); // Print details of st1
        operator2.print(); // Print details of st2
        System.out.println(operator1.type()); // Type of st1
        System.out.println(operator2.type()); // Type of st2
    }
}
