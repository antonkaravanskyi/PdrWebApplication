create sequence hibernate_sequence start 1 increment 1;

create table test (
test_id int4 not null,
test_name varchar(20),
primary key (test_id));

create table task (
task_id int4 not null,
test_id int4 not null,
task_name varchar(350),
question varchar(350),
filename varchar(255),
primary key (task_id),
foreign key (test_id) references test(test_id));

create table answer (
task_id int4 not null,
answer_name varchar(350),
correct boolean,
foreign key (task_id) references task(task_id));

create table usr (
id int4 not null,
username varchar(50),
password varchar(50),
active boolean,
primary key (id));

create table user_role(
user_id int4 not null,
roles VARCHAR (10),
foreign key (user_id) references usr(id));