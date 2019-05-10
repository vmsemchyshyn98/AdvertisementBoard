package advertboard;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "author")
    private Set<Advertisement> advertisements = new HashSet<>();

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "author")
    @JoinColumn(name = "adress_fk_id")
    private Address address;

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "author")
    @JoinColumn(name = "email_fk_id")
    private Email email;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "author")
    private Set<Telephone> telephones = new HashSet<>();

    public Author(String name) {
        this.name = name;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Email getEmail() {
        return email;
    }

}
