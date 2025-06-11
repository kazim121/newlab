/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author SP23-BSE-024
 */


import Modal.Student;
import Modal.Model;
import view.View;
import Controller.Controller;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        Student s1 = new Student("Alice", 3.5);
        Student s2 = new Student("Bob", 2.8);
        Student s3 = new Student("Charlie", 3.9);
        Student s4 = new Student("Diana", 3.2);

        controller.setStudents(Arrays.asList(s1, s2, s3, s4));
        controller.updateView();
    }
}
