select e.name as Employee
from Employee e join employee m
on e.managerId=m.id and e.salary>m.salary;
