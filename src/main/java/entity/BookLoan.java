package entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class BookLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDate loanDate;

    @Column
    private LocalDate dueDate;

    @Column
    private boolean returned;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "borrower_id")
    private AppUser borrower;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;

    public BookLoan(AppUser borrower, Book book) {
        this.borrower = borrower;
        this.book = book;
        this.returned =false;
        this.loanDate = LocalDate.now();
        this.dueDate = LocalDate.now();
    }
}
