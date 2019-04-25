import java.sql.Timestamp;

public class MedicineModel {

    private int dosage;
    private String frequency;
    private Timestamp startDate;
    private Timestamp endDate;
    private String medication;

    public int getAdministration() {
        return administration;
    }

    public void setAdministration(int administration) {
        this.administration = administration;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    private enum administration{
        doctor,
        nurse;
    }
    private int administration;
    private enum unit{
        mg,
        ml;
    }
    private int unit;
    private String drugClass;

    public medicationListInfo(int dosage, String frequency, Timestamp startDate, Timestamp endDate, String medication,
                              int administration, int unit, String drugClass){
        this.setDosage(dosage);
        this.setFrequency(frequency);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setMedication(medication);
        this.setDrugClass(drugClass);
        this.setUnit(unit);
        this.setAdministration(administration);
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDrugClass() {
        return drugClass;
    }

    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass;
    }


/*
Metoder:
- showPrescriptionInfo ()
- pullRecordInfo ()


 */

}
