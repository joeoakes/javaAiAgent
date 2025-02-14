import java.util.*;

// Basic AI Security Agent class
public class SecurityAgent {
    private List<String> threatDatabase;

    public SecurityAgent() {
        threatDatabase = new ArrayList<>();
        loadThreatDatabase();
    }

    private void loadThreatDatabase() {
        // Simulating a threat database
        threatDatabase.add("SQL Injection");
        threatDatabase.add("Cross-Site Scripting");
        threatDatabase.add("DDoS Attack");
        threatDatabase.add("Phishing");
    }

    public boolean analyzeThreat(String input) {
        for (String threat : threatDatabase) {
            if (input.toLowerCase().contains(threat.toLowerCase())) {
                System.out.println("Threat Detected: " + threat);
                return true;
            }
        }
        System.out.println("No Threat Detected.");
        return false;
    }

    public void addThreat(String threat) {
        threatDatabase.add(threat);
        System.out.println("New threat added to the database: " + threat);
    }

    public static void main(String[] args) {
        SecurityAgent agent = new SecurityAgent();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to analyze for threats:");
        String input = scanner.nextLine();

        agent.analyzeThreat(input);

        System.out.println("Add a new threat to the database:");
        String newThreat = scanner.nextLine();
        agent.addThreat(newThreat);

        System.out.println("Re-checking threats:");
        agent.analyzeThreat(input);
    }
}
