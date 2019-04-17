import java.sql.Timestamp;

public class medicinListInformation {
    String drugName;
    String drugClass;
    int dosis;
    String unit;
    String administeringWay;
    String frequency;
    Timestamp startDate;
    Timestamp endDate;



public medicinListInformation(String drugName, String drugClass, int dosis, String unit, String administeringWay, String frequency, Timestamp startDate, Timestamp endDate ){

    this.dosis = dosis;
    this.frequency = frequency;
    this.drugName = drugName;
    this.drugClass = drugClass;
    this.administeringWay = administeringWay;
    this.unit = unit;
    this.startDate = startDate;
    this.endDate = endDate;
}

// Metoder //
/*
    public showInteractionInformation(){

}

public pullMedicinInformation(){

}
*/
}
