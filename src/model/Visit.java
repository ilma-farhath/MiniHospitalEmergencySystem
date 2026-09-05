package model;

// This class stores information about a patient visit
public class Visit {

    // Unique ID for each visit
    private int visitId;

    // Date of the hospital visit
    private String visitDate;

    // Name of the doctor
    private String doctorName;

    // Patient diagnosis details
    private String diagnosis;

    // Treatment given to the patient
    private String treatment;

    // Reference to the next node in the linked list
    public Visit next;

    // Constructor to create a new visit object
    public Visit(int visitId, String visitDate,
                 String doctorName,
                 String diagnosis,
                 String treatment) {

        this.visitId = visitId;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    // Return the visit ID
    public int getVisitId() {
        return visitId;
    }

    // Display visit information
    @Override
    public String toString() {
        return "Visit ID: " + visitId +
                ", Date: " + visitDate +
                ", Doctor: " + doctorName +
                ", Diagnosis: " + diagnosis +
                ", Treatment: " + treatment;
    }
}