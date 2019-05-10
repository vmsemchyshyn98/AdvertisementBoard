package advertboard;

import javax.persistence.*;

@Entity
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "telephone_id")
    private int id;

    private String telephone;

    @ManyToOne
    @JoinColumn(name = "author_fk_id")
    private Author author;

    public Telephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
