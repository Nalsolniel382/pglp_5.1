package fr.uvsq.pglp5_1;

import java.util.ArrayList;
import java.time.LocalDate;


public class Personnel {
	
	 private final String nom;
	 private final String prenom;
	 private final LocalDate dateNaissance;
	 private ArrayList<String> tel;
	 private String fonctions;
	
	 
	 
	  public static class builder {
	   
	        private final String nom;
	        private final String prenom;
	        private final LocalDate dateNaissance;
	        private ArrayList<String> tel;
	        private String fonctions;
	       
	       
	        
	        builder(final String nom, final String prenom, final  LocalDate dateNaissance,ArrayList<String> num) {
	            this.nom = nom;
	            this.prenom = prenom;
	            this.dateNaissance=dateNaissance;
	            this.fonctions = "employer";
	            this.tel = num;
	            }
	 
	 
	 
	 
	        public Personnel  build( ){
	        	return new Personnel(this);
	        }
	  } 
	 
	 
	 
	 private Personnel(final builder build) {
		 	nom = build.nom;
			prenom = build.prenom;
			dateNaissance = build.dateNaissance;
			tel= build.tel;
	        }
	 
	public void print() {
			System.out.print("Prenom: "+prenom + " nom: "+ nom + " naissance: " + dateNaissance );
			
			System.out.println();
		}

	

}
