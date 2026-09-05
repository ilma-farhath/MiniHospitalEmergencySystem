package linkedlist;

import model.Visit;

// This class manages patient visit history using a Singly Linked List
public class VisitLinkedList {

    // Stores the first visit node in the list
    private Visit head;

    // Add a new visit to the linked list
    public void addVisit(Visit visit) {

        // If the list is empty, make this visit the first node
        if (head == null) {
            head = visit;
            return;
        }

        // Start from the first node
        Visit current = head;

        // Move to the last node in the list
        while (current.next != null) {
            current = current.next;
        }

        // Add the new visit at the end
        current.next = visit;
    }

    // Search for a visit using Visit ID
    public Visit searchVisit(int visitId) {

        // Start searching from the first node
        Visit current = head;

        // Continue until the end of the list
        while (current != null) {

            // Check whether the current visit ID matches
            if (current.getVisitId() == visitId)
                return current;

            // Move to next node
            current = current.next;
        }

        // Return null if visit is not found
        return null;
    }

    // Remove a visit from the linked list
    public void removeVisit(int visitId) {

        // Check if the list is empty
        if (head == null)
            return;

        // If the first node contains the visit ID
        if (head.getVisitId() == visitId) {
            head = head.next;
            return;
        }

        // Start from the first node
        Visit current = head;

        // Find the node before the visit to be removed
        while (current.next != null &&
                current.next.getVisitId() != visitId) {

            current = current.next;
        }

        // Remove the visit node if found
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Display all visits stored in the linked list
    public void displayVisits() {

        // Start from the first node
        Visit current = head;

        // Traverse through the entire list
        while (current != null) {

            // Print visit details
            System.out.println(current);

            // Move to the next node
            current = current.next;
        }
    }
}