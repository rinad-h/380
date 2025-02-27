package edu.ucalgary.oop;

public class FamilyRelation {
    private String relationshipTo;
    private DisasterVictim personOne;
    private DisasterVictim personTwo;

    public FamilyRelation (String relationshipTo, DisasterVictim personOne, DisasterVictim personTwo) {
        this.relationshipTo = relationshipTo;
        this.personOne = personOne;
        this.personTwo = personTwo;
    }

    //Setters
    public void setRelationshipTo(String relationshipTo){
        this.relationshipTo = relationshipTo;
    }
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }

    //Getter
    public String getRelationshipTo(){
        return relationshipTo;
    }
    public DisasterVictim getPersonOne() {
        return personOne;
    }
    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

}



