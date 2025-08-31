select distinct a.num as ConsecutiveNums
from logs as a,logs as b,logs as c
where a.id+1=b.id and b.id+1=c.id
and a.num=b.num and b.num=c.num;