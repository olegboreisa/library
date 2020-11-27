DROP TABLE IF EXISTS book;

CREATE TABLE book (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
    year INTEGER
);

INSERT INTO book (author, name, year) VALUES
    ('John', 'Death', 1994),
    ('Adam', 'Amazon', 2005),
    ('Magnus', 'Chess', 2020);