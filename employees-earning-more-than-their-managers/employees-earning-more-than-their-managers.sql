# Write your MySQL query statement below
select e.Name as Employee from Employee e JOIN Employee m ON m.Id = e.ManagerId where e.Salary > m.Salary;