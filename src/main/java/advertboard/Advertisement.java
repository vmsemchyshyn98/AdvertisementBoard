package advertboard;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NamedQueries({
        @NamedQuery(name = "updateInformation",
                query = "UPDATE Advertisement a SET a.text = 'hello' WHERE a.text LIKE :pattern"),

        @NamedQuery(name = "selectByHeading",
                query = "SELECT a FROM Advertisement a WHERE a.heading LIKE 'SERVICES' AND a.heading LIKE 'ACCOMODATION'")
//
//        @NamedQuery(name = "filterAdvertisement",
//                query = "SELECT a FROM Advertisement WHERE a.heading LIKE 'SERVICES'")

//        @NamedQuery(name = "selectOne",
//                query = "SELECT a FROM Advertisement a WHERE a.email LIKE 'www'")

})
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "advertisment_id")
    private int id;

    private String heading;

    private String name;

    private LocalDateTime publicationDate;

    private String text;

    private double cost;

    @ManyToOne
    @JoinColumn(name = "author_fk_id")
    private Author author;

    public Advertisement() {
    }

    public Advertisement(String heading, String name, LocalDateTime publicationDate,
                         String text, double cost) {
        this.heading = heading;
        this.name = name;
        this.publicationDate = publicationDate;
        this.text = text;
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", name='" + name + '\'' +
                ", publicationDate=" + publicationDate +
                ", text='" + text + '\'' +
                ", cost=" + cost +
                ", author=" + author.getName() + " " + author.getEmail() + " " + author.getAddress() +
                '}';
    }


    public void setAuthor(Author author) {
        this.author = author;
    }


}
