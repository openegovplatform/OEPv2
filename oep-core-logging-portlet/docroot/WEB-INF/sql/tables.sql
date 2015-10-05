create table oep_logging_newuserlog (
	id LONG not null primary key,
	useractivityid LONG,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	userName VARCHAR(100) null,
	email VARCHAR(100) null,
	site VARCHAR(200) null,
	page VARCHAR(200) null,
	action VARCHAR(30) null,
	description VARCHAR(1000) null
);

create table oep_logging_useractivity (
	id LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	userName VARCHAR(100) null,
	email VARCHAR(100) null,
	site VARCHAR(200) null,
	page VARCHAR(200) null,
	action VARCHAR(30) null,
	description VARCHAR(1000) null,
	url VARCHAR(500) null,
	sessionId VARCHAR(100) null,
	ip VARCHAR(30) null,
	userAgent VARCHAR(1000) null
);