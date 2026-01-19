import java.util.Scanner;

public class receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("          PURCHASE RECEIPT SYSTEM");
        System.out.println("            INPUT DETAILS BELOW");
        System.out.println("*****************************************");

        System.out.print("Enter Cashier Name:        ");
        String name = sc.nextLine();

        System.out.print("Enter O.R No.:             ");
        int no = sc.nextInt();
        sc.nextLine();

        System.out.print("Date (MM/DD/YYYY):         ");
        String datte = sc.nextLine();

        System.out.println("*****************************************");

        System.out.print("Enter Number of Items:     ");
        int noitems = sc.nextInt();
        sc.nextLine();

        System.out.println("*****************************************");

        String[] list = new String[noitems];
        double[] price = new double[noitems];
        int[] quan = new int[noitems];

        for (int i = 0; i < noitems; i++) {
            System.out.print("Enter Item Name:           ");
            list[i] = sc.nextLine();

            System.out.print("Enter Item Price:          ");
            price[i] = sc.nextDouble();

            System.out.print("Enter Item Quantity:       ");
            quan[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("-----------------------------------------");
        }

        double total = 0;
        for (int i = 0; i < noitems; i++) {
            total += quan[i] * price[i];
        }

        double vat = total * 0.05;
        double pay = total + vat;

        System.out.println("Total payment:             PHP " + pay);
        System.out.println("*****************************************");

        double payment;
        do {
            System.out.print("Enter Customer Payment:    ");
            payment = sc.nextDouble();
        } while (payment < pay);

        double change = payment - pay;

        System.out.println();
        System.out.println("*****************************************");
        System.out.println("        RION Franchise and Store");
        System.out.println("       Lapu-Lapu Ext., Digos City");
        System.out.println("     Tel.#: 870-000 Fax: 0987654321");
        System.out.println("         GST Reg. No. 000111223");
        System.out.println();
        System.out.println("             PURCHASE RECEIPT");
        System.out.println("Cashier: " + name);
        System.out.println("Date: " + datte + "        O.R No: " + no);
        System.out.println("*****************************************");
        System.out.println("Qty.       Item/s          Price");
        System.out.println("-----------------------------------------");

       for (int i = 0; i < noitems; i++) {
        System.out.printf("%-10d %-15s PHP %.2f%n",
        quan[i], list[i], price[i]);
    }



        System.out.println("*****************************************");
        System.out.println("Subtotal:                 PHP "+String.format("%.2f", total));
        System.out.println("VAT (5%):                 PHP "+String.format("%.2f", vat));
        System.out.println();
        System.out.println("Total:                    PHP "+String.format("%.2f", pay));
        System.out.println("Cash:                     PHP "+ String.format("%.2f",payment));
        System.out.println("Change:                   PHP "+String.format("%.2f", change));
        System.out.println();
        System.out.println("----------Thank You Come Again!----------");
        System.out.println();
    }
}

