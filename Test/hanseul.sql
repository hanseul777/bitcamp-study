drop table hanseul;

create table hanseul (
id number(4) not null primary key,
email varchar2(10) not null,
phone number(12) not null
);

insert into hanseul(id, email, phone) values (111, 'a@han', 010);
insert into hanseul(id, email, phone) values (222, 'b@han', 3305);
insert into hanseul(id, email, phone) values (333, 'c@han', 6343);

select * from hanseul;

alter table hanseul add ( name varchar2(13) );
alter table hanseul drop column name;

alter table hanseul add ( name number(10) );
alter table hanseul modify ( name varchar2(10) );

alter table hanseul rename column name to username;

commit;