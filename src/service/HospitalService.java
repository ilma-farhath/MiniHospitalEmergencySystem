package service;

import bst.PatientBST;
import queue.EmergencyQueue;
import stack.TreatmentStack;
import linkedlist.VisitLinkedList;

// This class connects all data structures used in the system
public class HospitalService {

    // Object used to manage patient records using BST
    public PatientBST patientBST =
            new PatientBST();

    // Object used to manage emergency patients using Queue
    public EmergencyQueue emergencyQueue =
            new EmergencyQueue();

    // Object used to manage completed treatments using Stack
    public TreatmentStack treatmentStack =
            new TreatmentStack();

    // Object used to manage patient visit history using Linked List
    public VisitLinkedList visitLinkedList =
            new VisitLinkedList();
}