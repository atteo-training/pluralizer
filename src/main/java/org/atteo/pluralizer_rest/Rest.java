package org.atteo.pluralizer_rest;

import org.atteo.evo.inflector.English;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pluralize")
public class Rest {
    @RequestMapping(path = "{word}", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.ALL_VALUE)

    public String test(@PathVariable("word") String word) {
        return English.plural(word);
    }
}
