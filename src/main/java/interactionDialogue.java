public class interactionDialogue {

     private String problemOverview;
     private String description;
     private String alternativeSuggestion;

     public interactionDialogue(String problemOverview, String description, String alternativeSuggestion){
          this.setProblemOverview(problemOverview);
          this.setDescription(description);
          this.setAlternativeSuggestion(alternativeSuggestion);
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





}
