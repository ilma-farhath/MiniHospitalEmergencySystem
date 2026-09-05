package model;

// This class stores patient information
public class Patient {

    // Unique ID for each patient
    private int patientId;

    // Patient name
    private String name;

    // Patient age
    private int age;

    // Patient contact number
    private String contactNumber;

    // Patient medical condition
    private String medicalCondition;

    // Constructor to create a patient object
    public Patient(int patientId, String name, int age,
                   String contactNumber, String medicalCondition) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    // Get patient ID
    public int getPatientId() {
        return patientId;
    }

    // Get patient name
    public String getName() {
        return name;
    }

    // Get patient age
    public int getAge() {
        return age;
    }

    // Get patient contact number
    public String getContactNumber() {
        return contactNumber;
    }

    // Get patient medical condition
    public String getMedicalCondition() {
        return medicalCondition;
    }

    // Display patient details
    @Override
    public String toString() {
        return "ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age +
                ", Contact: " + contactNumber +
                ", Condition: " + medicalCondition;
    }
}