// Resolução exercicio - Curso Java COMPLETO 2020 Programação Orientada a Objetos +Projetos(Autoria de Prof.Dr.Nelio Alves)//
package exercises;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date d1 = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date d2 = sdf.parse(sc.next());
		
		if(!d2.after(d1)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
		Reservation r1 = new Reservation(roomNumber, d1, d2);
		System.out.println(r1);
		
		System.out.println();
		System.out.println("Enter Data to update the reservation:");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		d1 = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		d2 = sdf.parse(sc.next());
		
		Date now = new Date();
		if(d1.before(now) || d2.before(now)) {
			System.out.println("Error in reservation: Reservation dates for update must be future dates");
		}
		else {
			if(!d2.after(d1)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
			else {
				r1.updateDates(d1, d2);
				System.out.println(r1);
			}
		}
	
		}
		
		
		sc.close();
	}

}

