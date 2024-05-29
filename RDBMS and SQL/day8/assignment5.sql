SELECT * FROM library.book;
CREATE INDEX title_idx ON book(title);
DROP INDEX title_idx ON book;
INSERT INTO book (book_id, title, publication_date, num_copies) VALUES (1, 'java', '1984-01-01', 500);
UPDATE book set num_copies = 1000 WHERE book_id = 1;
INSERT INTO book (book_id, title, publication_date, num_copies) VALUES (2, 'python', '1986-06-01', 850);
DELETE FROM book where book_id = 2;