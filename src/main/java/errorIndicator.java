public class errorIndicator {

    private int NumberOfError;
    private int highestSeverity;

    public errorIndicator(int NumberOfError, int highestSeverity){
        this.setHighestSeverity(highestSeverity);
        this.setNumberOfError(NumberOfError);
    }

    public int getNumberOfError() {
        return NumberOfError;
    }

    public void setNumberOfError(int numberOfError) {
        NumberOfError = numberOfError;
    }

    public int getHighestSeverity() {
        return highestSeverity;
    }

    public void setHighestSeverity(int highestSeverity) {
        this.highestSeverity = highestSeverity;
    }
}
