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
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Book;

/**
 *
 * @author Mhz
 */
public class ExportBook {
    public static void exportToCSV(List<Book> bookList) {
     // Create a JTable to display the book details
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Title");
        model.addColumn("Author");
        model.addColumn("Publisher");
        model.addColumn("Genre");
        model.addColumn("Book ID");

        for (Book book : bookList) {
            Vector<String> row = new Vector<>();
            row.add(book.getTitle());
            row.add(book.getAuthor());
            row.add(book.getPublisher());
            row.add(book.getGenre());
            row.add(book.getBookId());
            model.addRow(row);
        }

        // Display the table in a scrollable pane
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Book Details", JOptionPane.INFORMATION_MESSAGE);

        // Write the data from the table model to a CSV file
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (FileWriter writer = new FileWriter(fileToSave + ".csv")) {
                // Write CSV header
                writer.write("Title,Author,Publisher,Genre,Book ID\n");

                // Write book data from table model
                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        writer.write(model.getValueAt(row, col).toString());
                        if (col < model.getColumnCount() - 1) {
                            writer.write(",");
                        }
                    }
                    writer.write("\n");
                }

                JOptionPane.showMessageDialog(null, "Books Exported Successfully to CSV",
                        "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error while trying to export Books to CSV",
                "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
