package gestion_Etudiant;

import java.io.FileWriter;
import java.io.IOException;

public class Offre_Emploi {
	// nous commencons par creer les attributs
	public String numero;
	public String titre_du_poste;
	public String description;
	public String delai;
	public String departement;
	public int nombre;
	public String cat;
	
	// nous allons creer un constructeur de la classe 
	public Offre_Emploi(String numero, String titre_poste, String description, String delai, 
			String departement, int nombre, String cat) {
		//utiliser l'operateur this pour les entrees des attributs
		
		this.numero = numero;
		this.titre_du_poste = titre_poste;
		this.description = description;
		this.delai = delai;
		this.departement = departement;
		this.nombre = nombre;
		this.cat = cat;
		
	}
	
	// creons les getters
	public String getNumero() {
		return numero;
	}
	public String getTitre_du_poste() {
		return titre_du_poste;
	}
	public String getDescription() {
		return description;
	}
	public String getDelai() {
		return delai;
	}
	public String getDepartement() {
		return departement;
	}
	public int getNombre() {
		return nombre;
	}
	public String getCat() {
		return cat;
	}
	
	//creation des setters
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTitre_du_poste(String titre_du_poste) {
		this.titre_du_poste = titre_du_poste;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public void setDelai(String delai) {
		this.delai = delai;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
	//nous creons la methode pour publier l'offre
	public void publierOffre() {
		System.out.println("=================================");
		System.out.println("     OFFRE D'EMPLOI NUM : "+numero);
		System.out.println("Titre                : "+titre_du_poste);
		System.out.println("Departement          : "+departement);
		System.out.println("Categorie Prof       : "+cat);
		System.out.println("Description du poste : "+description);
		System.out.println("Nombre de postes     : "+nombre);
		System.out.println("Delai limite         : "+delai);
	}
	
	//methode pour enregistrer dans un fichier
	public void enregistrerFichier(String nomFichier) {
		try(FileWriter writer = new FileWriter(nomFichier, true)){
			String ligne = numero+" ,"+titre_du_poste+" ,"+
					departement+" ,"+cat+" ,"+
					description.replace(",", " ")+" ,"+
					nombre+" ,"+delai+"\n";
			writer.write(ligne);
			System.out.println("Offre sauvegardée avec succès dans "+nomFichier);
		}
		catch(IOException e) {
			System.err.println("Erreur d'enregistrement :" + e.getMessage());
		}
		
	}
	
	public class Main{
		public static void main(String[] args) {
			Offre_Emploi offre = new Offre_Emploi(
					"OFF0012",
					"Instrumentiste",
					"Faire des inspections quotiediennes des equipements de l'usine",
					"2025-06-25",
					"Engineering", 5, "CN1");
			
			offre.publierOffre();
			offre.enregistrerFichier("liste_offres_2025.csv");
		}
	}
}
