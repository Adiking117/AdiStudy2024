USE payroll;

SELECT * FROM emp;
SELECT * FROM dept;

-- NEED OF JOINS
-- NULL VALUES WILL COME IN END AS IT DOESNT OCCUPY MEMORY
-- NORMALISATION -> DO NOT STORE EVERY PROPERTY IN ONE TABLE ONE ROW INSTEAD
-- STORE ONE ROW IN ONE TABLE AND THE OTHER IN OTHER TABLE

-- CROSS JOIN
SELECT * FROM emp, dept;

-- dept -> driving/master table  
-- emp -> driven/details table
SELECT dname, ename FROM emp, dept;

-- EQUI JOIN / NATURAL JOIN
SELECT dname, ename FROM emp, dept WHERE dept.deptno = emp.deptno;
SELECT dept.DEPTNO, emp.ename, dept.dname FROM emp, dept WHERE dept.DEPTNO = emp.deptno;

-- NESTED FOR LOOP JOIN
SELECT dname, SUM(sal) FROM emp, DEPT WHERE dept.DEPTNO = emp.deptno GROUP BY dname HAVING SUM(sal) > 5000;

-- OUTER JOIN
-- RIGHT OUTER JOIN
SELECT dept.DEPTNO, ename, dname FROM emp RIGHT OUTER JOIN dept ON dept.DEPTNO = emp.deptno;

--LEFT OUTER JOIN
SELECT dept.DEPTNO, ename, dname FROM emp LEFT OUTER JOIN dept ON dept.DEPTNO = emp.deptno;

-- FULL OUTER JOIN
SELECT dept.DEPTNO, ename, dname FROM emp FULL OUTER JOIN dept ON dept.DEPTNO = emp.deptno;

-- CARTESIAN JOIN / CROSS JOIN
SELECT dname, ename FROM emp, DEPT;

SELECT * INTO EMP1 FROM EMP;
SELECT * INTO EMP2 FROM EMP;
SELECT * FROM EMP1;
SELECT * FROM EMP2;

SELECT EMP1.ENAME , EMP2.ENAME FROM EMP1 INNER JOIN EMP2 ON EMP1.MGR = EMP2.EMPNO;
SELECT EMP1.ENAME , EMP2.ENAME FROM EMP1 INNER JOIN EMP2 ON EMP2.MGR = EMP1.EMPNO;
DROP TABLE EMP1;
DROP TABLE EMP2;

-- SELF JOIN
SELECT a.ename,b.ename FROM emp b, emp a WHERE a.mgr = b.empno;