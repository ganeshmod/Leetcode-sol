SELECT e1.employee_id, e1.department_id
FROM Employee e1
INNER JOIN Employee e2
    ON e1.employee_id = e2.employee_id
GROUP BY e1.employee_id, e1.department_id, e1.primary_flag
HAVING 
    (COUNT(e1.department_id) = 1 AND e1.primary_flag = 'N')
    OR 
    (COUNT(e1.department_id) > 1 AND e1.primary_flag = 'Y');
