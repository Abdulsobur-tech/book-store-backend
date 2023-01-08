package com.exampleCrude.democrude.repo;

import com.exampleCrude.democrude.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo  extends JpaRepository<Book,Long> {
}
