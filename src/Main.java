import model.Patient;
import model.Visit;
import service.HospitalService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalService hospital = new HospitalService();

        while (true) {

            System.out.println("\n===== MINI HOSPITAL EMERGENCY MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Display Patients");

            System.out.println("5. Add Emergency Patient");
            System.out.println("6. Treat Next Patient");
            System.out.println("7. Display Emergency Queue");

            System.out.println("8. Add Treatment Record");
            System.out.println("9. Remove Latest Treatment");
            System.out.println("10. Display Treatment History");

            System.out.println("11. Add Visit");
            System.out.println("12. Search Visit");
            System.out.println("13. Remove Visit");
            System.out.println("14. Display Visit History");

            System.out.println("15. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Contact Number: ");
                    String contact = sc.nextLine();

                    System.out.print("Medical Condition: ");
                    String condition = sc.nextLine();

                    Patient patient =
                            new Patient(id, name, age,
                                    contact, condition);

                    hospital.patientBST.insert(patient);

                    System.out.println("Patient Added!");
                    break;

                case 2:

                    System.out.print("Enter Patient ID: ");
                    int searchId = sc.nextInt();

                    Patient found =
                            hospital.patientBST.search(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Patient Not Found");

                    break;

                case 3:

                    System.out.print("Enter Patient ID: ");
                    int deleteId = sc.nextInt();

                    hospital.patientBST.delete(deleteId);

                    System.out.println("Patient Deleted");
                    break;

                case 4:

                    hospital.patientBST.displayPatients();
                    break;

                case 5:

                    System.out.print("Enter Existing Patient ID: ");
                    int queueId = sc.nextInt();

                    Patient queuePatient =
                            hospital.patientBST.search(queueId);

                    if (queuePatient != null) {

                        hospital.emergencyQueue.enqueue(queuePatient);

                    } else {

                        System.out.println("Patient Not Found");
                    }

                    break;

                case 6:

                    Patient treated =
                            hospital.emergencyQueue.dequeue();

                    if (treated != null) {

                        System.out.println(
                                "Now Treating: "
                                        + treated.getName());

                        hospital.treatmentStack.pushTreatment(
                                "Treatment completed for "
                                        + treated.getName()
                        );
                    }

                    break;

                case 7:

                    hospital.emergencyQueue.displayQueue();
                    break;

                case 8:

                    System.out.print("Enter Treatment Record: ");

                    String record = sc.nextLine();

                    hospital.treatmentStack.pushTreatment(record);

                    break;

                case 9:

                    hospital.treatmentStack.popTreatment();

                    break;

                case 10:

                    hospital.treatmentStack.displayTreatments();

                    break;

                case 11:

                    System.out.print("Visit ID: ");
                    int visitId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Visit Date: ");
                    String date = sc.nextLine();

                    System.out.print("Doctor Name: ");
                    String doctor = sc.nextLine();

                    System.out.print("Diagnosis: ");
                    String diagnosis = sc.nextLine();

                    System.out.print("Treatment: ");
                    String treatment = sc.nextLine();

                    Visit visit =
                            new Visit(
                                    visitId,
                                    date,
                                    doctor,
                                    diagnosis,
                                    treatment
                            );

                    hospital.visitLinkedList.addVisit(visit);

                    System.out.println("Visit Added");

                    break;

                case 12:

                    System.out.print("Enter Visit ID: ");
                    int searchVisitId = sc.nextInt();

                    Visit visitFound =
                            hospital.visitLinkedList
                                    .searchVisit(searchVisitId);

                    if (visitFound != null)
                        System.out.println(visitFound);
                    else
                        System.out.println("Visit Not Found");

                    break;

                case 13:

                    System.out.print("Enter Visit ID: ");
                    int removeVisitId = sc.nextInt();

                    hospital.visitLinkedList
                            .removeVisit(removeVisitId);

                    System.out.println("Visit Removed");

                    break;

                case 14:

                    hospital.visitLinkedList.displayVisits();

                    break;

                case 15:

                    System.out.println("System Closed");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}