package bst;

import model.Patient;

public class BSTNode {

    Patient patient;
    BSTNode left;
    BSTNode right;

    public BSTNode(Patient patient) {
        this.patient = patient;
    }
}