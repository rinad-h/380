package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.Arrays;

public class DisasterVictim {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;
    private ArrayList<FamilyRelation> familyConnections;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<Supply> personalBelongings;
    private String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter = 0;

    // constructors
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = counter; // assign the current counter value
        this.familyConnections = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
        counter++;
    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        this(firstName, ENTRY_DATE);
        setDateOfBirth(dateOfBirth);
    }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setDateOfBirth(String dateOfBirth) {
        if (isValidDateFormat(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
            int dateAsInt = convertDateStringToInt(dateOfBirth);
        } else {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
    }

    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = new ArrayList<>(Arrays.asList(connections));
    }
    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = new ArrayList<>(Arrays.asList(records));
    }
    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = new ArrayList<>(Arrays.asList(belongings));
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setGender(String gender) throws IllegalArgumentException {
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) {
            throw new IllegalArgumentException("Invalid gender. Allowed values: Male, Female, Other.");
        }
        this.gender = gender;
    }

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getAssignedSocialID() { return ASSIGNED_SOCIAL_ID; }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections.toArray(new FamilyRelation[0]);
    }
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords.toArray(new MedicalRecord[0]);
    }
    public Supply[] getPersonalBelongings() {
        return personalBelongings.toArray(new Supply[0]);
    }
    public String getEntryDate() {
        return ENTRY_DATE;
    }
    public String getComments() { return comments; }
    public String getGender() { return gender; }
    public static int getCounter() { return counter; }

    // personal belongings methods
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }
    public void removePersonalBelonging(Supply unwantedSupply) {
        personalBelongings.remove(unwantedSupply);
    }

    // family connections methods
    public void addFamilyConnection(FamilyRelation relation) {
        familyConnections.add(relation);
    }
    public void removeFamilyConnection(FamilyRelation exRelation) {
        familyConnections.remove(exRelation);
    }

    // medical records methods
    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
    }

    // other methods
    private static boolean isValidDateFormat(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    private static int convertDateStringToInt(String dateStr) {
        // converts the original format YYYY-MM-DD string to an int as YYYYMMDD
        return Integer.parseInt(dateStr.replace("-", ""));
    }
}
