package edu.ucalgary.oop;

public class ReliefService {
	private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    
    //constructor
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        setDateOfInquiry(dateOfInquiry); // Validate and set the date
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }
    
    //setters
    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }
    public void setDateOfInquiry(String dateOfInquiry) {
        if (isValidDateFormat(dateOfInquiry)) {
            this.dateOfInquiry = dateOfInquiry;
        } else {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
    }
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }
    
    //getters
    public Inquirer getInquirer() {return inquirer; }
    public DisasterVictim getMissingPerson() {return missingPerson; }
    public String getDateOfInquiry() {return dateOfInquiry; }
    public String getInfoProvided() {return infoProvided; }
    public Location getLastKnownLocation() {return lastKnownLocation; }
    
    //other methods
    private boolean isValidDateFormat(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    public String getLogDetails() {
        StringBuilder logDetails = new StringBuilder();
        logDetails.append("Relief Service Log:\n");
        logDetails.append("Inquirer: ").append(inquirer.toString()).append("\n");
        logDetails.append("Missing Person: ").append(missingPerson.getFirstName()).append(" ").append(missingPerson.getLastName()).append("\n");
        logDetails.append("Date of Inquiry: ").append(dateOfInquiry).append("\n");
        logDetails.append("Information Provided: ").append(infoProvided).append("\n");
        logDetails.append("Last Known Location: ").append(lastKnownLocation.toString()).append("\n");
        return logDetails.toString();
    }
    
}
