package medicineInteraction;

public class medicineInteractionModel {
    private String medicamentA;
    private String medicamentB;
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

    public medicineInteractionModel (String medicamentA, String medicamentB, int probability, int severity){
        this.setMedicamentA(medicamentA);
        this.setMedicamentB(medicamentB);
        this.setProbability(probability);
        this.setSeverity(severity);
    }

    public String getMedicamentA() {
        return medicamentA;
    }

    public void setMedicamentA(String medicamentA) {
        this.medicamentA = medicamentA;
    }

    public String getMedicamentB() {
        return medicamentB;
    }

    public void setMedicamentB(String medicamentB) {
        this.medicamentB = medicamentB;
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
    - retrieveSimilarDrugs ()
    - calculationBestMedicine ()
    - showInteractionsInformation ()
     */


}
