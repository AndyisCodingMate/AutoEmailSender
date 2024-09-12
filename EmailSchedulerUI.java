import javax.swing.*;
import java.awt.*;

public class EmailSchedulerUI extends JFrame {
  

    public EmailSchedulerUI() {
        //write a function to get date today
        setTitle("Email Scheduler");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        UploadEmailListUI uploadEmailListUI = new UploadEmailListUI();
        UploadAttachmentUI uploadAttachmentUI = new UploadAttachmentUI();
        UploadMessageUI uploadMessageUI = new UploadMessageUI();
        UploadDateAndTimeUI uploadDateAndTimeUI = new UploadDateAndTimeUI();   

        panel.add(uploadEmailListUI.getEmailFileLabel());
        panel.add(uploadEmailListUI.getEmailFileField());
        panel.add(uploadEmailListUI.getEmailFileButton());

        panel.add(uploadAttachmentUI.getAttachmentFileLabel());
        panel.add(uploadAttachmentUI.getAttachmentFileField());
        panel.add(uploadAttachmentUI.getAttachmentFileButton());


        panel.add(uploadMessageUI.getMessageLabel());
        panel.add(uploadMessageUI.getMessageArea());

        panel.add(uploadDateAndTimeUI.getScheduleDateLabel());
        panel.add(uploadDateAndTimeUI.getYearDropDown());
        panel.add(uploadDateAndTimeUI.getMonthDropDown());
        panel.add(uploadDateAndTimeUI.getDayDropDown());

        panel.add(uploadDateAndTimeUI.getScheduleTimeLabel());
        panel.add(uploadDateAndTimeUI.getHourDropDown());
        panel.add(uploadDateAndTimeUI.getMinuteDropDown());

        panel.add(uploadDateAndTimeUI.getSendButton());

        add(panel);
        setVisible(true);
    }

    
}
