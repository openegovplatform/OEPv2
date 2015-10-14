create table oep_datamgt_defaultparameter (
	defaultParameterId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	applicationName VARCHAR(75) null,
	parameterName VARCHAR(75) null,
	title VARCHAR(75) null,
	parameterValue VARCHAR(75) null,
	changeable INTEGER
);

create table oep_datamgt_dictattribute (
	dictAttributeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	collectionName VARCHAR(30) null,
	name VARCHAR(30) null,
	title VARCHAR(255) null,
	dataType VARCHAR(80) null
);

create table oep_datamgt_dictcollection (
	dictCollectionId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(30) null,
	version VARCHAR(30) null,
	title VARCHAR(255) null,
	validatedFrom DATE null,
	validatedTo DATE null,
	status INTEGER
);

create table oep_datamgt_dictdata (
	dictDataId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	collectionName VARCHAR(30) null,
	dataCode VARCHAR(30) null,
	node_1 VARCHAR(30) null,
	node_2 VARCHAR(30) null,
	node_3 VARCHAR(30) null,
	node_4 VARCHAR(30) null,
	node_5 VARCHAR(30) null,
	dataLevel INTEGER,
	title VARCHAR(255) null,
	description VARCHAR(500) null,
	validatedFrom DATE null,
	validatedTo DATE null,
	status INTEGER
);

create table oep_datamgt_dictdata2collection (
	dictCollectionId LONG not null,
	dictDataId LONG not null,
	primary key (dictCollectionId, dictDataId)
);

create table oep_datamgt_dictmetadata (
	dictMetaDataId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dictDataId LONG,
	attributeName VARCHAR(30) null,
	attributeValue VARCHAR(500) null
);

create table oep_datamgt_userparameter (
	userParameterId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	applicationName VARCHAR(75) null,
	parameterName VARCHAR(75) null,
	title VARCHAR(75) null,
	parameterValue VARCHAR(75) null
);