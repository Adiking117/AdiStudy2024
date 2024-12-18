USE payroll;

select * from emp

BEGIN Transaction

-- UPDATE
UPDATE emp SET sal = 10000 WHERE empno = 1234
COMMIT

INSERT INTO EMP VALUES
        (1122, 'JACK',  'ANALYST',   7566,
        '1982-12-09', 3000, NULL, 20);

INSERT INTO EMP VALUES
        (1122, 'JACK',  'ANALYST1',   7566,
        '1982-12-09', 3000, NULL, 20);


EXEC sp_help 'emp'


-- DELETE FROM emp WHERE 

-- Transaction processing
BEGIN TRANSACTION

INSERT INTO emp(empno, ename) VALUES (1, 'A')
SAVE TRANSACTION T1

INSERT INTO emp(empno, ename) VALUES (2, 'B')
SAVE TRANSACTION T2

INSERT INTO emp(empno, ename) VALUES (3, 'C')
SAVE TRANSACTION T3

INSERT INTO emp(empno, ename) VALUES (4, 'D')
SAVE TRANSACTION T4

ROLLBACK TRANSACTION T2

SELECT * FROM emp

SELECT CONCAT(ename, ' ', ename) FROM emp

SELECT UPPER(ename) FROM emp

SELECT LOWER(ename) FROM emp

UPDATE emp SET ename = LOWER('JACK') WHERE empno=1

-- Trims spaces from left side
SELECT LTRIM(ename) FROM emp

SELECT SUBSTRING(ename, 0, 3) FROM emp
-- SELECT SUBSTRING(ename, 1, 2) FROM emp

-- KING -> KEENG pronounciation
SELECT * FROM emp WHERE SOUNDEX(ename) = SOUNDEX('KEENG')

SELECT ROUND(999.99,2)

SELECT CEILING(999.99)

SELECT FLOOR(945.99)

-- CHeck no. is positive or negative
SELECT SIGN(1)


SELECT GETDATE()

SELECT YEAR(GETDATE())
SELECT MONTH(GETDATE())
SELECT DAY(GETDATE())

SELECT empno, ename, YEAR(GETDATE()) - YEAR(hiredate) FROM emp

SELECT empno, ename,DATEDIFF(YEAR, hiredate, GETDATE()) FROM emp

SELECT empno, ename,DATEDIFF(YYYY, hiredate, GETDATE()) FROM emp

-- SELECT * FROM emp WHERE comm = NULL
-- null has diff meaning
SELECT * FROM emp WHERE comm is NULL

SELECT empno, sal,comm, sal + comm FROM emp

SELECT ISNULL(comm, 0) FROM emp;

SELECT deptno,
CASE
	WHEN deptno = 10 THEN 'Training'
	WHEN deptno = 20 THEN 'Exports'
	WHEN deptno = 30 THEN 'Marketing'
	ELSE 'Production'
END AS [DeptName]
FROM emp ORDER BY deptno;

SELECT COUNT(*) 'TotalCount', MIN(sal) 'Minimum', MAX(sal) 'Maximum', AVG(sal) 'Average' FROM emp;

SELECT COUNT(*) 'TotalCount', MIN(sal) 'Minimum', MAX(sal) 'Maximum', AVG(sal) 'Average' FROM emp GROUP BY job;

SELECT ename, MAX(sal) FROM emp --exception

SELECT sum(sal) from emp where deptno = 10

SELECT deptno, sum(sal) FROM emp GROUP BY deptno;

SELECT deptno FROM emp GROUP BY deptno HAVING SUM(sal) > 15000

SELECT deptno FROM emp GROUP BY deptno HAVING SUM(sal) > 15000 ORDER BY deptno

-- select -> from -> where -> groupby -> having -> orderby

SELECT deptno from emp where ename='smith'
select * from emp
