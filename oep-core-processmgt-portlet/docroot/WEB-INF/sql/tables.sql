create table oep_processmgt_createfile (
	createFileId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	processOrderId LONG,
	dossierStepId LONG,
	stepDate DATE null,
	docFileId LONG
);

create table oep_processmgt_docfile2processorder (
	docFileId LONG not null primary key,
	processOrderId LONG
);

create table oep_processmgt_dossierproc2process (
	dossierProc2ProcessId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
	dossierProcessId LONG,
	aaaa VARCHAR(4) null,
	bbb VARCHAR(3) null,
	daysDuration INTEGER,
	paymentFee INTEGER,
	paymentOneGate INTEGER,
	paymentEservice INTEGER,
	organizationId LONG,
	ebPartnershipId LONG
);

create table oep_processmgt_dossierproc2role (
	dossierProc2RoleId LONG not null primary key,
	dossierProcId LONG,
	roleId LONG
);

create table oep_processmgt_dossierprocess (
	dossierProcessId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table oep_processmgt_dossierstep (
	dossierStepId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcessId LONG,
	title VARCHAR(100) null,
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
	orderStatus VARCHAR(30) null,
	orderResume VARCHAR(200) null,
	stepDate DATE null,
	stepNote VARCHAR(200) null,
	assignToUserId LONG,
	currentCondition VARCHAR(30) null,
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
	totalNumber INTEGER,
	ontimeNumber INTEGER,
	ontimeRatio DOUBLE,
	delayDaysAvg DOUBLE
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
	autoCondition VARCHAR(30) null,
	transitionName VARCHAR(100) null,
	dossierStatus VARCHAR(30) null,
	sendResults INTEGER,
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
	preDossierStatus VARCHAR(30) null,
	postDossierStatus VARCHAR(30) null,
	stepTransitionId LONG,
	preDossierStepId LONG,
	postDossierStepId LONG,
	transitionName VARCHAR(100) null,
	note VARCHAR(200) null,
	assignToUserId LONG
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