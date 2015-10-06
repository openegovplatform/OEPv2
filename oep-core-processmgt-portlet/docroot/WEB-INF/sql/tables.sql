create table oep_processmgt_dossierprocess (
	dossierProcessId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgentId VARCHAR(30) null,
	govAgentName VARCHAR(200) null,
	startDossierStepId LONG,
	daysDuration INTEGER
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
	stepType INTEGER,
	doForm VARCHAR(100) null
);

create table oep_processmgt_dossierstep2role (
	dossierStepId LONG not null,
	roleId LONG not null,
	primary key (dossierStepId, roleId)
);

create table oep_processmgt_processorder (
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
	dossierStatus VARCHAR(75) null,
	dossierResume VARCHAR(75) null,
	stepDate DATE null,
	stepNote VARCHAR(75) null,
	assignToUserId LONG,
	currentCondition VARCHAR(75) null,
	endState INTEGER
);

create table oep_processmgt_processorder2user (
	processOrderId LONG not null,
	userId LONG not null,
	primary key (processOrderId, userId)
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
	transitionName VARCHAR(75) null,
	daysDuration INTEGER,
	dossierStatus VARCHAR(75) null,
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