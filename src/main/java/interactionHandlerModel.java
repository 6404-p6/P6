import java.util.List;

public class interactionHandlerModel {

    private int NumberOfErrors;
    private enum highestSeverity{
        risk1,
        risk2,
        risk3;
    }
    private List interactionList;

    public interactionHandlerModel(int NumberOfErrors){
        this.setNumberOfErrors(NumberOfErrors);
    }


    static void calculateNumberOfErrors(){

    }

/*
Metoder:
- calculateNumberOfErrors ()
- showIndicator ()
- viewInteractions ()
 */
    public int getNumberOfErrors() { return NumberOfErrors; }

    public void setNumberOfErrors(int numberOfErrors) { NumberOfErrors = numberOfErrors;  }

}
