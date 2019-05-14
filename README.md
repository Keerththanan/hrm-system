# Human Resource Management System
## HRM-SYSTEM for SGIC

#### Requirement
     Postgre SQL, Eclipse, Valentina and Postman 

1. First create a _database_ named **_hrm_system_**.
2. Then create _schemas_ for all apps, named **employee, par, trainee, trainer and login**.
3. First run the login app and then run other apps.
4. Register users (_using postman_) with this _URL_ **http://localhost:8010/api/auth/signup** using one of these **role**.
     - ADMIN
     - DIRECTOR
     - HR_MANAGER
     - MANAGER
     - ACCOUNTANT
     - HR
     - EMPLOYEE
     - TRAINEE
     - TRAINER :+1:
     and use this json format
        - **{
            "user_id": 1,
            "username": "natsu",
            "email": "natsu@gmail.com",
            "role": ["employee"],
            "password": "123456"
            }** 
5. Then use this link **http://localhost:8010/api/auth/signin** to signin, use this json format
     - **{
       "username": "natsu",
       "password": "123456"
       }**

**After the first success run, Do not forget to change the value of** _spring.jpa.hibernate.ddl-auto=create_ **to** _spring.jpa.hibernate.ddl-auto=update_
