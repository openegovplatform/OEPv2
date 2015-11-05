create table oep_datamgt_dictattribute (
	dictAttributeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	collectionName VARCHAR(75) null,
	name VARCHAR(75) null,
	title VARCHAR(75) null,
	dataType VARCHAR(75) null
);

create table oep_datamgt_dictcollection (
	dictCollectionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	version VARCHAR(75) null,
	title VARCHAR(75) null,
	validatedFrom DATE null,
	validatedTo DATE null,
	status INTEGER
);

create table oep_datamgt_dictdata (
	dictDataId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	collectionName VARCHAR(75) null,
	dataCode VARCHAR(75) null,
	node_1 VARCHAR(75) null,
	node_2 VARCHAR(75) null,
	node_3 VARCHAR(75) null,
	node_4 VARCHAR(75) null,
	node_5 VARCHAR(75) null,
	dataLevel INTEGER,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
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
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dictDataId LONG,
	attributeName VARCHAR(75) null,
	attributeValue VARCHAR(75) null
);