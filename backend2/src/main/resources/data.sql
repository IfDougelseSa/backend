INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Bob', 'Green', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_WORKER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);

INSERT INTO tb_control (date, user_id) VALUES (NOW(), 2);
INSERT INTO tb_control (date, user_id) VALUES (NOW(), 1);
INSERT INTO tb_control (date, user_id) VALUES (NOW(), 1);
INSERT INTO tb_control (date, user_id) VALUES (NOW(), 2);

INSERT INTO tb_user (id, first_name, last_name, email, password) VALUES (1, 'Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (id, first_name, last_name, email, password) VALUES (2, 'Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (id, first_name, last_name, email, password) VALUES (3, 'Bob', 'Green', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (id, authority) VALUES (1, 'ROLE_WORKER');
INSERT INTO tb_role (id, authority) VALUES (2, 'ROLE_ADMIN');

INSERT INTO tb_user_role (id, user_id, role_id) VALUES (1, 1, 1);
INSERT INTO tb_user_role (id, user_id, role_id) VALUES (2, 2, 2);
INSERT INTO tb_user_role (id, user_id, role_id) VALUES (3, 3, 1);

INSERT INTO tb_control (id, date, user_id) VALUES (1, NOW(), 2);
INSERT INTO tb_control (id, date, user_id) VALUES (2, NOW(), 1);
INSERT INTO tb_control (id, date, user_id) VALUES (3, NOW(), 1);
INSERT INTO tb_control (id, date, user_id) VALUES (4, NOW(), 2);



