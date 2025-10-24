package org.example;

import org.example.cinehub.controller.FilmController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/dispatcher-servlet.xml");
//
//
//        CategoryRepository categoryRepo = context.getBean(CategoryRepository.class);
//        FilmRepository filmRepo = context.getBean(FilmRepository.class);
//        DirectorRepository directorRepo = context.getBean(DirectorRepository.class);

//        Category category = new Category();
//        category.setName("Science Fiction");
//        category.setDescription("Films that explore futuristic concepts and advanced technology.");
//
//        categoryRepo.save(category);
//
//
//        Director director = new Director();
//        director.setFirstName("Christopher");
//        director.setLastName("Nolan");
//        director.setNationality("British-American");
//        director.setBirthDate(java.time.LocalDate.of(1970, 7, 30));
//        director.setBiography("Christopher Nolan is a renowned filmmaker known for his complex storytelling and innovative techniques.");
//
//        directorRepo.save(director);
//
//
//        Film film = new Film();
//        film.setTitle("Dream Within a Dream");
//        film.setReleaseYear(2011);
//        film.setDuration(150);
//        film.setRating(9.8);
//        film.setSynopsis("A skilled thief is given a chance at redemption if he can successfully perform an inception.");
//        film.setDirector(director);
//        film.setCategory(category);
//
//
//        filmRepo.save(film);



//        FilmRepository filmRepository = context.getBean(FilmRepository.class);
//        for (Film film : filmRepository.findAll()) {
//            System.out.println("Film Title: " + film.getTitle());
//            System.out.println("Director: " + film.getDirector().getFirstName() + " " + film.getDirector().getLastName());
//            System.out.println("Category: " + film.getCategory().getName());
//            System.out.println("-----");
//        }
        FilmController filmController = context.getBean(FilmController.class);
//        for (Film film : filmController.getAllFilms()) {
//            System.out.println("Film Title: " + film.getTitle());
//            System.out.println("Director: " + film.getDirector().getFirstName() + " " + film.getDirector().getLastName());
//            System.out.println("Category: " + film.getCategory().getName());
//            System.out.println("-----");
//        }

        filmController.getAllFilms();

    }
}
