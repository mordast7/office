insert into users (id, age, name, password) values (1, 21, 'sasha', 'sasha');
insert into articles (id, color, text) values (1, 'WHITE', 'asd');
insert into articles (id, color, text) values (2, 'RED', 'zxc');
insert into articles (id, color, text) values (3, 'WHITE', 'qwe');

insert into users_articles (user_id, articles_id) values (1, 1);
insert into users_articles (user_id, articles_id) values (1, 2);
insert into users_articles (user_id, articles_id) values (1, 3);

insert into users (id, age, name, password) values (2, 10, 'anya', 'anya');
insert into articles (id, color, text) values (4, 'BLACK', 'eeeee');
insert into articles (id, color, text) values (5, 'BLUE', 'uuuuu');
insert into articles (id, color, text) values (6, 'WHITE', 'aaaaa');

insert into users_articles (user_id, articles_id) values (2, 4);
insert into users_articles (user_id, articles_id) values (2, 5);
insert into users_articles (user_id, articles_id) values (2, 6);

