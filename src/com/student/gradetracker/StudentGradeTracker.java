package com.student.gradetracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentGradeTracker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Double> studentGradeList = new ArrayList<>();
		System.out.println("Enter the number of Students for which you want to compute the grades");
		double numberOfStudents = input.nextInt();
		for (int i = 1; i <= numberOfStudents; i++) {
			System.out.println("Enter Grades for the Students");
			double grade = input.nextDouble();
			if (grade < 0 || grade > 100) {
				System.out.println("Not a valid grade, please enter valid grade");
				i--;
			} else {
				studentGradeList.add(grade);
			}
		}
		System.out.println(studentGradeList);
		input.close();
		
		Double averageGrade = averageGrade(studentGradeList);
		System.out.println("Average Grade is : " + averageGrade);
		
		Double highestGrade = highestGrade(studentGradeList);
		System.out.println("Highest Grade is : " + highestGrade);
		
		Double lowestGrade = lowestGrade(studentGradeList);
		System.out.println("Lowest Grade is : " + lowestGrade);
	}

	private static double averageGrade(List<Double> studentGradeList) {
		return avg(studentGradeList);
	}

	private static double highestGrade(List<Double> studentGradeList) {
		return Collections.max(studentGradeList);
	}

	private static double lowestGrade(List<Double> studentGradeList) {
		return Collections.min(studentGradeList);
	}

	private static double avg(List<Double> studentGradeList) {
		double sum = 0;
		for (double grade : studentGradeList) {
			sum = sum + grade;
		}
		double average = (sum / studentGradeList.size());
		return average;
	}
}
