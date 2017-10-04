package com.ftm.giflib.controller;

import com.ftm.giflib.data.GifRepository;
import com.ftm.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/results-search")
    public String getResultSearch(@RequestParam("q") String name, ModelMap modelMap) {
        List<Gif> allOccurrences = gifRepository.getByName(name);
        modelMap.put("gifs", allOccurrences);
        return "results-search";
    }
}
