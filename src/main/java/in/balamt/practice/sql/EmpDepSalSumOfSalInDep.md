#SQL

Employee, Department, Salary Three tables

Find the Total Salary of each departments' available.

Joining the three table, and using the SUM method to find the sum of salary in each department.


Use the Site
https://onecompiler.com/sqlserver/

```sql
-- create
CREATE TABLE EMPLOYEE (
empId int,
name varchar(100),
dept varchar(50)
);

-- insert
INSERT INTO EMPLOYEE(empId,name,dept) VALUES (0001, 'Clark', 0001);
INSERT INTO EMPLOYEE(empId,name,dept) VALUES (0002, 'Dave', 0002);
INSERT INTO EMPLOYEE(empId,name,dept) VALUES (0003, 'Ava', 0003);
INSERT INTO EMPLOYEE(empId,name,dept) VALUES (0004, 'Boo', 0001);
INSERT INTO EMPLOYEE(empId,name,dept) VALUES (0005, 'Foo', 0002);
INSERT INTO EMPLOYEE(empId,name,dept) VALUES (0006, 'Joo', 0001);

CREATE TABLE DEPARTMENT (
deptId int,
name varchar(100)
);

-- insert
INSERT INTO DEPARTMENT(deptId,name) VALUES (0001, 'IT');
INSERT INTO DEPARTMENT(deptId,name) VALUES (0002, 'HR');
INSERT INTO DEPARTMENT(deptId,name) VALUES (0003, 'SALES');

CREATE TABLE SALARY (
empId int,
salary int
);

-- insert
INSERT INTO SALARY(empId,salary) VALUES (0001, 233);
INSERT INTO SALARY(empId,salary) VALUES (0002, 233);
INSERT INTO SALARY(empId,salary) VALUES (0003, 122);
INSERT INTO SALARY(empId,salary) VALUES (0004, 66);
INSERT INTO SALARY(empId,salary) VALUES (0005, 44);
INSERT INTO SALARY(empId,salary) VALUES (0006, 333);

-- fetch
SELECT d.deptId, SUM(s.salary)
FROM DEPARTMENT d
join EMPLOYEE e on d.deptId = e.dept
join SALARY s on s.empId = e.empId
GROUP BY d.deptId
GO
```


```text
deptId                 
----------- -----------
          1         632
          2         277
          3         122
```