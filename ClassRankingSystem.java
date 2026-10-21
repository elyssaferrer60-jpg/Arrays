/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classrankingsystem;

/**
 *
 * @author elyssa ferrer
 */
public class ClassRankingSystem {

    static class Student {
        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {
            int sum = 0;

            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            return (double) sum / quizzes.length;
        }
    }

    public static void main(String[] args) {

        String[] names = {
            "Elay", "Ericka", "Joyce", "Elish", "Janiel"
        };

        int[][] quizData = {
            {91, 85, 89, 95},
            {80, 85, 90, 85},
            {95, 92, 94, 91},
            {80, 85, 90, 85},
            {88, 89, 88, 91}
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }


        System.out.println("========== CLASS RANKING ==========");
        System.out.printf("%-8s %-12s %-10s%n",
                "Rank", "Name", "Average");
        System.out.println("---------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                students[i].getAverage()
                    != students[i - 1].getAverage()) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                    rank,
                    students[i].name,
                    students[i].getAverage());
        }

        String targetName = "Elish";
        int studentRank = findRank(students, targetName);

        System.out.println("---------------------------------------");

        if (studentRank != -1) {
            System.out.println(targetName
                    + "'s Rank: " + studentRank);
        } else {
            System.out.println(targetName
                    + " was not found.");
        }
    }

    static int findRank(Student[] students, String name) {

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (students[i].name.equalsIgnoreCase(name)) {
                return rank;
            }

            if (i < students.length - 1 &&
                students[i].getAverage()
                    != students[i + 1].getAverage()) {
                rank = i + 2;
            }
        }

        return -1;
    }
}


