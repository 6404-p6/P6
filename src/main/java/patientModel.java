public class patientModel {

    private String firstname;
    private String lastname;
    private String CPRnumber;
    private String patientID;

    public patientModel(String firstname, String lastname, String CPRnumber, String patientID){
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setCPRnumber(CPRnumber);
        this.setPatientID(patientID);
    }

    public String getSurname() {
        return firstname;
    }

    public void setFirstname(String surname) {
        this.firstname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCPRnumber() { return CPRnumber; }

    public void setCPRnumber(String CPRnumber) {
        this.CPRnumber = CPRnumber;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }


    // Metoder: Ingen metoder

}
