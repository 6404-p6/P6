package medicineInteraction;

public class medicineInteractionModel {
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
    private String problemOverview;
    private String description;
    private String alternativeSuggestion;

    public medicineInteractionModel (String medikamentA, String medikamentB, int probability, int severity){
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

    public String getProblemOverview() {
        return problemOverview;
    }

    public void setProblemOverview(String problemOverview) {
        this.problemOverview = problemOverview;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlternativeSuggestion() {
        return alternativeSuggestion;
    }

    public void setAlternativeSuggestion(String alternativeSuggestion) {
        this.alternativeSuggestion = alternativeSuggestion;
    }

        /*
    Metoder:
    - retrieveInteractionsInformation ()
    - retrieveSimilar Drugs ()
    - calculationBestMedicine ()
    - showInteractionsInformation ()
     */


}
