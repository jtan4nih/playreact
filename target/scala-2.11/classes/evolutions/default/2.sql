-- # --- Sample dataset
--
-- # --- !Ups
--
-- insert into employee (id,name,address,designation) values (1,'Anand Kumar Singh', 'Knoldus Software', 'Sr. Software Consultant');
-- insert into employee (id,name,address,designation) values (2,'Supriya', 'Knoldus Software','Sr. Software Consultant');
-- insert into employee (id,name,address,designation) values (3,'Jyoti', 'Knoldus Software','Software Consultant');
-- insert into employee (id,name,address,designation) values (4,'Mayank', 'Knoldus Software','Sr. Software Consultant');
--
-- # --- !Downs
--
-- delete from employee;


# --- Sample dataset

# --- !Ups

insert into bloggermessage (id,title,text,datetime) values (1,'what', 'study info', '2016-02-11 11:00');
insert into bloggermessage (id,title,text,datetime) values (2,'where', 'Japan','2016-02-11 11:00');
insert into bloggermessage (id,title,text,datetime) values (3,'how', 'learn','2016-02-11 11:00');
insert into bloggermessage (id,title,text,datetime) values (4,'why', 'grow ','2016-02-11 11:00');

# --- !Downs

delete from bloggermessage;

