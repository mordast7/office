create table articles (id bigint, color varchar(255), text varchar(255), primary key (id));

create table users (id bigint, age integer not null, name varchar(255), password varchar(255), primary key (id));

create table users_articles (user_id bigint not null, articles_id bigint not null);

alter table users add constraint UK_3g1j96g94xpk3lpxl2qbl985x unique (name);

alter table users_articles add constraint UK_rml2bx82ytjmv009b9sqmt6t3 unique (articles_id);

alter table users_articles add constraint FKapkte62m0v1k5y3i867jh5wax foreign key (articles_id) references articles (id);

alter table users_articles add constraint FKe11avvs68a256x26rve0lokf8 foreign key (user_id) references users (id);