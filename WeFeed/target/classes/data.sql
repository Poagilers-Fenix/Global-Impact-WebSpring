
INSERT INTO endereco (cep, bairro, cidade, uf, logradouro, numero, complemento) VALUES
('08568-700', 'Nova Poá', 'Poá', 'SP', 'Rua do Estado', '456', 'É uma casa'),
('08568-354', 'Osasco', 'São Paulo', 'SP', 'Rua Rio de Minas', '78', 'É uma casa verde');


INSERT INTO estabelecimento (nome, cnpj, telefone, email, password, endereco_id) VALUES
('Mercado Compre Mais', '351236780001-45', '(11) 93500-0281', 'compremais@gmail.com', '$2a$12$MZFmOTlrrnyUZYzDFL.hPugABGgCso8F/HC/UAlC6jYLK4tO16zVS', 1),
('Supermercados Veran', '351236780001-45', '(11) 93500-0281', 'veran@gmail.com', '$2a$12$MZFmOTlrrnyUZYzDFL.hPugABGgCso8F/HC/UAlC6jYLK4tO16zVS', 2);


INSERT INTO ong (nome, descricao, telefone,foto, email, endereco_id) VALUES
('Ong Juntos Somos Mais', 'A Ong Juntos Somos Mais é uma organização social sem fins lucrativos, 
fundada em 2013, que atua na cidade de São Paulo. Nossa missão é estimular famílias com 
crianças e adolescentes em risco social a alcançar o pleno exercício de sua autonomia e 
cidadania.', '(11) 94678-1809', 'https://quizizz.com/media/resource/gs/quizizz-media/quizzes/007aae49-a1f2-4d3b-b75b-ee004690adf3', 'somosmais@ong.com',2),

('Institudo da Criança', 'O Instituto da Criança é uma organização social sem fins lucrativos, 
fundada em 2009, que atua na cidade de São Paulo. Nossa missão é estimular famílias com 
crianças e adolescentes em risco social a alcançar o pleno exercício de sua autonomia e 
cidadania.', '(11) 93500-0281', 'https://lagartense.com.br/wp-content/uploads/2019/04/batera-2030-blog-ong-alrededor-ods.jpg', 'institutocrianca@ong.com', 1);


INSERT INTO item (nome, foto) VALUES
('Arroz', 'https://statics.angeloni.com.br/super/files/produtos/1989022/1989022_1_zoom.jpg'),
('Feijão', 'https://statics.angeloni.com.br/super/files/produtos/1989022/1989022_1_zoom.jpg'),
('Batata', 'https://statics.angeloni.com.br/super/files/produtos/1989022/1989022_1_zoom.jpg'),
('Mandioca', 'https://statics.angeloni.com.br/super/files/produtos/1989022/1989022_1_zoom.jpg'),
('Beterraba', null);










