public class druginteractions {
     int value;
    String medikamentA;
    String medikamentB;
    int probability;
    enum severity{ MILD, MODERATE, SEVERE;
    severity 1 = severity.MILD;
    severity 2 = severity.MODERATE;
    severity 3 = severity.SEVERE
        }


    public druginteractions(String medikamentA, String medikamentB, int probability, severity(
        severity.MILD, severity.MODERATE, severity.SEVERE){
        this.medikamentA = medikamentA;
        this.medikamentB = medikamentB;
        this.probability = probability;
        this.severity = severity;

    }

}
