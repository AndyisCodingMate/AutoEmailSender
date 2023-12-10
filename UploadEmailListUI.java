import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.List;

public class UploadEmailListUI extends UploadAttachmentUI {
    private JTextField emailFileField;
    private JButton emailFileButton;
    private JLabel emailFileLabel;
    private EmailList emailList;

    public UploadEmailListUI() {
        super(); // Assuming UploadAttachmentUI constructor performs necessary setup

        emailFileLabel = new JLabel("Upload Email File:");
        emailFileField = new JTextField();
        emailFileButton = new JButton("Browse");
        emailFileButton.addActionListener(this); // Register ActionListener for the button
    }

    public JTextField getEmailFileField() {
        return emailFileField;
    }

    public JButton getEmailFileButton() {
        return emailFileButton;
    }

    public JLabel getEmailFileLabel() {
        return emailFileLabel;
    }

    public List<String> getEmailListStrings() {
        try{
            return emailList.getEmailList();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
        return null;
    }

    public List<String> getNameListStrings() {
        try{
            return emailList.getNameList();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
        return null;
    }


}
