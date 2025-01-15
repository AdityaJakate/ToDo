# ToDo
Backend for Todo list in Spring boot 


## Installation
Java Version :17.0.13
Spring Boot version :3.4.1
Apache Maven 3.6.3

Database 
mysql  Ver 8.0.40-0ubuntu0.22.04.1 for Linux on x86_64 ((Ubuntu))
Database: Assignment
Tables :
| todo  | CREATE TABLE `todo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) DEFAULT NULL,
  `task` varchar(255) NOT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci |



## Usage

clone repo
cd in assignment folder
run folloeing command
./mvnw spring-boot:run




## Contributer
AdityaJakate
DivyaChoudhari
