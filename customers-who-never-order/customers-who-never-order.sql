# Write your MySQL query statement below
select c.Name as Customers from Customers c LEFT JOIN Orders o
ON c.Id=o.CustomerId where o.CustomerId is NULL;