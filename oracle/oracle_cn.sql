select c.id from s_customer c where exists (select o.customer_id from s_ord o where o.customer_id = c.id);
select c.id from s_customer c intersect select o.customer_id from s_ord o ;
insert into s_customer
