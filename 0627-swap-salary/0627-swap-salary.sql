# Write your MySQL query statement below
#update salary set sex =IF(sex="f","m","f")
update salary set sex=(case when sex='m'
                       then 'f'
                       else 'm'
                       end)


