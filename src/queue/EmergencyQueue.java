package queue;

import model.Patient;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue;

    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Patient patient) {

        queue.add(patient);

        System.out.println(
                patient.getName() +
                " added to emergency queue."
        );
    }

    public Patient dequeue() {

        if(queue.isEmpty()) {

            System.out.println("Queue is empty.");
            return null;
        }

        return queue.poll();
    }

    public void displayQueue() {

        if(queue.isEmpty()) {

            System.out.println("Queue is empty.");
            return;
        }

        for(Patient patient : queue) {
            System.out.println(patient);
        }
    }
}