--roles--
INSERT INTO login.role(rolename) VALUES('ADMIN');
INSERT INTO login.role(rolename) VALUES('DIRECTOR');
INSERT INTO login.role(rolename) VALUES('HR_MANAGER');
INSERT INTO login.role(rolename) VALUES('MANAGER');
INSERT INTO login.role(rolename) VALUES('ACCOUNTANT');
INSERT INTO login.role(rolename) VALUES('HR');
INSERT INTO login.role(rolename) VALUES('EMPLOYEE');
INSERT INTO login.role(rolename) VALUES('TRAINEE');
INSERT INTO login.role(rolename) VALUES('TRAINER');


--colors--
INSERT INTO leavesystem.colors VALUES (1, 'red', '#ad2121', '#FAE3E3');
INSERT INTO leavesystem.colors VALUES (2, 'blue', '#1e90ff', '#D1E8FF');
INSERT INTO leavesystem.colors VALUES (3, 'yellow', '#e3bc08', '#FDF1BA');

--leave-type--
INSERT INTO leavesystem.leave_type VALUES (1, '2008-10-10 00:00:00', 14, 'Annual', '2018-10-10 00:00:00');
INSERT INTO leavesystem.leave_type VALUES (2, '2018-10-10 00:00:00', 7, 'Casual', '2018-10-10 00:00:00');
INSERT INTO leavesystem.leave_type VALUES (3, '2018-10-10 00:00:00', 14, 'Medical', '2018-10-10 00:00:00');

--user--
INSERT INTO employee."user" VALUES (1, NULL, NULL, 'user', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO employee."user" VALUES (2, NULL, NULL, 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO employee."user" VALUES (3, NULL, NULL, 'hr', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
 
--leave-allocation--

INSERT INTO leavesystem.leave_allocation VALUES (7, 14, 0, 1, 2);
INSERT INTO leavesystem.leave_allocation VALUES (8, 7, 0, 2, 2);
INSERT INTO leavesystem.leave_allocation VALUES (9, 14, 0, 3, 2);
INSERT INTO leavesystem.leave_allocation VALUES (2, 7, 2, 2, 1);
INSERT INTO leavesystem.leave_allocation VALUES (4, 14, 1, 1, 3);
INSERT INTO leavesystem.leave_allocation VALUES (5, 7, 0, 2, 3);
INSERT INTO leavesystem.leave_allocation VALUES (3, 14, 0, 3, 1);
INSERT INTO leavesystem.leave_allocation VALUES (1, 14, 0, 1, 1);
INSERT INTO leavesystem.leave_allocation VALUES (6, 14, 3, 3, 3);

--resizable--

INSERT INTO leavesystem.resizable VALUES (1, true, true);
INSERT INTO leavesystem.resizable VALUES (2, true, false);
INSERT INTO leavesystem.resizable VALUES (3, false, true);
INSERT INTO leavesystem.resizable VALUES (4, false, false);