import javax.swing.*;

public class CustomBtn {
    public static void main(String[] args) {
        // Run UI code on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            
            String[] options = {"Momo", "Kima Noodles", "Samosa"};
            
            int choice = JOptionPane.showOptionDialog(
                null,                               // Parent component
                "What would you like for lunch?",   // Message
                "Lunch Selector",                   // Title
                JOptionPane.DEFAULT_OPTION,         // Option type
                JOptionPane.QUESTION_MESSAGE,       // Message type (icon)
                null,                               // Icon (null = default)
                options,                            // Custom button labels
                options[0]                          // Initial/Default selection
            );

            // The return value 'choice' is the index of the button pressed
            if (choice >= 0) {
                System.out.println("User chose: " + options[choice]);
            } else {
                System.out.println("User closed the dialog.");
            }
        });
    }
}
