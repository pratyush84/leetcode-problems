# Write your MySQL query statement below
WITH T AS(
select Email, count(*) as count from Person GROUP BY Email
)
select Email from T where count > 1;