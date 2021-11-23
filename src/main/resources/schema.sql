DROP TABLE IF EXISTS RECIPE;
CREATE TABLE RECIPE (
id INT PRIMARY KEY,
name VARCHAR(255) UNIQUE,
description VARCHAR(255),
instructions VARCHAR(4000),
serves INT,
price INT,
category INT,
vegan BOOLEAN,
vegetarian BOOLEAN,
glutenfree BOOLEAN,
dairyfree BOOLEAN,
kosher BOOLEAN,
keto BOOLEAN,
sugarfree BOOLEAN
);

DOP TABLE IF EXISTS TAGS;
