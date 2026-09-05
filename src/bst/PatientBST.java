package bst;

import model.Patient;

// This class manages patient records using a Binary Search Tree (BST)
public class PatientBST {

    // Root node of the BST
    private BSTNode root;

    // Add a new patient to the BST
    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    // Recursive method to insert a patient
    private BSTNode insertRec(BSTNode root, Patient patient) {

        // If tree is empty, create a new node
        if (root == null) {
            return new BSTNode(patient);
        }

        // Insert to left side if ID is smaller
        if (patient.getPatientId() < root.patient.getPatientId()) {
            root.left = insertRec(root.left, patient);

        // Insert to right side if ID is larger
        } else {
            root.right = insertRec(root.right, patient);
        }

        return root;
    }

    // Search a patient using patient ID
    public Patient search(int patientId) {
        return searchRec(root, patientId);
    }

    // Recursive search method
    private Patient searchRec(BSTNode root, int patientId) {

        // Patient not found
        if (root == null) {
            return null;
        }

        // Patient found
        if (root.patient.getPatientId() == patientId) {
            return root.patient;
        }

        // Search left side
        if (patientId < root.patient.getPatientId()) {
            return searchRec(root.left, patientId);
        }

        // Search right side
        return searchRec(root.right, patientId);
    }

    // Display all patients in ascending order
    public void displayPatients() {
        inorder(root);
    }

    // In-order traversal of BST
    private void inorder(BSTNode root) {

        if (root != null) {

            // Visit left subtree
            inorder(root.left);

            // Print current patient
            System.out.println(root.patient);

            // Visit right subtree
            inorder(root.right);
        }
    }

    // Delete a patient from BST
    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    // Recursive delete method
    private BSTNode deleteRec(BSTNode root, int patientId) {

        // Patient not found
        if (root == null)
            return null;

        // Search left side
        if (patientId < root.patient.getPatientId()) {

            root.left = deleteRec(root.left, patientId);

        // Search right side
        } else if (patientId > root.patient.getPatientId()) {

            root.right = deleteRec(root.right, patientId);

        } else {

            // Node found

            // Case 1: No left child
            if (root.left == null)
                return root.right;

            // Case 2: No right child
            if (root.right == null)
                return root.left;

            // Case 3: Node has two children
            // Find the smallest node in the right subtree
            BSTNode minNode = findMin(root.right);

            // Replace current patient with minimum node
            root.patient = minNode.patient;

            // Delete duplicate node
            root.right = deleteRec(
                    root.right,
                    minNode.patient.getPatientId()
            );
        }

        return root;
    }

    // Find the smallest node in a subtree
    private BSTNode findMin(BSTNode node) {

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }
}