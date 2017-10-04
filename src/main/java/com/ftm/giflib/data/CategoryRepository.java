package com.ftm.giflib.data;

import com.ftm.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Android"),
            new Category(2, "iOS"),
            new Category(3, "Windows")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    /**
     * Get the Category given its id
     * @param id
     * @return Category instance, null otherwise
     */
    public Category findById(int id) {
        return ALL_CATEGORIES.stream()
                .filter(category -> category.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
