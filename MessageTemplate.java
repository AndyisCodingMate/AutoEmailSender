import java.util.List;

public class MessageTemplate {
    private String originalMessageTemplate;
    private List<String> filledOutTemplates;
    private List<String> NameList;

    //read through the message template file and look for the substring "{Insert Name}", replace it with the name of the person
    //add the new string to the filledOutTemplates list

    public MessageTemplate(String messageTemplate) {
        this.originalMessageTemplate = messageTemplate;
    }

    public MessageTemplate(String messageTemplate, List<String> NameList) {
        this.originalMessageTemplate = messageTemplate;
        this.NameList = NameList;
    }

    public List<String> getFilledOutTemplates() {
        return filledOutTemplates;
    }
    
    public void fillOutTemplate() {
        for (String name : NameList) {
            String filledOutTemplate = originalMessageTemplate.replace("{Insert Name}", name);
            filledOutTemplates.add(filledOutTemplate);
        }
    }
}