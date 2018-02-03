

create database mybatis;
		use mybatis;


#基础测试
CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20), age INT);
INSERT INTO users(NAME, age) VALUES('Tom', 12);
INSERT INTO users(NAME, age) VALUES('Jack', 11);


#测试表明和类字段名称不统一
CREATE TABLE orders(
  order_id INT PRIMARY KEY AUTO_INCREMENT,
  order_no VARCHAR(20),
  order_price FLOAT
);
INSERT INTO orders(order_no, order_price) VALUES('aaaa', 23);
INSERT INTO orders(order_no, order_price) VALUES('bbbb', 33);
INSERT INTO orders(order_no, order_price) VALUES('cccc', 22);



#测试一对一表查询
CREATE TABLE teacher(
  t_id INT PRIMARY KEY AUTO_INCREMENT,
  t_name VARCHAR(20)
);
CREATE TABLE class(
  c_id INT PRIMARY KEY AUTO_INCREMENT,
  c_name VARCHAR(20),
  teacher_id INT
);
ALTER TABLE class ADD CONSTRAINT fk_teacher_id FOREIGN KEY (teacher_id) REFERENCES teacher(t_id);

INSERT INTO teacher(t_name) VALUES('LS1');
INSERT INTO teacher(t_name) VALUES('LS2');

INSERT INTO class(c_name, teacher_id) VALUES('bj_a', 1);
INSERT INTO class(c_name, teacher_id) VALUES('bj_b', 2);


#联合查询一对多
CREATE TABLE student(
  s_id INT PRIMARY KEY AUTO_INCREMENT,
  s_name VARCHAR(20),
  class_id INT
);
INSERT INTO student(s_name, class_id) VALUES('xs_B', 1);
INSERT INTO student(s_name, class_id) VALUES('xs_D', 1);
INSERT INTO student(s_name, class_id) VALUES('xs_E', 1);
INSERT INTO student(s_name, class_id) VALUES('xs_A', 2);
INSERT INTO student(s_name, class_id) VALUES('xs_H', 2);
INSERT INTO student(s_name, class_id) VALUES('xs_J', 2);