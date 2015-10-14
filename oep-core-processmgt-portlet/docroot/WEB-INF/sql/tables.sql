create table oep_processmgt_dossierprocess (
	dossierProcessId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
	startStepTransitionId LONG,
	daysDuration INTEGER,
	fee INTEGER
);

create table oep_processmgt_dossierstep (
	dossierStepId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcessId LONG,
	title VARCHAR(75) null,
	sequenceNo INTEGER,
	daysDuration INTEGER,
	doForm VARCHAR(100) null,
	formLabel VARCHAR(100) null,
	rollback INTEGER
);

create table oep_processmgt_dossierstep2role (
	dossierStepId LONG not null,
	roleId LONG not null,
	primary key (dossierStepId, roleId)
);

create table oep_processmgt_processorder (
	uuid_ VARCHAR(75) null,
	processOrderId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	parentProcessOrderId LONG,
	dossierId LONG,
	dossierProcessId LONG,
	dossierStepId LONG,
	orderStatus VARCHAR(75) null,
	orderResume VARCHAR(75) null,
	stepDate DATE null,
	stepNote VARCHAR(75) null,
	assignToUserId LONG,
	currentCondition VARCHAR(75) null,
	lastStepTransitionId LONG,
	stopRollback INTEGER,
	ebPartnerShipId LONG
);

create table oep_processmgt_processorder2user (
	processOrderId LONG not null,
	userId LONG not null,
	primary key (processOrderId, userId)
);

create table oep_processmgt_statisticbyuser (
	statisticByUserId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	month INTEGER,
	year INTEGER,
	dossierStatus VARCHAR(75) null,
	totalNumber INTEGER,
	delayedNumber INTEGER,
	ontimeNumber INTEGER,
	ontimeRatio DOUBLE,
	delayDaysAvg DOUBLE,
	furtherDaysAvg DOUBLE
);

create table oep_processmgt_steptransition (
	stepTransitionId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcessId LONG,
	preDossierStepId LONG,
	postDossierStepId LONG,
	precondition VARCHAR(75) null,
	autoCondition VARCHAR(30) null,
	transitionName VARCHAR(100) null,
	dossierStatus VARCHAR(75) null,
	notifyStatus INTEGER,
	sendResults INTEGER,
	requestPayment INTEGER,
	userAssignment INTEGER,
	newProcessOrder INTEGER
);

create table oep_processmgt_transitionhistory (
	transitionHistoryId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	dossierId LONG,
	processOrderId LONG,
	daysDoing INTEGER,
	daysDelay INTEGER,
	startDate DATE null,
	preDossierStatus VARCHAR(75) null,
	postDossierStatus VARCHAR(75) null,
	stepTransitionId LONG,
	preDossierStepId LONG,
	postDossierStepId LONG,
	transitionName VARCHAR(75) null,
	note VARCHAR(75) null
);

create table oep_processmgt_userassignment (
	userAssignmentId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	processOrderId LONG,
	dossierStepId LONG,
	assignToUserId LONG
);