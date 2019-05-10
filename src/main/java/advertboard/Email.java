package advertboard;


import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email_id")
    private int id;

    @Column(name = "author_email")
    private String email;

    @OneToOne
    @JoinColumn(name = "author_fk_id")
    private Author author;


    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


}
