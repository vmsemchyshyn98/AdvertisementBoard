package advertboard;

import javax.persistence.*;
import java.time.LocalDateTime;


public class AdvertisementBoard {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        /*Author author1 = new Author("Bob");
        Author author2 = new Author("Jack");
        Author author3 = new Author("Tom");

        Advertisement advertisement1 = new Advertisement("SERVICES", "qwertty",
                LocalDateTime.of(2000, 3, 10, 10, 30),
                "hellooooo", 100);

        Address address1 = new Address("qwertyu");
        Email email1 = new Email("333333");
        Telephone telephone = new Telephone("9657000");
        Telephone telephone1 = new Telephone("7689877");

        author1.setAddress(address1);
        author1.setEmail(email1);
        address1.setAuthor(author1);
        email1.setAuthor(author1);

        advertisement1.setAuthor(author1);
        author1.addAdvertisement(advertisement1);

        telephone.setAuthor(author1);
        telephone1.setAuthor(author1);
        author1.addTelephone(telephone);
        author1.addTelephone(telephone1);


        Advertisement advertisement2 = new Advertisement("ENTERTAINMENTS", "tty",
                LocalDateTime.of(2000, 3, 10, 10, 30),
                "wdefrqqqqqqqqqqqqq", 100);
        Address address2 = new Address("aaaaaaaaaaa");
        Email email2 = new Email("123frfgh");
        Telephone telephone2 = new Telephone("2222222222");
        Telephone telephone3 = new Telephone("11111111111");

        author2.setAddress(address2);
        author2.setEmail(email2);
        address2.setAuthor(author2);
        email2.setAuthor(author2);

        advertisement2.setAuthor(author2);
        author2.addAdvertisement(advertisement2);

        telephone2.setAuthor(author2);
        telephone3.setAuthor(author2);
        author2.addTelephone(telephone2);
        author2.addTelephone(telephone3);


        Advertisement advertisement3 = new Advertisement("SERVICES", "uio",
                LocalDateTime.of(2012, 5, 10, 10, 30),
                "whytuktil56786i", 20);


        Address address3 = new Address("jklfg");
        Email email3 = new Email("fertht6666");
        Telephone telephone4 = new Telephone("123456");
        Telephone telephone5 = new Telephone("667788");

        author3.setAddress(address3);
        author3.setEmail(email3);
        address3.setAuthor(author3);
        email3.setAuthor(author3);

        advertisement3.setAuthor(author3);
        author3.addAdvertisement(advertisement3);

        telephone4.setAuthor(author3);
        telephone5.setAuthor(author3);
        author3.addTelephone(telephone4);
        author3.addTelephone(telephone5);

        entityManager.persist(author1);
        entityManager.persist(author2);
        entityManager.persist(author3);*/


        Query updateInformation = entityManager.createNamedQuery("updateInformation");

        updateInformation.setParameter("pattern", "wdefrqqqqqqqqqqqqq");

        updateInformation.executeUpdate();

        //Query selectByHeading = entityManager.createNamedQuery("selectByHeading");
//        Query selectByHeading = entityManager.createNamedQuery("filter");
        //selectByHeading.setParameter("pattern", "SERVICES");
//        selectByHeading.getResultList().forEach(System.out::println);

//        Query query = entityManager.createQuery(
//                "SELECT c FROM AdvertismenBoard c");
//       query.getResultList().forEach(System.out::println);

//        Advertisement advert = entityManager.find(Advertisement.class, 1);
//        advert.setText("gthtyjuyjjyu");
//
//

//        Query updateInformation = entityManager.createQuery("updateInformation");
//        TypedQuery<Advertisement> query = entityManager.createNamedQuery("updateInformation", Advertisement.class);
//        TypedQuery<Advertisement> query1 = entityManager.createNamedQuery("selectByHeading", Advertisement.class);
//        TypedQuery<Advertisement> query2 = entityManager.createNamedQuery("selectByHeading", Advertisement.class);
//
//        updateInformation.setParameter("pattern", "hellooo");
//       updateInformation.getResultList().forEach(System.out::println);
//        System.out.println("/////////////");
//        query1.getResultList().forEach(System.out::println);
//        System.out.println("/////////////");
//       query2.getResultList().forEach(System.out::println);


        transaction.commit();

        entityManager.close();
        factory.close();
    }
}
