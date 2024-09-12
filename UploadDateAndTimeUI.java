import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UploadDateAndTimeUI implements ActionListener {
    private JComboBox<String> yearDropDown, monthDropDown, dayDropDown, hourDropDown, minuteDropDown;
    private JLabel scheduleDateLabel, scheduleTimeLabel;
    private JButton sendButton;
    private DesignatedDateAndTime scheduleDateTime;

    public UploadDateAndTimeUI() {
        scheduleDateLabel = new JLabel("Schedule Date:");
        yearDropDown = new JComboBox<>(getYearOptions());
        monthDropDown = new JComboBox<>(getMonthOptions());
        dayDropDown = new JComboBox<>(getDayOptions());

        scheduleTimeLabel = new JLabel("Schedule Time:");
        hourDropDown = new JComboBox<>(getHourOptions());
        minuteDropDown = new JComboBox<>(getMinuteOptions());

        sendButton = new JButton("Schedule Email");
        sendButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Schedule Email")) {
            String selectedYear = (String) yearDropDown.getSelectedItem();
            String selectedMonth = (String) monthDropDown.getSelectedItem();
            String selectedDay = (String) dayDropDown.getSelectedItem();
            String selectedHour = (String) hourDropDown.getSelectedItem();
            String selectedMinute = (String) minuteDropDown.getSelectedItem();
            scheduleDateTime = new DesignatedDateAndTime(selectedYear, selectedMonth, selectedDay, selectedHour, selectedMinute);
            
            UploadToAPI uploadToAPI = new UploadToAPI();
            
                // Display a message (for demonstration)
            System.out.println("Email scheduled successfully for: " + scheduleDateTime.getScheduleDateTime());
           
        } else if (e.getSource() == yearDropDown || e.getSource() == monthDropDown) {
            Vector<String> dayOptions = getDayOptions();
            dayDropDown.setModel(new DefaultComboBoxModel<>(dayOptions));
        }
    }

    private Vector<String> getYearOptions() {
        Vector<String> years = new Vector<>();
        years.add("Year");
        for (int x = 0; x < 20; x++) {
            years.add(String.valueOf(2021 + x));
        }
        return years;
    }

    private Vector<String> getMonthOptions() {
        Vector<String> months = new Vector<>();
        months.add("Month");
        for (int i = 1; i <= 12; i++) {
            months.add(String.valueOf(i));
        }
        return months;
    }

    private Vector<String> getDayOptions() {
        String selectedYear = (String) yearDropDown.getSelectedItem();
        String selectedMonth = (String) monthDropDown.getSelectedItem();
        Vector<String> days = new Vector<>();
        days.add(0, "Day");
        if (selectedYear != null && selectedMonth != null) {
            int year = Integer.parseInt(selectedYear);
            int month = Integer.parseInt(selectedMonth);
            int daysInMonth = 0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if (year % 4 == 0) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
            }
            for (int i = 1; i <= daysInMonth; i++) {
                days.add(String.valueOf(i));
            }
        }
        return days;
    }

    private Vector<String> getHourOptions() {
        Vector<String> hours = new Vector<>();
        hours.add("Hour");
        for (int i = 0; i < 24; i++) {
            hours.add(String.valueOf(i));
        }
        return hours;
    }

    private String[] getMinuteOptions() {
        // Return a String array of minute options in intervals of 5
        return new String[]{"Minute", "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    }

    public JComboBox<String> getYearDropDown() {
        return yearDropDown;
    }

    public JComboBox<String> getMonthDropDown() {
        return monthDropDown;
    }

    public JComboBox<String> getDayDropDown() {
        return dayDropDown;
    }

    public JComboBox<String> getHourDropDown() {
        return hourDropDown;
    }

    public JComboBox<String> getMinuteDropDown() {
        return minuteDropDown;
    }

    public JLabel getScheduleDateLabel() {
        return scheduleDateLabel;
    }

    public JLabel getScheduleTimeLabel() {
        return scheduleTimeLabel;
    }
    
    public JButton getSendButton() {
        return sendButton;
    }
}
