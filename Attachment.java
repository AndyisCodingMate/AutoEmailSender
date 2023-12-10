public class Attachment {
    private String attachmentName;
    public Attachment(){
        this.attachmentName = "null";
    }
    public Attachment(String attachmentName){
        this.attachmentName = attachmentName;
    }
    
    public String getAttachmentName(){
        return this.attachmentName;
    }
}