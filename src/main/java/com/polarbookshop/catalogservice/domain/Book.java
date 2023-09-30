package com.polarbookshop.catalogservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.Instant;

public record Book(

        @Id
        Long id,

        @NotBlank(message = "O IBSN do livro deve ser definido")
        @Pattern(regexp = "^([0-9]{10}|[0-9]{13})$", message = "O formato do ISBN deve ser válido.")
        String isbn,
        @NotBlank(message = "Defina o titulo do livro.")
        String title,
        @NotBlank(message = "Defina o autor do livro.")
        String author,

        @NotNull(message = "o preço do livro deve ser definido.")
        @Positive(message = "O preço do livro deve ser maior que zero.")
        Double price,

        String publisher,

        //Quando a entidade foi criada
        @CreatedDate
        Instant createdDate,

        //Quando a entidade foi modificada pela última vez
        @LastModifiedDate
        Instant lastModifiedDate,

        @Version
        int version


) {
    public static Book of(String isbn, String title, String author, Double price, String publisher) {
        return new Book(null, isbn, title, author, price, publisher, null, null, 0);
    }
}
