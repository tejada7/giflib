package com.ftm.giflib.data;

import com.ftm.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component // To make Spring aware of this class in order to make an eventual instantiation
public class GifRepository {
    // Data set
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", 1, LocalDate.of(2015
                , 2, 13), "Chris Ramacciotti", false),
        new Gif("ben-and-mike", 2, LocalDate.of(2015
                , 10, 30), "Ben Jakuben", true),
        new Gif("book-dominos", 3, LocalDate.of(2015
                , 9, 15), "Craig Dennis", false),
        new Gif("compiler-bot", 1, LocalDate.of(2015
                , 2, 13), "Ada Lovelace", true),
        new Gif("cowboy-coder", 2, LocalDate.of(2015
                , 2, 13), "Grace Hopper", false),
        new Gif("infinite-andrew", 3, LocalDate.of(2015
                , 8, 23), "Marissa Mayer", true)
    );

    /**
     * Retrieve a gif given its name.
     * @param name of the gif
     * @return a gif
     */
    public Gif findByName(String name) {
        return ALL_GIFS.stream()
                .filter(gif -> gif.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    /**
     * Retrieve the list of category(ies) that match the provided id.
     * @param id of the category, present as an instance variable in the Gif class
     * @return a list of Gifs if any element found or null otherwise
     */
    public List<Gif> findByCategoryId(int id) {
        return ALL_GIFS.stream()
                .filter(gif -> gif.getCategoryId() == id)
                .collect(Collectors.toList());
    }

    /**
     * Get those gifs that are favorites.
     * @return a list of occurrences if any found, otherwise null
     */
    public List<Gif> getAllFavoriteGifs() {
        return ALL_GIFS.stream()
                .filter(gif -> gif.isFavorite())
                .collect(Collectors.toList());
    }

    /**
     * Get those gifs that match a name
     * @return a list of occurrences or empty if not found
     */
    public List<Gif> getByName(String name) {
        return ALL_GIFS.stream()
                .filter(gif -> gif.getName().equals(name))
                .collect(Collectors.toList());
    }
}
