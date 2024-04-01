package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList <Double> examScores) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName) {
        this.firstName = firstName;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }
    public String getExamScores() {
        return examScores.toString();
    }
    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.add(examNumber, newScore);
    }

    public Double getAverageExamScore(){
double sum = 0.0;
for (Double examNumbers : examScores )
        sum += examNumbers / getNumberOfExamsTaken();
       return sum;
    }

    @Override
    public String toString(){
        String output = "Student Name: " + firstName + " " + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n" +
                "> Exam Scores:\n";
        for(int i = 0; i < examScores.size(); i++){
            output += "\t\tExam " + (i + 1) + " -> " + examScores.get(i) + "\n";
        }
        return output;
}

    public void sort(Comparator<Student> reversed) {
    }
}


