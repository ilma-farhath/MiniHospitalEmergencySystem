package stack;

import java.util.Stack;

public class TreatmentStack {

    private Stack<String> stack;

    public TreatmentStack() {
        stack = new Stack<>();
    }

    public void pushTreatment(String treatment) {

        stack.push(treatment);

        System.out.println("Treatment stored.");
    }

    public void popTreatment() {

        if(stack.isEmpty()) {

            System.out.println("No treatment records.");
            return;
        }

        System.out.println(
                "Removed: " + stack.pop()
        );
    }

    public void displayTreatments() {

        if(stack.isEmpty()) {

            System.out.println("No records.");
            return;
        }

        for(String record : stack) {
            System.out.println(record);
        }
    }
}