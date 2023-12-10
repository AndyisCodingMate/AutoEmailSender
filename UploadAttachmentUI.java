import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import java.io.File;

public class UploadAttachmentUI implements ActionListener {
    private JTextField attachmentFileField;
    private JButton attachmentFileButton;
    private JLabel attachmentFileLabel;
    private Attachment attachment;
    
    public UploadAttachmentUI() {
        attachmentFileLabel = new JLabel("Upload Attachments:");
        attachmentFileField = new JTextField();
        attachmentFileButton = new JButton("Browse");
        attachmentFileButton.addActionListener(this);
    }

    public JLabel getAttachmentFileLabel() {
        return attachmentFileLabel;
    }
    public JTextField getAttachmentFileField() {
        return attachmentFileField;
    }

    public JButton getAttachmentFileButton() {
        return attachmentFileButton;
    }

    public String getAttachmentString() {
        return attachment.getAttachmentName();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        if (e.getSource() == attachmentFileButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showOpenDialog(null); // Passing null as parent
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                attachmentFileField.setText(selectedFile.getAbsolutePath());
                this.attachment = new Attachment(selectedFile.getAbsolutePath());
            }
        }
    }
}
