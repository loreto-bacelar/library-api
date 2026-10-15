package com.loreto.library_api.service;

import com.loreto.library_api.model.Author;
import com.loreto.library_api.model.dto.AuthorDTO;
import com.loreto.library_api.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author save(AuthorDTO authorDTO){
        Author authorEntity = authorDTO.fromDto();
        return authorRepository.save(authorEntity);
    }
}
