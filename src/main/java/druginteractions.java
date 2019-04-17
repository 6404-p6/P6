public class druginteractions {
    private int value;
    private String medikamentA;
    private String medikamentB;
    private int probability;
    private enum severity {
        mild,
        moderate,
        severe;
    }
    private int severity;

    public druginteractions(String medikamentA, String medikamentB, int probability, int severity){
        this.setMedikamentA(medikamentA);
        this.setMedikamentB(medikamentB);
        this.setProbability(probability);
        this.setSeverity(severity);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMedikamentA() {
        return medikamentA;
    }

    public void setMedikamentA(String medikamentA) {
        this.medikamentA = medikamentA;
    }

    public String getMedikamentB() {
        return medikamentB;
    }

    public void setMedikamentB(String medikamentB) {
        this.medikamentB = medikamentB;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }


        /*
    Metoder:
    - retrieveInteractionsInformation ()
    - retrieveSimilar Drugs ()
    - calculationBestMedicine ()
    - showInteractionsInformation ()
     */


}
