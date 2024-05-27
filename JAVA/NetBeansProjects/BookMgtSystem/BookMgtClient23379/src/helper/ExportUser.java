/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Mhz
 */
public class ExportUser {
    public static void exportToCSV(List<User> users) {
    JFileChooser fileChooser = new JFileChooser();
    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
      File fileToSave = fileChooser.getSelectedFile();

      try (FileWriter writer = new FileWriter(fileToSave + ".csv")) {
        // Write CSV header
        writer.write("User ID, Full Names, Email, Phone Number, Password\n");

        // Write rental data
        for (User user : users) {
          writer.write(
                  String.format("%s,%s,%s,%s,%s\n",
                          user.getUserId(),
                          user.getFullnames(),
                          user.getEmail(),
                          user.getPhone_number(),
                          user.getPassword()
                  )
          );
        }

        JOptionPane.showMessageDialog(null, "Users export successful!",
                "Success", JOptionPane.INFORMATION_MESSAGE);

      } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error while trying to export Rentals to CSV",
                "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
