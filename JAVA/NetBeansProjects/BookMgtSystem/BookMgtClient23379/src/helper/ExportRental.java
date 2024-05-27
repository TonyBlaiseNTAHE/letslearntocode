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
import model.Rental;

/**
 *
 * @author Mhz
 */
public class ExportRental {
    public static void exportToCSV(List<Rental> rentals) {
    JFileChooser fileChooser = new JFileChooser();
    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
      File fileToSave = fileChooser.getSelectedFile();

      try (FileWriter writer = new FileWriter(fileToSave + ".csv")) {
        // Write CSV header
        writer.write("RentalID,BookTitle,BookAuthor,BookID,RentalDate,ReturnDate,Status\n");

        // Write rental data
        for (Rental rental : rentals) {
          writer.write(
                  String.format("%d,%s,%s,%s,%s,%s,%s\n",
                          rental.getId(),
                          rental.getBook().getTitle(),
                          rental.getBook().getAuthor(),
                          rental.getBook().getBookId(),
                          rental.getRentalDate(),
                          rental.getReturnDate(),
                          rental.getStatus()
                  )
          );
        }

        JOptionPane.showMessageDialog(null, "Rentals export successful!",
                "Success", JOptionPane.INFORMATION_MESSAGE);

      } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error while trying to export Rentals to CSV",
                "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
