create database compl CHARACTER SET utf8;

CREATE USER 'compluser'@'localhost' IDENTIFIED BY 'password1!';
CREATE USER 'compluser'@'%' IDENTIFIED BY 'password1!';

GRANT ALL PRIVILEGES ON compl.* TO 'compluser'@'localhost';
GRANT ALL PRIVILEGES ON compl.* TO 'compluser'@'%';

use compl;

create table compl.user (
  user_id varchar(50) not null primary key,
  user_name varchar(50),
  user_password varchar(50),
  state varchar(20),
  point bigint,
  sent_point bigint,
  received_point bigint,
  created_at datetime,
  updated_at datetime,
  deleted_at datetime
) character set utf8;

create table compl.user_authorities (
  user_id varchar(50) not null,
  authority varchar(50) not null
) character set utf8;

create table compl.compliment (
  compliment_seq int not null primary key,
  sender_id varchar(50),
  sender_name varchar(50),
  receiver_id varchar(50),
  receiver_name varchar(50),
  compliment_point bigint,
  reward_point bigint,
  compliment_message varchar(2000),
  state varchar(20),
  created_at datetime,
  updated_at datetime,
  deleted_at datetime
) character set utf8;

create table compl.compliment_like (
  like_seq int not null primary key,
  compliment_seq varchar(50),
  user_id varchar(50)
) character set utf8;

create table compl.log (
  log_seq int not null primary key,
  log varchar(2000),
  user_id varchar(50),
  created_at datetime,
  updated_at datetime,
  deleted_at datetime
) character set utf8;
