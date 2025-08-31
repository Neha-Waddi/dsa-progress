select d.name,e.name as employee,e.salary
from employee e ,department d
where salary in(select max(salary) from employee group by departmentId);
