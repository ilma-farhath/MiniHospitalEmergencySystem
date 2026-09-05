package linkedlist;

import model.Visit;

public class VisitLinkedList {

    private Visit head;

    public void addVisit(Visit visit) {

        if(head == null) {
            head = visit;
            return;
        }

        Visit current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = visit;
    }

    public Visit searchVisit(int visitId) {

        Visit current = head;

        while(current != null) {

            if(current.getVisitId() == visitId)
                return current;

            current = current.next;
        }

        return null;
    }

    public void removeVisit(int visitId) {

        if(head == null)
            return;

        if(head.getVisitId() == visitId) {
            head = head.next;
            return;
        }

        Visit current = head;

        while(current.next != null &&
                current.next.getVisitId() != visitId) {

            current = current.next;
        }

        if(current.next != null) {
            current.next = current.next.next;
        }
    }

    public void displayVisits() {

        Visit current = head;

        while(current != null) {

            System.out.println(current);

            current = current.next;
        }
    }
}