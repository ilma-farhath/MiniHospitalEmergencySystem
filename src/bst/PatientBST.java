package bst;

import model.Patient;

public class PatientBST {

    private BSTNode root;

    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private BSTNode insertRec(BSTNode root, Patient patient) {

        if (root == null) {
            return new BSTNode(patient);
        }

        if (patient.getPatientId() < root.patient.getPatientId()) {
            root.left = insertRec(root.left, patient);
        } else {
            root.right = insertRec(root.right, patient);
        }

        return root;
    }

    public Patient search(int patientId) {
        return searchRec(root, patientId);
    }

    private Patient searchRec(BSTNode root, int patientId) {

        if (root == null) {
            return null;
        }

        if (root.patient.getPatientId() == patientId) {
            return root.patient;
        }

        if (patientId < root.patient.getPatientId()) {
            return searchRec(root.left, patientId);
        }

        return searchRec(root.right, patientId);
    }

    public void displayPatients() {
        inorder(root);
    }

    private void inorder(BSTNode root) {

        if (root != null) {

            inorder(root.left);

            System.out.println(root.patient);

            inorder(root.right);
        }
    }

    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    private BSTNode deleteRec(BSTNode root, int patientId) {

        if (root == null)
            return null;

        if (patientId < root.patient.getPatientId()) {

            root.left = deleteRec(root.left, patientId);

        } else if (patientId > root.patient.getPatientId()) {

            root.right = deleteRec(root.right, patientId);

        } else {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            BSTNode minNode = findMin(root.right);

            root.patient = minNode.patient;

            root.right = deleteRec(
                    root.right,
                    minNode.patient.getPatientId()
            );
        }

        return root;
    }

    private BSTNode findMin(BSTNode node) {

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }
}