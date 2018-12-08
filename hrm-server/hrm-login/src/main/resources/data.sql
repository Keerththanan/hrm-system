INSERT INTO login.role(rolename) VALUES('ADMIN');
INSERT INTO login.role(rolename) VALUES('DIRECTOR');
INSERT INTO login.role(rolename) VALUES('HR_MANAGER');
INSERT INTO login.role(rolename) VALUES('MANAGER');
INSERT INTO login.role(rolename) VALUES('ACCOUNTANT');
INSERT INTO login.role(rolename) VALUES('HR');
INSERT INTO login.role(rolename) VALUES('EMPLOYEE');
INSERT INTO login.role(rolename) VALUES('TRAINEE');
INSERT INTO login.role(rolename) VALUES('TRAINER');

--authorize type--
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Create');
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Read');
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Update');
INSERT INTO employee.authorize_type(authorize_type_name) VALUES('Delete');

--module--
INSERT INTO employee.module(module_name) VALUES('Leave System');
INSERT INTO employee.module(module_name) VALUES('Self Service');

--privilege--
--1st module--
--admin--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,1);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,1);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,1);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,1);
--director--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,2);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,2);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,2);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,2);
--hr manager--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,3);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,3);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,3);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,3);
--manager--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,4);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,4);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,4);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,4);
--accountant--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,5);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,5);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,5);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,5);
--hr--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,6);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,6);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,6);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,6);
--employee--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,7);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,7);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,7);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,7);
--trainee--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,8);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,8);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,8);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,8);
--trainer--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,1,9);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,1,9);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,1,9);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,1,9);

--2nd module--
--admin--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,1);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,1);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,1);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,1);
--director--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,2);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,2);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,2);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,2);
--hr manager--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,3);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,3);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,3);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,3);
--manager--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,4);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,4);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,4);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,4);
--accountant--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,5);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,5);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,5);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,5);
--hr--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,6);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,6);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,6);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,6);
--employee--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,7);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,7);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,7);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,7);
--trainee--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,8);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,8);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,8);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,8);
--trainer--
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,1,2,9);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(false,2,2,9);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,3,2,9);
INSERT INTO employee.privilege(is_enabled, authorize_type_id, module_id, role_id) VALUES(true,4,2,9);


--permission--
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(1,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(2,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(3,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(4,1);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(1,2);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(2,2);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(3,2);
--INSERT INTO employee.permission(authorize_type_id, module_id) VALUES(4,2);