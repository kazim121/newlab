/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author SP23-BSE-024
 */
public class View {
    public void printStatistics(double averageGpa, int aboveCount, int belowCount) {
        System.out.println("GPA Average: " + averageGpa);
        System.out.println("Number of students above average GPA: " + aboveCount);
        System.out.println("Number of students below average GPA: " + belowCount);
    }
}
