// Resolução exercicio - Curso Java COMPLETO 2020 Programação Orientada a Objetos +Projetos(Autoria de Prof.Dr.Nelio Alves)//
package exercises;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date d1 = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date d2 = sdf.parse(sc.next());
			
			Reservation r1 = new Reservation(roomNumber, d1, d2);
			System.out.println(r1);
			
			System.out.println();
			System.out.println("Enter Data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			d1 = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			d2 = sdf.parse(sc.next());
			
			r1.updateDates(d1, d2);
			System.out.println(r1);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}

