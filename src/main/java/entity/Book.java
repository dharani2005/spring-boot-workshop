package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false, length = 100)
    private String isbn;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private Long maxLoanDays;

    @OneToMany(mappedBy = "book")
    private Set<BookLoan> bookLoans = new HashSet<>();

    public Book(String title, Long maxLoanDays, Set<BookLoan> bookLoans) {
        this.title = title;
        this.maxLoanDays = maxLoanDays;
        this.bookLoans = bookLoans;
        this.isbn = null;
    }
}
