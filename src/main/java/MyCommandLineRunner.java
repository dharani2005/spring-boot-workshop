import entity.AppUser;
import entity.Book;
import entity.Details;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.AppUserRepository;
import repository.DetailsRepository;

import java.time.LocalDate;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
@Autowired
    AppUserRepository appUserRepository;
@Autowired
    DetailsRepository detailsRepository;

    @Override
    public void run(String... args) throws Exception {
      /*  Details details = new Details("testmail@gmail.com","test", LocalDate.of(2024,06,03));
        AppUser appUser = new AppUser("testuser","1234",details);
        detailsRepository.save(details);
        appUserRepository.save(appUser);
        Book book = new Book();
*/
    }
}
