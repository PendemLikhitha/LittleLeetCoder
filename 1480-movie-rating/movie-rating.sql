# Write your MySQL query statement below
-- select m.user_id, count(m.user_id), u.name 
-- from movierating m join users u 
-- on m.user_id = u.user_id
-- group by u.name
-- order by count(m.user_id) desc, u.name;

-- select m1.movie_id, m1.rating,m1.created_at, m2.title, avg(m1.rating)
-- from movierating m1 join movies m2
-- on m1.movie_id = m2.movie_id
-- where date_format(m1.created_at,'%Y-%m') = '2020-02'
-- group by m2.title
-- order by avg(m1.rating) desc, title;

select name as results
from (
    select u.name 
    from movierating m join users u 
    on m.user_id = u.user_id
    group by u.name
    order by count(m.user_id) desc, u.name
    limit 1
) x

union all

select title as results
from (
    select m2.title
    from movierating m1 join movies m2
    on m1.movie_id = m2.movie_id
    where date_format(m1.created_at,'%Y-%m') = '2020-02'
    group by m2.title
    order by avg(m1.rating) desc, title
    limit 1
) y