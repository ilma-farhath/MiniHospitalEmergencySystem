package stack;

import java.util.Stack;

// This class manages treatment records using a Stack
public class TreatmentStack {

    // Stack to store completed treatment records
    private Stack<String> stack;

    // Constructor to create a new stack
    public TreatmentStack() {
        stack = new Stack<>();
    }

    // Add a treatment record to the stack
    public void pushTreatment(String treatment) {

        // Store treatment record at the top of the stack
        stack.push(treatment);

        // Display confirmation message
        System.out.println("Treatment stored.");
    }

    // Remove the most recent treatment record
    public void popTreatment() {

        // Check if the stack is empty
        if (stack.isEmpty()) {

            System.out.println("No treatment records.");
            return;
        }

        // Remove and display the latest treatment record
        System.out.println(
                "Removed: " + stack.pop()
        );
    }

    // Display all treatment records
    public void displayTreatments() {

        // Check if the stack is empty
        if (stack.isEmpty()) {

            System.out.println("No records.");
            return;
        }

        // Display each treatment record
        for (String record : stack) {
            System.out.println(record);
        }
    }
}