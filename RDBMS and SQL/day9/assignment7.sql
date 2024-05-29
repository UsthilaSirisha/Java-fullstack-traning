INSERT INTO author (author_id, name, biography) VALUES (1, 'john', 'newyork'); 
INSERT INTO author (author_id, name, biography) VALUES (2, 'frank', 'canada');
INSERT INTO book (book_id, title, publication_date, publisher_id, author_id,
 num_copies, available_copies) VALUES
('1', 'java', '1984-01-01', NULL, NULL, '1000', '1');
INSERT INTO book (book_id, title, publication_date, publisher_id, author_id,
 num_copies, available_copies) VALUES
('2', 'Python', '1984-01-01', NULL, NULL, '1000', '500');
INSERT INTO book (book_id, title, publication_date, publisher_id, author_id,
 num_copies, available_copies) VALUES
('3', 'Java', '1984-01-01', NULL, NULL, '1000', '1');
INSERT INTO book (book_id, title, publication_date, publisher_id, author_id,
 num_copies, available_copies) VALUES
('4', 'AdvanceJAVA', '1984-01-01', NULL, NULL, '1000', '1');
INSERT INTO book (book_id, title, publication_date, publisher_id, author_id,
 num_copies, available_copies) VALUES
('5', 'CoreJava', '1984-01-01', NULL, NULL, '1000', '1');
 INSERT INTO book (book_id, title, publication_date, publisher_id, author_id,
 num_copies, available_copies) VALUES
('6', 'JavaServlets', '1994-01-01', NULL, NULL, '1000', '1');
 
 
 
 
UPDATE  book  SET title = 'html' WHERE book_id = 3;

DELETE from book where book_id = 3;

load data infile 'C:\Users\Administrator\Downloads\book.csv' 
into table book
fields terminated by ','
lines terminated by '\n'; 