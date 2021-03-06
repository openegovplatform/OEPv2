create table oep_ssomgt_application (
	applicationId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	appCode VARCHAR(30) null,
	appName VARCHAR(100) null,
	appPin VARCHAR(30) null,
	appUrl VARCHAR(100) null,
	appBigIcon BLOB,
	appSmallIcon BLOB,
	pingTime DATE null,
	sequenceNo INTEGER,
	publicKey VARCHAR(256) null
);

create table oep_ssomgt_approle (
	appRoleId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	applicationId LONG,
	roleCode VARCHAR(30) null,
	roleName VARCHAR(100) null
);

create table oep_usermgt_appmessage (
	appMessageId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	fromApplication VARCHAR(30) null,
	toUser VARCHAR(30) null,
	messageType VARCHAR(30) null,
	messageCode VARCHAR(30) null,
	messageText VARCHAR(200) null,
	messageValue VARCHAR(200) null,
	messageUrl VARCHAR(200) null,
	visitDate DATE null
);

create table oep_usermgt_approle2employee (
	appRole2EmployeeId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	appRoleId LONG,
	employeeId LONG
);

create table oep_usermgt_approle2jobpos (
	appRole2JobPosId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	appRoleId LONG,
	jobPosId LONG
);

create table oep_usermgt_usersync (
	userSyncId LONG not null primary key,
	applicationId LONG,
	employeeId LONG,
	userId LONG,
	ssoUserName VARCHAR(30) null,
	appUserName VARCHAR(30) null,
	fullName VARCHAR(80) null,
	email VARCHAR(30) null,
	password_ VARCHAR(200) null,
	accessibleStatus INTEGER,
	roles VARCHAR(200) null,
	checkpoint DATE null,
	syncTime DATE null
);