-- PRODUCTS

INSERT INTO product (id, name, price)
VALUES (111, 'iPhone', 1200);

INSERT INTO product (id, name, price)
VALUES (112, 'iPad', 900);

INSERT INTO product (id, name, price)
VALUES (113, 'Pen', 5);

-- REVIEWS

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (1,'awesome phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (2,'amazing phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (3,'awesome tablet',5,112);
