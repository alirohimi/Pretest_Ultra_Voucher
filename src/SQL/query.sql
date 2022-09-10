--membuat tabel dengan nama Dbtest
CREATE TABLE Dbtest (
                        id INT(6) PRIMARY KEY,
                        name VARCHAR(30),
                        parent_id int(6)
);

--insert data pada tabel

INSERT INTO Dbtest
                        (id, name, parent_id)
VALUES
                        (1, 'Zaki', 2),
                        (2,'Ilham',NULL),
                        (3,'Irwan',2),
                        (4,'Arka',3);

--query menampilkan parent_name berdasarkan parent_id
SELECT s.id, s.name, p.name as parent_name
FROM Dbtest s LEFT JOIN Dbtest p ON s.parent_id = p.id;

