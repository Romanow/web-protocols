package ru.romanow.protocols.graphql.queries;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.romanow.protocols.graphql.model.AuthorResponse;
import ru.romanow.protocols.graphql.service.AuthorService;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorQuery
        implements GraphQLQueryResolver {
    private final AuthorService authorService;

    public AuthorResponse author(Integer id) {
        return authorService.getAuthorById(id);
    }

    public List<AuthorResponse> authors() {
        return authorService.getAuthors();
    }

    public Integer exception() {
        throw new RuntimeException("test");
    }
}
