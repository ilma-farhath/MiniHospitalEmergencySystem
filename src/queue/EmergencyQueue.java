package queue;

import model.Patient;
import java.util.LinkedList;
import java.util.Queue;

// This class manages emergency patients using a Queue
public class EmergencyQueue {

    // Queue to store emergency patients
    private Queue<Patient> queue;

    // Constructor to create a new queue
    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    // Add a patient to the emergency queue
    public void enqueue(Patient patient) {

        // Add patient to the end of the queue
        queue.add(patient);

        // Display confirmation message
        System.out.println(
                patient.getName() +
                " added to emergency queue."
        );
    }

    // Remove the next patient from the queue
    public Patient dequeue() {

        // Check whether the queue is empty
        if (queue.isEmpty()) {

            System.out.println("Queue is empty.");
            return null;
        }

        // Remove and return the first patient in the queue
        return queue.poll();
    }

    // Display all patients currently waiting
    public void displayQueue() {

        // Check whether the queue is empty
        if (queue.isEmpty()) {

            System.out.println("Queue is empty.");
            return;
        }

        // Display all patients in the queue
        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }
}