public class errorIndicator {

    private int NumberOfError;
    private enum highestSeverit{
        risk1,
        risk2,
        risk3;
    }

    public errorIndicator(int NumberOfError){
        this.setNumberOfError(NumberOfError);
    }

    public int getNumberOfError() {
        return NumberOfError;
    }

    public void setNumberOfError(int numberOfError) {
        NumberOfError = numberOfError;
    }


    /*
    Metoder:
- calculateError ()
- showIndicator ()
     */

}
