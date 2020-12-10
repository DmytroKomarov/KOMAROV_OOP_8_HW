package pkg_task2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Worker workers[] = new Worker[5];
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        LocalDate localDate = LocalDate.now();
        int yearCurrent = localDate.getYear();

        System.out.println("Enter a description of 5 employees");
        for (int i = 0; i < workers.length ; i++) {

            System.out.println("Employee #" + (i+1) + ", (fullName, position, employment year)");

            try {
                workers[i] = new Worker(sc1.nextLine(),sc2.nextLine(),sc3.nextInt());
            } catch (Exception e)
            {
                System.out.println("Mismatch data format (Employment year)");
                System.exit(0);
            }

            System.out.println();

        }

        Arrays.sort(workers, new Comparator<Worker>() {
            public int compare(Worker a, Worker b) {
                return a.getFullName().compareTo(b.getFullName());
            }
        });

        for (Worker worker : workers) {
            if (localDate.getYear() - worker.getEmploymentУear()>3) {
                System.out.println("Employee working more than 3 years: " + worker.getFullName() +
                                   ", position: " + worker.getPosition() +
                                   ", employment year: " + worker.getEmploymentУear());
            }
        }
    }


}
