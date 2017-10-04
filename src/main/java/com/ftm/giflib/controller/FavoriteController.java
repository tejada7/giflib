package com.ftm.giflib.controller;

import com.ftm.giflib.data.GifRepository;
import com.ftm.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoriteController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String fetchAllFavorites(ModelMap modelMap) {
        List<Gif> allFavoriteGifs = gifRepository.getAllFavoriteGifs();
        modelMap.put("gifs", allFavoriteGifs);
        return "favorites";
    }
}
