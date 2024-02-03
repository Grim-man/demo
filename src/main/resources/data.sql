create database demo if not exists;

use demo;

create table if not exists test(
    id      int primary key auto_increment not null,
    name    varchar(20)
);

insert into test(id, name) value(1,'张三');

insert into test(name) values('王五');
insert into test(name) values('李四');

select id,name from test;