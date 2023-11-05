/*
 * Add a check box to the file comparer developed in Try This 17-1 that has the following text: Show position of mismatch.
 * When this box is checked, have the program display the location of the first point in th files at which a mismatch
 * occurs.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class solution implements ActionListener {
    JTextField jtfFirst; // holds first file name
    JTextField jtfSecond; // holds second file name
    JCheckBox jcbMismatch; // checkbox option to display mismatch

    JButton jbtnComp; // button to compare the files

    JLabel jlabFirst, jlabSecond; // displays prompts
    JLabel jlabResult; //displays results and error messages

    boolean displayLoc = false;

    solution() {

        // Create new JFrame container.
        JFrame jfrm = new JFrame("Compare files");

        // Specify FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(200, 190);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text fields for the file names.
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        // Set the action commands for the text fields.
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        // Create the compare button.
        JButton jbtnComp = new JButton("Compare");

        // Add action listener for the compare button.
        jbtnComp.addActionListener(this);

        // Add check box
        jcbMismatch = new JCheckBox("Show position of mismatch");
        // Events generated by check box handled in itemStateChanged()
        jcbMismatch.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                JCheckBox cb = (JCheckBox) ie.getItem();

                if (cb.isSelected())
                    displayLoc = true;
                else
                    displayLoc = false;
            }
        });

        // Create the labels
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        // Add the components to the content pane.
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.add(jcbMismatch);

        // Display the frame.
        jfrm.setVisible(true);

    }
    // Handler for button
    public void actionPerformed(ActionEvent ae) {
        int i=0, j=0, count = 0;

        // First, confirm that both file names have been entered.
        if(jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name is missing.");;
            return;
        }

        if(jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name is missing.");;
            return;
        }

        // Compare files. Use try-with-resources to manage the files.
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText()); 
            FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            // Check the contents of each file

            do {
                i = f1.read();
                j = f2.read();
                if(i!=j) break;
                ++count;
            }while(i != -1 && j!=-1);

            if (i!=j)
                jlabResult.setText("Files are not the same");
                if (displayLoc)
                    jlabResult.setText("Files are not the same. Differences first observed at location: "+count);        
            else
                jlabResult.setText("Files compare equal.");
        }catch (IOException exc) {
            jlabResult.setText("File Error");
        }
            
    }


    public static void main(String[] args){
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new solution();
            }
        });
    }
}