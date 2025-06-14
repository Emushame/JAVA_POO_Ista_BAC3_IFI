/**
 * 
 */
package gestion_Etudiant;

import java.io.*;
import java.util.Scanner;
/**
 * Cette classe permet de faire la gestion des etudiants
 * Qui vont venir s'inscrire dans une université X
 */
public class Etudiant {
	// La creation de mes differents attributs
	public String Nom;
	public String Id;
	public String Promotion;
	
	//Creation du constructeur
	public Etudiant(String Nom, String Id, String Promotion) {
		this.Nom = Nom;
		this.Id = Id;
		this.Promotion = Promotion;
	}
	
	//Creation des getters et des setters
	public String getNom() {
		return Nom;
	}
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getPromotion() {
		return Promotion;
	}
	public void setPromotion(String Promotion) {
		this.Promotion = Promotion;
	}
	//Creation des methodes
	public void s_Inscrire() {
		System.out.println("L'etudiant " + Nom + "(ID : "+ Id +")"
				+ " est bien inscrit dans la promotion " + Promotion);
	}
	public void payer(double frais_inscription) {
		System.out.println(Nom + " a bien payé le montant de "
				+ frais_inscription + " $ pour son inscription");
	}
	
	public static void main(String [] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Veuillez indiquer le nom de l'etudiant");
		String Nom = SC.nextLine();
		System.out.println("Choisir la promotion de l'Etudiant :");
		System.out.println("1. BAC-1 IFI");	
		System.out.println("2. BAC-2 IFI");	
		System.out.println("3. BAC-3 IFI");
		int choix = SC.nextInt();
		String Promotion;
		switch(choix) {
			case 1 :
				Promotion = "BAC-1 IFI";
				break;
			case 2 : 
				Promotion = "BAC-2 IFI";
				break;
			case 3 : 
				Promotion = "BAC-3 IFI";
				break;
			default :
				Promotion = "Introuvable";
		}
		
		System.out.println("Specifier le ID de l'etudiant");
		
		String Id = SC.nextLine();
		
		Etudiant etudiant1 = new Etudiant(Nom, Promotion, Id);
		
		etudiant1.payer(500.25);
		etudiant1.s_Inscrire();
		
	}
}
