CREATE DATABASE db2;

CREATE TABLE Users (
User_id INT PRIMARY KEY,
Name VARCHAR(100)
);

CREATE TABLE Role(
Role_id INT PRIMARY KEY,
Role_name VARCHAR(30)
);

INSERT INTO Users(User_id, Name) VALUES(1, 'Jim');
INSERT INTO Users(User_id, Name) VALUES(2, 'Mick');
INSERT INTO Users(User_id, Name) VALUES(3, 'Sasha');
INSERT INTO Users(User_id, Name) VALUES(4, 'Ted');
INSERT INTO Users(User_id, Name) VALUES(5, 'Nick');

INSERT INTO Role(Role_id, Role_name) VALUES(1, 'User');
INSERT INTO Role(Role_id, Role_name) VALUES(2, 'Admin');

CREATE TABLE UserRoleRelations(
User_id INT NOT NULL,
Role_id INT NOT NULL,
FOREIGN KEY(User_id) REFERENCES Users(User_id),
FOREIGN KEY (Role_id) REFERENCES Role(Role_id)
);

INSERT INTO UserRoleRelations(User_id, Role_id) VALUES(1,1);
INSERT INTO UserRoleRelations(User_id, Role_id) VALUES(2,1);
INSERT INTO UserRoleRelations(User_id, Role_id) VALUES(3,2);
INSERT INTO UserRoleRelations(User_id, Role_id) VALUES(4,1);
INSERT INTO UserRoleRelations(User_id, Role_id) VALUES(5,2);

SELECT User_id FROM UserRoleRelations WHERE Role_id = 1;
SELECT User_id FROM UserRoleRelations WHERE Role_id = 2;

