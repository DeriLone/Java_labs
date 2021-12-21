CREATE DATABASE db_1;


CREATE TABLE Comments(
Game_id INT PRIMARY KEY,
Game_nickname VARCHAR(40),
Registration_date DATE,
Best_rang VARCHAR(360)
);

INSERT INTO Comments(Game_id, Game_nickname, Registration_date, Best_rang) VALUES(1, 'BloodSoul', '2008-12-02', 'Gold');
INSERT INTO Comments(Game_id, Game_nickname, Registration_date, Best_rang) VALUES(2, 'MarchHare', '2018-12-02', 'Bronze');
INSERT INTO Comments(Game_id, Game_nickname, Registration_date, Best_rang) VALUES(3, 'Frenzy', '2020-12-02', 'Platinum');
INSERT INTO Comments(Game_id, Game_nickname, Registration_date, Best_rang) VALUES(4, 'Outriggr', '2016-12-02', 'Bronze');
INSERT INTO Comments(Game_id, Game_nickname, Registration_date, Best_rang) VALUES(5, 'Crucifery', '2017-12-02', ' Silver');
SELECT * FROM Comments;
