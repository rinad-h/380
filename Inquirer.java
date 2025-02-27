package edu.ucalgary.oop;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
	private String SERVICES_PHONE;

    // Constructor
	public Inquirer (String firstName, String lastName, String phone, String info) {
		this.FIRST_NAME = firstName;
		this.LAST_NAME = lastName;
        this.SERVICES_PHONE = phone;
        this.INFO = info;
	}

    // Getters
    public String getFirstName() {return this.FIRST_NAME;}
    public String getLastName() {return this.LAST_NAME;}
    public String getInfo() {return this.INFO;}
    public String getServicesPhoneNum() {return this.SERVICES_PHONE;}
}