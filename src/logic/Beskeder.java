package logic;

public enum Beskeder {
	MANGLER("Et eller flere nødvendige felter mangler informationer. Prøv at indtaste alle felter, og prøve igen. "), BESTILSUCCESS(
			"Din bestilling blev succesfuldt udført!"), 
	VALIDERINGSFEJL("Der var en ukendt fejl med dine informationer. Prøv vejligst igen"),
	NAVN_IKKE_INDTASTET("Indtast venligst dit navn. Dette felt kan ikke være tomt."),
	EMAIL_IKKE_INDTASTET("Indtast venligst din email. Dette felt kan ikke være tomt."),
	TLF_IKKE_INDTASTET("Indtast venligst dit telefonnummer. Dette felt kan ikke være tomt."),
	UKENDT_SQL("Der skete en uventet fejl. Prøv venligst at genstarte programmet, eller at kontakte kundeservice."),
	UKENDT_KUNDENUMMER("Der findes ingen kunde med kundenummret du angav. Prøv venligst igen."),
	UKENDT_FEJL("Der skete en ukendt fejl. Prøv venligst at genstarte programmet, eller at kontakte kundeservice."),
	
	START_ADR_MANGLER("Indtast venligst en startadresse."),
	START_POSTNR_MANGLER("Indtast venligst et startpostnummer"),
	START_BY_MANGLER("Indtast venligst en start by"),
	SLUT_ADR_MANGLER("Indtast venligst en slutadresse"),
	SLUT_POSTNR_MANGLER("Indtast venligst et slutpostnummer"),
	SLUT_BY_MANGLER("Indtast venligst en slutby"),
	
	KM_MANGLER("Indtast venligst antal kilometer for din tur"),
	
	DATO_MANGLER("Vælg venligst en dato"),
	NUMMMER_FEJL("Du har skrevet bogstaver eller andre karakterer hvor der kun måtte være tal. Prøv venligst igen."),	
	POSTNR_FEJL("Der må maks være 4 tal i et postnummer. Prøv igen"),
	BRUGERNR_FEJL("Der mangler et brugernummer indtastet for at kunne registrere kørslen");

	private final String description;

	private Beskeder(String description) {
		
		this.description = description;
	}

	public String getDescription() {
		return description;
	}



	@Override
	public String toString() {
		return  description;
	}

}

// TODO : inspiration fra
// http://stackoverflow.com/questions/446663/best-way-to-define-error-codes-strings-in-java