package edu.ucalgary.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // Constructor
	public MedicalRecord (Location location, String treatmentDetails, String dateOfTreatment) {
		this.setLocation(location);
		this.setTreatmentDetails(treatmentDetails);
        this.setDateOfTreatment(dateOfTreatment);
	}

    // Setters
    public void setLocation(Location location) {this.location =  location;}
	public void setTreatmentDetails(String treatmentDetails) {this.treatmentDetails = treatmentDetails;}
    public void setDateOfTreatment(String dateOfTreatment) {
        if (!isValidDateFormat(dateOfTreatment)) {  
            throw new IllegalArgumentException("Invalid date format: " + dateOfTreatment);
        }
        this.dateOfTreatment = dateOfTreatment;
    }   

    // Getters
    public Location getLocation() {return this.location;}
    public Location getName() {return this.getName();}
    public String getTreatmentDetails() {return this.treatmentDetails;}
    public String getDateOfTreatment() {return this.dateOfTreatment;}

    private boolean isValidDateFormat(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}