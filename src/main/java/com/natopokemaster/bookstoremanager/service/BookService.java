package com.natopokemaster.bookstoremanager.service;
import com.natopokemaster.bookstoremanager.entity.Book;
import com.natopokemaster.bookstoremanager.dto.MessageResponseDTO;
import com.natopokemaster.bookstoremanager.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create (Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with IID " + savedBook.getId())
                .build();
    }
}
