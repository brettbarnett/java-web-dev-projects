package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0; //This is the total number of credits for ALL classes
    private double gpa = 0.0;

    private double totalQualityScore = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits <= 29) {
            return "Freshman";
        }
        else if (numberOfCredits <= 59) {
            return "Sophomore";
        }
        else if (numberOfCredits <= 89) {
            return "Junior";
        }
        else {
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        //Add the course credits for this class to the total number of credits for ALL classes
        numberOfCredits += courseCredits;

        //Calculate the quality score for this class
        double qualityScore = grade * courseCredits;

        //Add the quality score for this class to the quality score for ALL classes
        totalQualityScore += qualityScore;

        //Calculate the GPA based on the quality score and credits for ALL classes
        gpa = totalQualityScore / numberOfCredits;

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                ", totalQualityScore=" + totalQualityScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(gpa, student.gpa) == 0 && Double.compare(totalQualityScore, student.totalQualityScore) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa, totalQualityScore);
    }

    public static void main(String[] args) {
//        Student sally = new Student("Sally",1,1,4.0);
//        System.out.println("The Student class works! " + sally.getName() + " is a student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);

        Student brett = new Student("Brett");
        brett.addGrade(3, 4);
        brett.addGrade(4, 3);
        System.out.println(brett.getGpa());
    }
}