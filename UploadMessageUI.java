import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UploadMessageUI {
    private JTextArea messageArea;
    private JLabel messageLabel;

    public UploadMessageUI(){
        this.messageLabel = new JLabel("Message:");
        this.messageArea = new JTextArea(5, 20);
    }

    //read what is in the messageArea and return as a string
    public String getMessage(){
        return this.messageArea.getText();
    }

    public JLabel getMessageLabel(){
        return this.messageLabel;
    }

    public JScrollPane getMessageArea(){
        return new JScrollPane(messageArea);
    }
    
}