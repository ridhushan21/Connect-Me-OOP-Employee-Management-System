package connectmesystem;

public class Assistant {
  
    private int AssistantID;
    private String AssistantUsername;
    private String AssistantPassword;

    public Assistant(int AssistantID, String AssistantUsername, String AssistantPassword) {
        this.AssistantID = AssistantID;
        this.AssistantUsername = AssistantUsername;
        this.AssistantPassword = AssistantPassword;
    }

    public int getAssistantID() {
        return AssistantID;
    }

    public void setAssistantID(int AssistantID) {
        this.AssistantID = AssistantID;
    }

    public String getAssistantUsername() {
        return AssistantUsername;
    }

    public void setAssistantUsername(String AssistantUsername) {
        this.AssistantUsername = AssistantUsername;
    }

    public String getAssistantPassword() {
        return AssistantPassword;
    }

    public void setAssistantPassword(String AssistantPassword) {
        this.AssistantPassword = AssistantPassword;
    }


}