START TRANSACTION;
INSERT INTO orders (cus_id,order_date,total)
VALUES (1,'2012-12-05',199.00);
COMMIT;
UPDATE product
set quantity = quantity -1
WHERE p_id = 1;
ROLLBACK;


START TRANSACTION;
INSERT INTO orders (cus_id,order_date,total)
VALUES (1,'2017-12-05',199.00);
SAVEPOINT sp1;
INSERT INTO orders (cus_id,order_date,total)
VALUES (3,'2016-02-15',199.00);
SAVEPOINT sp2;
INSERT INTO orders (cus_id,order_date,total)
VALUES (4,'2013-04-05',199.00);
ROLLBACK TO SAVEPOINT sp2;

COMMIT;


select * from orders;