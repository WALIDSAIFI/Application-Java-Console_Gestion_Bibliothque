package src.Présentation;
import java.sql.SQLException;
import java.time.LocalDate;
import  src.DAO.*;

import src.Métier.*;


public class main {

    public static void main(String[] args) {

        // Création des objets Livre
        Livre l1 = new Livre(
                "Le Petit Prince",
                "Antoine de Saint-Exupéry",
                LocalDate.of(1943, 4, 6),
                96,
                "97801560195");

        Livre l2 = new Livre(
                "1984",
                "George Orwell",
                LocalDate.of(1949, 6, 8),
                328,
                "97804515235");

        Livre l3 = new Livre(
                "La Peste",
                "Albert Camus",
                LocalDate.of(1947, 6, 10),
                307,
                "9782070363027");
       // LivreDAO.afficherTousLesLivres();
     //   MagazineDAO.afficherTousLesMagazines();
        Livre l4 = new Livre(
                "Moby Dick",
                "Herman Melville",
                LocalDate.of(1851, 10, 18),
                635,
                "123456789012");



        Magazine m1 = new Magazine(
                "National Geographic",
                "National Geographic Society",
                LocalDate.of(2024, 8, 1),
                120,
                123);

        // Exemple 2
        Magazine m2 = new Magazine(
                "Time",
                "Time Inc.",
                LocalDate.of(2024, 7, 15),
                98,
                456);


        Magazine m3 = new Magazine(
                "Vogue",
                "Conde Nast",
                LocalDate.of(2024, 9, 1),
                150,
                789);

        Magazine m4 = new Magazine(
                "TechCrunch",
                "TechCrunch",
                LocalDate.of(2024, 6, 5),
                80,
                -1);


        JournalScientifique journal1 = new JournalScientifique(
                "Journal of Advanced Research",
                "Dr. Alice Smith",
                LocalDate.of(2023, 5, 15),
                120,
                "Physique Quantique"
        );

        JournalScientifique journal2 = new JournalScientifique(
                "Youcode",
                "Dr. John Doe",
                LocalDate.of(2022, 11, 8),
                150,
                "Biologie Moléculaire"
        );




        TheseUniversitaire these1 = new TheseUniversitaire(
                "Machine Learning Applications",
                "Dr. WALID SAIFI",
                LocalDate.of(2022, 5, 15),
                200,
                "Université de Paris",
                "Informatique"
        );

        TheseUniversitaire these2 = new TheseUniversitaire(
                "Deep Learning Techniques",
                "Dr. Alice Johnson",
                LocalDate.of(2023, 1, 10),
                220,
                "Université de Paris",
                "Informatique"
        );

    Console.afficheMenu();


    }


}




