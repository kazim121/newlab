/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author SP23-BSE-024
 */


import Modal.Model;
import Modal.Student;
import view.View;

import java.util.List;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setStudents(List<Student> students) {
        model.setStudents(students);
    }

    public void updateView() {
        double avg = model.getAverageGpa();
        int above = model.countAboveAverage();
        int below = model.countBelowAverage();
        view.printStatistics(avg, above, below);
    }
}
