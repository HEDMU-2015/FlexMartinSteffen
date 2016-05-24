package presentation;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import logic.Beskeder;

public class Advarsler {

	public Alert ukendtKundenummerFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("Fejl i kundenummer");
		fejl.setHeaderText("Log-ind fejl.");
		fejl.setContentText(Beskeder.UKENDT_KUNDENUMMER.getDescription());
		
		return fejl;
		
	}
	
	public Alert SQLFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("SQL fejl");
		fejl.setHeaderText("Fejl i databasen");
		fejl.setContentText(Beskeder.UKENDT_SQL.getDescription()); 
		
		return fejl;
		
	}
	
	public Alert IOFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("I/O fejl");
		fejl.setHeaderText("Ukendt fejl");
		fejl.setContentText(Beskeder.UKENDT_FEJL.getDescription()); 
		
		return fejl;
		
	}
	
	public Alert nummerFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("Nummer fejl");
		fejl.setHeaderText("Fejl i et eller flere felter");
		fejl.setContentText(Beskeder.NUMMMER_FEJL.getDescription());
		return fejl;
		
	}
	public Alert datoFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("Dato fejl.");
		fejl.setHeaderText("Fejl i dato");
		fejl.setContentText(Beskeder.DATO_MANGLER.getDescription());
		return fejl;
		
	}
	
	public Alert postnrFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("Postnummer fejl.");
		fejl.setHeaderText("Fejl i postnummer");
		fejl.setContentText(Beskeder.POSTNR_FEJL.getDescription());
		return fejl;
		
	}
	
	public Alert indtastningFejl(Exception e){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setTitle("Indtastningsfejl");
		fejl.setHeaderText("Indtastningsfejl");
		fejl.setContentText(e.getMessage());
		return fejl;
		
	}
	
	public Alert ukendtFejl(){
		Alert fejl = new Alert(AlertType.ERROR);
		fejl.setHeaderText("Der er sket en fejl");
		fejl.setContentText("Der er sket en uventet fejl i programmet. "
				+ "Prøv at genstarte det og prøve at bestille igen. "
				+ "Fortsætter problemet bedes de henvende dem til kundeservice.");
		return fejl;
		
	}
}