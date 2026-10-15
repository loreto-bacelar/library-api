package com.loreto.library_api.model.dto;

import com.loreto.library_api.model.Author;

import java.time.LocalDate;

public record AuthorDTO(
        String name,
        LocalDate birthDate,
        String nationality
) {
    public Author fromDto(){
        Author author = new Author();
        author.setName(this.name);
        author.setBirthDate(this.birthDate);
        author.setNationality(this.nationality);

        return author;
    }
}
