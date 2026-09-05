package bst;

import model.Patient;

// This class creates a node for the Binary Search Tree
public class BSTNode {

    // Store patient information
    Patient patient;

    // Reference to left child node
    BSTNode left;

    // Reference to right child node
    BSTNode right;

    // Constructor to create a new BST node
    public BSTNode(Patient patient) {
        this.patient = patient;
    }
}