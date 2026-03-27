package connectmesystem;

import java.util.ArrayList;

public interface IAssistant {
    
    
public abstract boolean add(Assistant Assistant);
    public abstract boolean delete(int AssistantID);
    public abstract boolean update(Assistant Assistant);
    public abstract Assistant find(int AssistantID);
    public abstract  Assistant find(String AssistantUsername);
    public abstract ArrayList<Assistant> getAll();
    public abstract boolean findcheck(int AssistantID);

}