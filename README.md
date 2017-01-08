# Hello-Polpo
AngularJS-ui-grid + Spring MVC + Spring IoC + Spring JdbcDaoSupport + MariaDB 10.1
### TABLE SCHEMA
CREATE TABLE `opensource` (
	`framework` VARCHAR(128) NULL DEFAULT NULL,
	`language` VARCHAR(128) NULL DEFAULT NULL,
	`description` VARCHAR(512) NULL DEFAULT NULL
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
### INSERT DATA
INSERT INTO `opensource` (`framework`, `language`, `description`) VALUES
	('Maven', 'Java', 'for building, packaging, auto-adding references'),
	('Git', 'C, Shell, Perl, Tcl and Python', 'a distributed version control system'),
	('Spring MVC', 'Java', 'a MVC framework\r\n'),
	('Spring IoC', 'Java', 'a DI Container'),
	('Spring JdbcTemplate', 'Java', 'a Wrapped Class for JDBC'),
	('Servlet API 3.1', 'Java', 'for deploying static resources(js, css, images...)\r\n'),
	('AngularJS', 'Javascript\r\n', 'a Model-View-Whatever javascript framework'),
	('ui-grid', 'Javascript', 'a AngularJS based powerful grid ui'),
	('jQuery', 'Javascript', 'a javascript library'),
	('MariaDB', 'C, C++, Perl, Bash', 'a MySQL-equivalent database'),
	('Spark', 'Java', 'a distributed computing platform'),
	('Cassandra', 'Java', 'a distributed NoSQL');
### Run examples 1
Context-Root/hello
### Run examples 2
Context-Root/hello/someone
### Run examples 3
Context-Root/hello-ui-grid
# Using THyM to create HelloCordova
1. Install NodeJS
2. Using NodeJS to install Cordova
3. Install Android SDK & system image
4. Set up VT(Virtualization Technology option in BIOS)
5. Create an AVD
6. Install THyM
7. Set environment path for Android SDK
8. Finish