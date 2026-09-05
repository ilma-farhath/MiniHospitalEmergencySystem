package service;

import bst.PatientBST;
import queue.EmergencyQueue;
import stack.TreatmentStack;
import linkedlist.VisitLinkedList;

public class HospitalService {

    public PatientBST patientBST =
            new PatientBST();

    public EmergencyQueue emergencyQueue =
            new EmergencyQueue();

    public TreatmentStack treatmentStack =
            new TreatmentStack();

    public VisitLinkedList visitLinkedList =
            new VisitLinkedList();
}