SELECT DISTINCT salary
FROM Employees e1
WHERE N-1 = (
    SELECT COUNT(DISTINCT salary)
    FROM Employees e2
    WHERE e2.salary > e1.salary
);


CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set n=n-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from employee 
      order by salary desc 
      limit 1 offset n
  );
END