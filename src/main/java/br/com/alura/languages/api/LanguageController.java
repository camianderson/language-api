package br.com.alura.languages.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping ("/languages")
    public List<Language> obtainLanguages() {
        List<Language> languages = repository.findAll();
        return languages;
    }
}
