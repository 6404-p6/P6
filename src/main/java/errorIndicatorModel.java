public class errorIndicatorModel {

    private int NumberOfErrors;
    private enum highestSeverity{
        risk1,
        risk2,
        risk3;
    }

    public errorIndicatorModel(int NumberOfErrors){
        this.setNumberOfErrors(NumberOfErrors);
    }

    public int getNumberOfErrors() { return NumberOfErrors; }

    public void setNumberOfErrors(int numberOfErrors) {
        NumberOfErrors = numberOfErrors;
    }


    /*
    Metoder:
- calculateError ()
- showIndicator ()
     */

}
