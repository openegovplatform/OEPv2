create table oep_usermgt_business (
	businessId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	masterUserId LONG,
	name VARCHAR(75) null,
	enName VARCHAR(75) null,
	shortName VARCHAR(75) null,
	address VARCHAR(75) null,
	cityNo VARCHAR(75) null,
	cityName VARCHAR(75) null,
	districtNo VARCHAR(75) null,
	districtName VARCHAR(75) null,
	wardNo VARCHAR(75) null,
	wardName VARCHAR(75) null,
	gpsPosition VARCHAR(75) null,
	telNo VARCHAR(75) null,
	fax VARCHAR(75) null,
	email VARCHAR(75) null,
	businessNo VARCHAR(75) null,
	businessType VARCHAR(75) null,
	registerAgent VARCHAR(75) null,
	registerDate DATE null,
	representative VARCHAR(75) null,
	representativeRole VARCHAR(75) null
);

create table oep_usermgt_citizen (
	citizenId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	mappingUserId LONG,
	citizenNo VARCHAR(75) null,
	fullName VARCHAR(75) null,
	gender INTEGER,
	identificationNo VARCHAR(75) null,
	address VARCHAR(75) null,
	cityNo VARCHAR(75) null,
	cityName VARCHAR(75) null,
	districtNo VARCHAR(75) null,
	districtName VARCHAR(75) null,
	wardNo VARCHAR(75) null,
	wardName VARCHAR(75) null,
	homeAddress VARCHAR(75) null,
	homeTel VARCHAR(75) null,
	mobile VARCHAR(75) null,
	email VARCHAR(75) null,
	shortName VARCHAR(75) null
);

create table oep_usermgt_delegacy (
	delegacyId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	fromEmployeeId LONG,
	toEmployeeId LONG,
	roleId LONG
);

create table oep_usermgt_employee (
	employeeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	mappingUserId LONG,
	workingUnitId LONG,
	mainJobPosId LONG,
	employeeNo VARCHAR(75) null,
	fullName VARCHAR(75) null,
	officeTel VARCHAR(75) null,
	homeTel VARCHAR(75) null,
	mobile VARCHAR(75) null,
	email VARCHAR(75) null,
	shortName VARCHAR(75) null,
	personelDocNo VARCHAR(75) null,
	gender INTEGER,
	birthdate DATE null
);

create table oep_usermgt_employee2jobpos (
	employeeId LONG not null,
	jobPosId LONG not null,
	primary key (employeeId, jobPosId)
);

create table oep_usermgt_jobpos (
	jobPosId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	positionCatNo VARCHAR(75) null,
	workingUnitId LONG,
	subWorkingUnitId LONG,
	leader INTEGER
);

create table oep_usermgt_jobpos2role (
	jobPosId LONG not null,
	roleId LONG not null,
	primary key (jobPosId, roleId)
);

create table oep_usermgt_subaccount (
	subAccountId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	businessId LONG,
	mappingUserId LONG,
	fullName VARCHAR(75) null,
	shortName VARCHAR(75) null,
	workingRole VARCHAR(75) null,
	telNo VARCHAR(75) null,
	mobile VARCHAR(75) null,
	email VARCHAR(75) null
);

create table oep_usermgt_workingunit (
	workingUnitId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	govAgencyId VARCHAR(75) null,
	name VARCHAR(75) null,
	enName VARCHAR(75) null,
	parentWorkingUnitId LONG,
	address VARCHAR(75) null,
	cityNo VARCHAR(75) null,
	cityName VARCHAR(75) null,
	districtNo VARCHAR(75) null,
	districtName VARCHAR(75) null,
	wardNo VARCHAR(75) null,
	wardName VARCHAR(75) null,
	gpsPosition VARCHAR(75) null,
	telNo VARCHAR(75) null,
	fax VARCHAR(75) null,
	email VARCHAR(75) null,
	website VARCHAR(75) null,
	aaa VARCHAR(75) null,
	shortName VARCHAR(75) null,
	localSiteId LONG,
	isEmployer INTEGER
);