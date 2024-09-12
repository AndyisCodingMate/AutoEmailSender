import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmailList {
    private String filePath;
    private List<String> emailList;
    private List<String> nameList;

    public EmailList(String filePath) {
        this.filePath = filePath;
        this.emailList = new ArrayList<>();
        this.nameList = new ArrayList<>();
        readTextFile();
    }

    private void readTextFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    emailList.add(parts[0].trim());
                    nameList.add(parts[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getter methods for emailList and nameList
    public List<String> getEmailList() {
        return emailList;
    }

    public List<String> getNameList() {
        return nameList;
    }
}
