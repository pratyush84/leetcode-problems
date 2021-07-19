CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
       select if (N<=max(a.Rank), a.Salary, NULL)
      from
      (
          select Id, Salary, dense_rank() over(order by Salary desc) as "Rank"
          from Employee
      )a
      where a.Rank = N
      
  );
END