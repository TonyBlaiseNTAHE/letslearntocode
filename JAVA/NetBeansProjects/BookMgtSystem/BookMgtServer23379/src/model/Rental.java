package model;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Mhz
 */
@Entity
@Table(name="rentals")
public class Rental implements Serializable{
   @Id
    private int id;

   @NotNull 
   @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;

    private String rentalDate;

    
    private String returnDate;

    @NotNull
    private String status;
    private static final long serialVersionUID = -4905888954825870562L;

    public Rental() {
    }

    public Rental(int id, User user, Book book, String rentalDate, String returnDate, String status) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(String rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
