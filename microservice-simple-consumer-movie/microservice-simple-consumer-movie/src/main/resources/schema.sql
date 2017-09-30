drop table user if EXISTS ;
create table user(id bigint generated by DEFAULT as IDENTITY ,
username varchar(40),
name VARCHAR (20),
age int(3),
balance DECIMAL (10,2),
PRIMARY  KEY (id));
insert into user(id,username.name,age,balance) values(1,'user1','张三',20,100.00);
insert into user(id,username.name,age,balance) values(2,'user2','李四',22,100.00);
insert into user(id,username.name,age,balance) values(3,'user3','王五',23,100.00);
insert into user(id,username.name,age,balance) values(4,'user4','杜甫',25,100.00);
insert into user(id,username.name,age,balance) values(5,'user5','白居易',23,100.00);