package entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    @Setter
    private String userName;

    @Column(nullable = false)
    @Setter
    private String password;

    @Column
    private LocalDate regDate;

    @OneToOne
    @JoinColumn(name = "details_id")
    @Setter
    private Details userDetails;

    @OneToMany(mappedBy = "borrower")
    private Set<BookLoan> bookLoan = new HashSet<>();

    public AppUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.regDate = LocalDate.now();

    }

    public AppUser(String userName, String password, Details userDetails) {
        this(userName, password);
        this.regDate = LocalDate.now();
        this.userDetails = userDetails;
    }


}
