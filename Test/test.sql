create table test (
 id number(4) not null primary key,
 name varchar(10) not null,
 birth number(10) not null
);

desc test
insert into test values(22,'aaa','bbb');
commit;
select * from test;