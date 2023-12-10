import java.util.List;

public class UploadToAPI {
    private List<String> filledOutTemplates;
    private List<String> nameList;
    private List<String> emailList;
    private String dateAndTime;

    public UploadToAPI(){
        //system out to console and say email succssfully scheduled
        System.out.println("Email successfully scheduled");
    }
    public UploadToAPI(List<String> filledOutTemplates, List<String> nameList, List<String> emailList, String dateAndTime) {
        this.filledOutTemplates = filledOutTemplates;
        this.nameList = nameList;
        this.emailList = emailList;
        this.dateAndTime = dateAndTime;
    }

    public void sendEmails() {
        for (int i = 0; i < filledOutTemplates.size(); i++) {
            String filledOutTemplate = filledOutTemplates.get(i);
            String name = nameList.get(i);
            String email = emailList.get(i);
            String dateAndTime = this.dateAndTime; // Using 'this' to refer to the instance variable
            // Send email to API
            // Perform actions to send emails using filledOutTemplate, name, email, and dateAndTime
        }
    }
}
