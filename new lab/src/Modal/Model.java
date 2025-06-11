/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.util.List;

/**
 *
 * @author SP23-BSE-024
 */

public class Model {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getAverageGpa() {
        if (students == null || students.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }

    public int countAboveAverage() {
        double avg = getAverageGpa();
        int count = 0;
        for (Student s : students) {
            if (s.getGpa() > avg) {
                count++;
            }
        }
        return count;
    }

    public int countBelowAverage() {
        double avg = getAverageGpa();
        int count = 0;
        for (Student s : students) {
            if (s.getGpa() < avg) {
                count++;
            }
        }
        return count;
    }
}

