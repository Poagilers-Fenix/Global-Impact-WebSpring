CREATE TABLE estabelecimento (
id bigint PRIMARY KEY auto_increment,
email varchar(200),
senha varchar(200)
);

INSERT INTO estabelecimento (email, senha) VALUES
('kaue@gmail.com', '1234'),
('lari@gmail.com', '1234');