import java.util.Scanner;
import patients.Patient;

public class Main

{
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of patients: ");
        int p = scanner.nextInt();

        Patient[] patients = new Patient[p];

        for (int i = 0; i < p; i++)

        {
            System.out.print("Enter Patient Id: ");
            int pid = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Patient Name: ");
            String pname = scanner.nextLine();

            System.out.print("Enter History: ");
            String history = scanner.nextLine();

            System.out.print("Enter Medicines: ");
            String medicines = scanner.nextLine();

            patients[i] = new Patient(pid, pname, history);

            patients[i].setMedicines(medicines);
        }

        System.out.println("Medicines for all patients:");

        for (int i = 0; i < patients.length; i++)

        {
            System.out.println("Patient ID: " + patients[i].getPid() + ", Medicines: " + patients[i].getMedicines());
        }


    }
}