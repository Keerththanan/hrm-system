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

INSERT INTO "employee"."user"(
    "id",
    "full_name"
) VALUES (
    1,    
    'user'   
 );

INSERT INTO "employee"."user"(
    "id",
    "full_name"
) VALUES (
    2,    
    'admin'   
 );
 
 INSERT INTO "employee"."user"(
    "id",
    "full_name"
) VALUES (
    3,    
    'guest'   
 );
 
INSERT INTO "leavesystem"."leave_type"(
    "id",
    "created_at",
    "default_allocation",
    "leave_type_value",
    "updated_at"
) VALUES (
    1,
    '2008-10-10 00:00:00',
    14,
    'Annual',
    '2018-10-10 00:00:00'
 );
INSERT INTO "leavesystem"."leave_type"(
    "id",
    "created_at",
    "default_allocation",
    "leave_type_value",
    "updated_at"
) VALUES (
    2,
    '2018-10-10 00:00:00',
    7,
    'Casual',
    '2018-10-10 00:00:00'
 );
 INSERT INTO "leavesystem"."leave_type"(
    "id",
    "created_at",
    "default_allocation",
    "leave_type_value",
    "updated_at"
) VALUES (
    3,
    '2018-10-10 00:00:00',
    14,
    'Medical',
    '2018-10-10 00:00:00'
 );
 
 INSERT INTO "leavesystem"."leave_allocation"(
    "id",
    "allocated_days",
    "utilized_days",
    "leave_type_id",
    "user_id"
) VALUES (
    1,
    14,
    0,
    1,
    1
 );
 INSERT INTO "leavesystem"."leave_allocation"(
    "id",
    "allocated_days",
    "utilized_days",
    "leave_type_id",
    "user_id"
) VALUES (
    2,
    7,
    0,
    2,
    1
 );
INSERT INTO "leavesystem"."leave_allocation"(
    "id",
    "allocated_days",
    "utilized_days",
    "leave_type_id",
    "user_id"
) VALUES (
    3,
    14,
    0,
    3,
    1
 );
 
 INSERT INTO "leavesystem"."leave_allocation"(
    "id",
    "allocated_days",
    "utilized_days",
    "leave_type_id",
    "user_id"
) VALUES (
    4,
    14,
    0,
    1,
    3
 );
 INSERT INTO "leavesystem"."leave_allocation"(
    "id",
    "allocated_days",
    "utilized_days",
    "leave_type_id",
    "user_id"
) VALUES (
    5,
    7,
    0,
    2,
    3
 );
INSERT INTO "leavesystem"."leave_allocation"(
    "id",
    "allocated_days",
    "utilized_days",
    "leave_type_id",
    "user_id"
) VALUES (
    6,
    14,
    0,
    3,
    3
 );
