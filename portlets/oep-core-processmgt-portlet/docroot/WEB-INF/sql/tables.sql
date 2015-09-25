create table oep_processmgt_DossierProcess (
	dossierProcessId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgentNo VARCHAR(75) null,
	govAgentName VARCHAR(75) null,
	startDossierStepId LONG,
	daysDuration INTEGER
);

create table oep_processmgt_DossierStep (
	dossierStepId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcessId LONG,
	title VARCHAR(75) null,
	sequenceNo INTEGER,
	stepType INTEGER
);

create table oep_processmgt_DossierStep2Role (
	id_ LONG not null primary key,
	companyId LONG,
	dossierStepId LONG,
	roleId LONG
);

create table oep_processmgt_ProcessOrder (
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

create table oep_processmgt_ProcessOrder2User (
	id_ LONG not null primary key,
	companyId LONG,
	processOrderId LONG,
	userId LONG
);

create table oep_processmgt_StepTransition (
	stepTransionId LONG not null primary key,
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
	newOrder INTEGER,
	errorMessage VARCHAR(75) null
);

create table oep_processmgt_TransitionHistory (
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

create table oep_processmgt_UserAssignment (
	userAssignmentId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	processOrderId LONG,
	dossierStepId LONG,
	assignToUserId LONG
);