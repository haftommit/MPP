package week1lesson3;

import java.util.Scanner;

/**
 * @author haftomtesfay
 *
 */
public class CarrierApp {

	public static void getCost() {

		String desc;
		String zone;
		double weight;
		// double cost;
		Package pck; // upsPck, usMailPck, fedexPck;
		// ArrayList<Package> packageList;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sender type as S for student, E for senior");
		String sender = sc.nextLine();
		System.out.println("Enter Descripton of the package");
		desc = sc.nextLine();
		System.out.println("Enter zone");
		zone = sc.nextLine();
		System.out.println("Enter the weight of the package");
		weight = sc.nextDouble();
		pck = new UPS(desc, weight, zone, sender);
		double upsCost = pck.cost();
		pck = new USMail(desc, weight, zone, sender);
		double usMailCost = pck.cost();
		pck = new FedEx(desc, weight, zone, sender);
		double fedexCost = pck.cost();
		double discount;
		if (pck.sender == "S")
			discount = 0.1;
		else if (pck.sender == "E")
			discount = 0.15;
		else
			discount = 0;

		if (upsCost > usMailCost && upsCost > fedexCost)
			System.out.printf(pck.description + "\t" + (upsCost -= upsCost * discount) + "\t" + "UPS");
		else if (usMailCost > upsCost && usMailCost > fedexCost)
			System.out.printf(pck.description + "\t" + (usMailCost -= usMailCost * discount) + "\t" + "USMail");
		else
			System.out.printf(pck.description + "\t" + (fedexCost -= fedexCost * discount) + "\t" + "FedEx");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				getCost();
				System.out.println("Enter q to Quit c to continue");
				String quit = sc.nextLine();
				char ch = quit.charAt(0);
				if (ch == 'q' || ch == 'Q')
					break;
			}

		} catch (Exception ex)

		{
			ex.printStackTrace();
		}

	}
}