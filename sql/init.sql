use compl;

truncate table user;
truncate table user_authorities;
truncate table compliment;
truncate table compliment_like;
truncate table log;

insert into user (user_id, user_name, user_password, state, point, created_at) values ('user1', '사용자1', '1234', 'Y', 100000, NOW());
insert into user (user_id, user_name, user_password, state, point, created_at) values ('user2', '사용자2', '1234', 'Y', 100000, NOW());
insert into user (user_id, user_name, user_password, state, point, created_at) values ('admin', '운영자', '1234', 'Y', 100000, NOW());
insert into user_authorities values ('user1', 'ROLE_USER');
insert into user_authorities values ('user2', 'ROLE_USER');
insert into userr_authorities values ('admin', 'ROLE_ADMIN');
