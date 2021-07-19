# Write your MySQL query statement below
WITH T AS(
select *, lag(Temperature,1) OVER(ORDER BY recordDate) as prev_day_temp, lag(recordDate,1) OVER(ORDER BY recordDate) as prev_day from Weather
)
select id from T where Temperature > prev_day_temp and datediff(recordDate,prev_day) = 1;