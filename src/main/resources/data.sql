SET IDENTITY_INSERT Categories ON

INSERT INTO Categories(Id, Name) VALUES
(1, 'Elektronik'),
(2, 'Perlengkapan Kamar Mandi'),
(3, 'Perlengkapan Dapur');

SET IDENTITY_INSERT Categories OFF


INSERT INTO Products(Name, Price, Stock, CategoryId) VALUES
('Laptop', 11000000, 5, 1),
('Mouse', 1000000, 100, 1),
('Keyboard', 2000000, 50, 1),
('Sabun Cuci Tangan', 23000, 28, 2 ),
('Spatula', 50000, 10, 3),
('Wok', 350000, 2, 3);