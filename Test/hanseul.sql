drop table hanseul;

create table hanseul (
id number(4) not null primary key,
email varchar2(10) not null,
phone number(12) not null,
name varchar2(10) not null
);

select * from hanseul;

commit;