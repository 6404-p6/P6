public class patient {

    private String surname;
    private String lastname;
    private String CPRnumber;
    private String patientID;


    public patient(String surname, String lastname, String CPRnumber, String patientID){
        this.setSurname(surname);
        this.setLastname(lastname);
        this.setCPRnumber(CPRnumber);
        this.setPatientID(patientID);
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCPRnumber() {
        return CPRnumber;
    }

    public void setCPRnumber(String CPRnumber) {
        this.CPRnumber = CPRnumber;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
}
