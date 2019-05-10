package advertboard;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private int id;

    @Column(name = "name_of_address")
    private String address;

    @OneToOne()
    @JoinColumn(name = "author_fk_id")
    private Author author;

    public Address() {
    }


    public Address(String nameOfAdress) {
        this.address=nameOfAdress;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
