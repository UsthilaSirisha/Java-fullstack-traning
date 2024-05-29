SELECT * FROM world.customers;
use world;
insert into world.customers (c_id, name , email, phone_number, address, city, region) 
values (1,'frank','frank@gmail.com',876433,'toronto,canada','toronto','canada'); 
SELECT name, email FROM world.customers WHERE city = 'toronto';
select world.customers.name, world.orders.o_id, world.orders.o_date FROM world.customers INNER JOIN world.orders ON world.customers.c_id = orders.co_id WHERE customers.region = 'canada';
select world.customers.name, orders.o_id,orders.o_date from world.customers left join orders on world.customers.c_id=orders.co_id;
select co_id,o_value from orders where o_value > ( select avg(o_value) from orders);
select concat(cfirst_name,' ', clast_name) as full_name, 'Customer' as role,
orders.o_id,
orders.o_date,
orders.o_value
from customers
join orders on customers.c_id = orders.co_id
where orders.o_value > (
select avg(o_value) from orders)
UNION 
select
concat(efirst_name, ' ', elast_name) as full_name,
'Employee' as role,
NULL as o_id,
NULL as o_date,
NULL as o_value
from employees;