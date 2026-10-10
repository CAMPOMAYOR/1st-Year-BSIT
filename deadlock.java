import java.util.Scanner;

public class deadlock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter events: ");
        int event =sc.nextInt();

        System.out.print("Enter process: ");
        int pro=sc.nextInt();

        System.out.print("Enter resourse: ");
        int res=sc.nextInt();

        int[] process= new int[event];
        int[] action= new int[event];
        int[] resource= new int[event];

        System.out.println("\n===== DEADLOCK SIMULAION =====");

        for(int i=0; i<event; i++){

            System.out.println("\nEvent "+(i+1));

            System.out.print("Enter process (P1 - P"+pro+"): ");
            process[i]=sc.nextInt();

            System.out.println("Choose action: ");
            System.out.println("0-free");
            System.out.println("1-request");
            System.out.println("2-allocated");
            System.out.println("3-release");

            System.out.print("Enter action: ");
            action[i] = sc.nextInt();

            System.out.print("Enter resource (R1-R"+res+"): ");
            resource[i]=sc.nextInt();
        }

        System.out.println("\n===== EVENT SUMMARY =====");
        
        for(int i=0; i<event; i++){
            if (action[i] == 0) {

                System.out.println("Event " + (i + 1) + ": "
                        + "R" + resource[i] + " is FREE");

            } else if (action[i] == 1) {

                System.out.println("Event " + (i + 1) + ": "
                        + "P" + process[i]
                        + " REQUESTS R" + resource[i]);

            } else if (action[i] == 2) {

                System.out.println("Event " + (i + 1) + ": "
                        + "R" + resource[i]
                        + " is ALLOCATED to P" + process[i]);
            } else if (action[i] == 3) {

                System.out.println("Event " + (i + 1) + ": "
                        + "P" + process[i]
                        + " RELEASES R" + resource[i]);
            }
        }

        boolean deadlock = false;
        
        for (int i = 0; i < event; i++) {

            if (action[i] == 1) {

                int requestingProcess = process[i];
                int requestedResource = resource[i];

                boolean released = false;

                for (int k = 0; k < event; k++) {
                    if (action[k] == 3 &&
                        resource[k] == requestedResource) {
                        released = true;
                    }
                }

                for (int j = 0; j < event; j++) {

                    if (action[j] == 2 &&
                        resource[j] == requestedResource &&
                        process[j] != requestingProcess &&
                        !released) {

                        deadlock = true;

                        System.out.println("\nPossible Deadlock:");
                        System.out.println("P" + requestingProcess
                                + " is requesting R" + requestedResource);

                        System.out.println("But R" + requestedResource
                                + " is allocated to P" + process[j]);
                    }
                }
            }
        }
            
        if (deadlock) {
            System.out.println("\nDeadlock Detected!");
        } else {
            System.out.println("\nNo Deadlock Detected.");
        }

    }
}
