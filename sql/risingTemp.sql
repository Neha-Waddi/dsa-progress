select w.id from Weather w
join Weather p
where w.recordDate=date_add(p.recordDate,interval 1 day)
and w.temperature>p.temperature;
