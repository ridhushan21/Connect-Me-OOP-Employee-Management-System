package connectmesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AssistantDB implements IAssistant {

    private File file;

    public AssistantDB() {
        file = new File("AssistantDetails.txt");
        
    }

    @Override
    public boolean add(Assistant Assistant) {
        try {
            FileWriter fw = new FileWriter(file, true);
            String line = Assistant.getAssistantID() + ":";
            line = line + Assistant.getAssistantUsername() + ":";
            line = line + Assistant.getAssistantPassword() + "\n";
            fw.write(line);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public boolean delete(int AssistantID) {
        ArrayList<Assistant> AssistantList = getAll();
        boolean check = false;
        for (Assistant Assistant : AssistantList) {
            check = Assistant.getAssistantID() == AssistantID;
            if (check) {
                AssistantList.remove(Assistant);
                break;
            }
        }
        if (check == false) {
            return false;
        }
        try {
            FileWriter fw = new FileWriter(file);
            for (Assistant Assistant : AssistantList) {
                add(Assistant);
            }
            return true;
        } catch (Exception e) {
            System.out.println("An error occured in writing to the file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Assistant assistant) {
        ArrayList<Assistant> AssistantList = getAll();
        for (Assistant assistant1 : AssistantList) {
            if (assistant1.getAssistantID() == assistant.getAssistantID()) {
                AssistantList.remove(assistant1);
                AssistantList.add(assistant);
                break;
            }
        }
        try {
            FileWriter fw = new FileWriter(file);

            for (Assistant Assistant1 : AssistantList) {
                add(Assistant1);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public Assistant find(int AssistantID) {
        ArrayList<Assistant> AssistantList = getAll();
        for (Assistant Assistant : AssistantList) {
            if (Assistant.getAssistantID() == AssistantID) {
                return Assistant;
            }
        }
        return null;
    }
    
        @Override
    public Assistant find(String AssistantUsername) {
        ArrayList<Assistant> AssistantList = getAll();
        for (Assistant Assistant : AssistantList) {
            if (Assistant.getAssistantUsername().equals(AssistantUsername)) {
                return Assistant;
            }
        }
        return null;
    }
    
    @Override
    public boolean findcheck(int AssistantID) {
        ArrayList<Assistant> AssistantList = getAll();
        for (Assistant Assistant : AssistantList) {
            if (Assistant.getAssistantID() == AssistantID) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Assistant> getAll() {
        try {
            Scanner sc = new Scanner(file);
            ArrayList<Assistant> AssistantList = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] arr = line.split(":");
                int AssistantID = Integer.valueOf(arr[0]);
                String AssistantUsername = arr[1];
                String AssistantPassword = arr[2];
                Assistant Assistant = new Assistant(AssistantID, AssistantUsername, AssistantPassword);
                AssistantList.add(Assistant);
            }
            return AssistantList;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AssistantDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }



}
