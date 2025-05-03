package com.example.library.repository;

import com.example.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static final class BookRowMapper implements RowMapper<Book> {

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book book = new Book();

            book.setId(rs.getLong("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setGenre(rs.getString("genre"));
            book.setAvailableCopies(rs.getInt("available_copies"));
            book.setPublishedYear(rs.getInt("published_year"));
            book.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
            book.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
            return book;
        }
    }

    public Book addBook(Book book) {
        String sql = "INSERT INTO book (title, author, genre, published_year, available_copies, created_at, updated_at) VALUES (?,?,?,?,?,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)";
        KeyHolder keyholder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, new String[]{"id"});
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre());
            ps.setInt(4, book.getPublishedYear());
            ps.setInt(5, book.getAvailableCopies());
            return ps;
        }, keyholder);

//        Long generatedId = Objects.requireNonNull(keyholder.getKey()).longValue();
        Long generatedId = (Long) keyholder.getKey();
        return getBookById(generatedId);
    }

    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    public Book getBookById(Long id) {
        String sql = "SELECT * FROM book WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
    }

    public Book updateBook(Long id, Book book) {
        Book existingBook = getBookById(id);
        if (existingBook != null) {
            String sql = "UPDATE book SET title=?, author=?, genre=?, published_year=?, available_copies=?,updated_at=CURRENT_TIMESTAMP WHERE id=?";
            String title = book.getTitle() != null ? book.getTitle() : existingBook.getTitle();
            String author = book.getAuthor() != null ? book.getAuthor() : existingBook.getAuthor();
            String genre = book.getGenre() != null ? book.getGenre() : existingBook.getGenre();
            Integer publishedYear = book.getPublishedYear() != null ? book.getPublishedYear() : existingBook.getPublishedYear();
            Integer availableCopies = book.getAvailableCopies() != null ? book.getAvailableCopies() : existingBook.getAvailableCopies();
            int res = jdbcTemplate.update(sql,
                    title,
                    author,
                    genre,
                    publishedYear,
                    availableCopies,
                    id
            );
            if (res > 0) return getBookById(id);
        }
        return null;
    }

    public Boolean deleteBook(Long id) {
        String sql = "DELETE FROM book WHERE id=?";
        return jdbcTemplate.update(sql, id)>0;
    }
}
