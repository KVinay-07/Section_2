class Student {

    String studentName;
    int rollNo;
    int marks;
    String courseName;
    int courseCredits;
    double initialFee;
    double finalFee;
    double scholarship;


    Student(String studentName,int rollNo,int marks,String courseName,int courseCredits) {

        this.studentName = studentName;
        this.rollNo = rollNo;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;

    }

        void calculateFee(int courseCredits) {
            initialFee = courseCredits*1500;

            System.out.println("Initial Fees   : "+initialFee);

        }

        void checkEligibility (int marks) {

            if(marks >= 50 ) {
                System.out.println("Eligibility    : True");
            }

            else {
                System.out.println("Eligibility    : False");
            }
        }

        void calculateScholarship(int marks) {



            if(marks >= 85) {
                scholarship = initialFee*0.2;
            }

            else if (marks <= 84 && marks>=74) {
                scholarship = initialFee*0.1;
            }

            else {
                scholarship = 0;
            }
        }

        void calculateFinalFee() {
            finalFee = initialFee - scholarship;

            System.out.println("Final Fee      : "+finalFee);
        }

        void displayDetails() {
            System.out.println("Student Name   : "+studentName);
            System.out.println("Student RollNo : "+rollNo);
            System.out.println("Student Marks  : "+marks);
            System.out.println("Course Name    : "+courseName);
            System.out.println("Course Credits : "+courseCredits);

            checkEligibility(marks);
            calculateFee(courseCredits);
            calculateScholarship(marks);
            calculateFinalFee();

        }
    
}

public class Hackathon_2 {
    public static void main(String[] args) {

    Student obj = new Student("Bob", 120, 90, "PSPJ", 168);

        System.out.println("==========================================");
        System.out.println("*** STUDENT COURSE REGISTRATION SYSTEM ***");
        System.out.println("==========================================");
        System.out.println();
        obj.displayDetails();
        System.out.println("==========================================");
    }   
}
