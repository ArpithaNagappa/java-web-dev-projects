//package main.java.org.launchcodePart2;
//
//import java.util.ArrayList;
//
//public class Course {
//    private String topic;
//   // private Teacher instructor;
//    private String name;
//    private ArrayList<Student> enrolledStudents;
//    private int worthNumberOfCredits;
//
//    public Course(String name , int worthNumberOfCredits) {
//        this.name = name;
//        this.worthNumberOfCredits = worthNumberOfCredits;
//    }
//
//    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
//    //  just the class fields.
//    public String toString(){
//    return this.name + " is worth " + this.worthNumberOfCredits + "number of credits.";
//    }
//
//    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
//    //  Course objects equal.
//    public boolean equals(Object toBeCompared){
//
//        if (toBeCompared == this) {
//            return true;
//        }
//
//        if (toBeCompared == null) {
//            return false;
//        }
//
//        if (toBeCompared.getClass() != getClass()) {
//            return false;
//        }
//
//        Student theStudent = (Student) toBeCompared;
//        return theStudent.getStudentId() == getStudentId();
//    }
//
//    private int getStudentId() {
//
//    }
//}
