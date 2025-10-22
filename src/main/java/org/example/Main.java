package org.example;

import org.example.cinehub.model.Category;
import org.example.cinehub.model.Director;
import org.example.cinehub.model.Film;
import org.example.cinehub.repository.CategoryRepository;
import org.example.cinehub.repository.DirectorRepository;
import org.example.cinehub.repository.FilmRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        CategoryRepository categoryRepo = context.getBean(CategoryRepository.class);

        Category category = new Category();
        category.setName("Science Fiction");
        category.setDescription("Films that explore futuristic concepts and advanced technology.");

        categoryRepo.save(category);

        DirectorRepository directorRepo = context.getBean(DirectorRepository.class);

        Director director = new Director();
        director.setFirstName("Christopher");
        director.setLastName("Nolan");
        director.setNationality("British-American");
        director.setBirthDate(java.time.LocalDate.of(1970, 7, 30));
        director.setBiography("Christopher Nolan is a renowned filmmaker known for his complex storytelling and innovative techniques.");

        directorRepo.save(director);


        // Get FilmRepository bean
        FilmRepository filmRepo = context.getBean(FilmRepository.class);


        Film film = new Film();
        film.setTitle("Inception");
        film.setReleaseYear(2010);
        film.setDuration(148);
        film.setRating(8.8);
        film.setSynopsis("A thief who steals corporate secrets using dream-sharing technology...");
        film.setDirector(director);
        film.setCategory(category);


        filmRepo.save(film);





    }
}