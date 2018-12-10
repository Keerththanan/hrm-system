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

--resizable--
INSERT INTO leavesystem.resizable VALUES (1, true, true);
INSERT INTO leavesystem.resizable VALUES (2, true, false);
INSERT INTO leavesystem.resizable VALUES (3, false, true);
INSERT INTO leavesystem.resizable VALUES (4, false, false);

--leave-type--
INSERT INTO leavesystem.leave_type VALUES (1, '2008-10-10 00:00:00', 14, 'Annual', '2018-10-10 00:00:00');
INSERT INTO leavesystem.leave_type VALUES (2, '2018-10-10 00:00:00', 7, 'Casual', '2018-10-10 00:00:00');
INSERT INTO leavesystem.leave_type VALUES (3, '2018-10-10 00:00:00', 14, 'Medical', '2018-10-10 00:00:00');

INSERT INTO employee.department(department_name) VALUES('HR');
INSERT INTO employee.department(department_name) VALUES('Manager');
INSERT INTO employee.department(department_name) VALUES('QA');
INSERT INTO employee.department(department_name) VALUES('Development');
INSERT INTO employee.department(department_name) VALUES('Account');

--user--
INSERT INTO employee."user" VALUES (1, '1988-08-12 00:00:00', 'sinthu@gmail.com', 'sinthuja', 'female', '2018-07-07 00:00:00', 'single', '0766548594', 'Srilankan', '884561237V', 'Manipay Jaffna', NULL, 'Hindu', 'Manipay Jaffna', 1, '0214567893', '2018-08-10 00:00:00', 1, 6);
INSERT INTO employee."user" VALUES (2, '1986-04-21 00:00:00', 'betsy@gmail.com', 'betsy', 'female', '2018-07-08 00:00:00', 'married', '0777526389', 'Srilankan', '864521472V', 'Pandatharippu Jaffna', NULL, 'Christian', 'Pandatharippu Jaffna', 1, '02177775421', '2018-08-10 00:00:00', 2, 1);
INSERT INTO employee."user" VALUES (3, '1991-02-25 00:00:00', 'paki@gmail.com', 'Pakikaran', 'male', '2018-08-20 00:00:00', 'single', '0775458526', 'Srilankan', '911251257V', 'Manipay Jaffna', NULL, 'Hindu', 'Manipay Jaffna', 1, '02145562574', '2018-08-10 00:00:00', 4, 7);
INSERT INTO employee."user" VALUES (4, '1990-04-25 00:00:00', 'dilshi@gmail.com', 'dilshanth', 'male', '2018-08-20 00:00:00', 'single', '0711125525', 'Srilankan', '901542548V', 'Kantharmadam Jaffna', NULL, 'Hindu', 'Kantharmadam Jaffna', 1, '02145645612', '2018-08-10 00:00:00', 4, 7);

--leave-allocation--
INSERT INTO leavesystem.leave_allocation VALUES (7, 14, 0, 1, 2);
INSERT INTO leavesystem.leave_allocation VALUES (8, 7, 0, 2, 2);
INSERT INTO leavesystem.leave_allocation VALUES (9, 14, 0, 3, 2);
INSERT INTO leavesystem.leave_allocation VALUES (2, 7, 0, 2, 1);
INSERT INTO leavesystem.leave_allocation VALUES (4, 14, 0, 1, 3);
INSERT INTO leavesystem.leave_allocation VALUES (5, 7, 0, 2, 3);
INSERT INTO leavesystem.leave_allocation VALUES (3, 14, 0, 3, 1);
INSERT INTO leavesystem.leave_allocation VALUES (1, 14, 0, 1, 1);
INSERT INTO leavesystem.leave_allocation VALUES (6, 14, 0, 3, 3);
INSERT INTO leavesystem.leave_allocation VALUES (10, 14, 0, 1, 4);
INSERT INTO leavesystem.leave_allocation VALUES (11, 7, 0, 2, 4);
INSERT INTO leavesystem.leave_allocation VALUES (12, 14, 0, 3, 4);

--authorize type--
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Create');
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Read');
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Update');
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Delete');

--module--
--INSERT INTO employee.module(module_name) VALUES('Leave System');
--INSERT INTO employee.module(module_name) VALUES('Self Service');

--Leave Requests
--Approve or Cancel Leave
--Leave History
--Request Leave
--Leave Post Event Calendar

----privilege--
----1st module--
----admin--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,1);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,1);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,1);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,1);
----director--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,2);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,2);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,2);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,2);
----hr manager--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,3);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,3);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,3);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,3);
----manager--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,4);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,4);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,4);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,4);
----accountant--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,5);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,5);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,5);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,5);
----hr--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,6);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,6);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,6);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,6);
----employee--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,7);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,7);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,7);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,7);
----trainee--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,8);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,8);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,8);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,8);
----trainer--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,9);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,9);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,9);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,9);
--
----2nd module--
----admin--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,1);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,1);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,1);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,1);
----director--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,2);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,2);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,2);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,2);
----hr manager--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,3);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,3);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,3);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,3);
----manager--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,4);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,4);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,4);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,4);
----accountant--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,5);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,5);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,5);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,5);
----hr--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,6);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,6);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,6);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,6);
----employee--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,7);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,7);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,7);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,7);
----trainee--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,8);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,8);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,8);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,8);
----trainer--
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,9);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,9);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,9);
--INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,9);


--permission--
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(1,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(2,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(3,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(4,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(1,2);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(2,2);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(3,2);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(4,2);
