create table oep_dossiermgt_DocFile (
	uuid_ VARCHAR(75) null,
	docFileId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierId LONG,
	dossierDocId LONG,
	docTemplateId LONG,
	docFileVersionId LONG,
	docName VARCHAR(75) null,
	issueDate DATE null,
	note VARCHAR(75) null
);

create table oep_dossiermgt_DocFileVersion (
	uuid_ VARCHAR(75) null,
	docFileVersionId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	docFileId LONG,
	fileEntryId LONG,
	xmlContent VARCHAR(75) null,
	issueDate DATE null
);

create table oep_dossiermgt_DocTemplate (
	docTemplateId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	templateNo VARCHAR(75) null,
	title VARCHAR(75) null,
	enTitle VARCHAR(75) null,
	fileEntryId LONG
);

create table oep_dossiermgt_Dossier (
	uuid_ VARCHAR(75) null,
	dossierId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	dossierProcId LONG,
	govAgentNo VARCHAR(75) null,
	govAgentName VARCHAR(75) null,
	submitterName VARCHAR(75) null,
	actorType INTEGER,
	actorNo VARCHAR(75) null,
	actorName VARCHAR(75) null,
	address VARCHAR(75) null,
	cityNo VARCHAR(75) null,
	cityName VARCHAR(75) null,
	districtNo VARCHAR(75) null,
	districtName VARCHAR(75) null,
	wardNo VARCHAR(75) null,
	wardName VARCHAR(75) null,
	description VARCHAR(75) null,
	note VARCHAR(75) null,
	receptionNo VARCHAR(75) null,
	submissionDate DATE null,
	receptionDate DATE null,
	resubmissionDate DATE null,
	appointmentDate DATE null,
	releaseDate DATE null,
	completionDate DATE null,
	status VARCHAR(75) null,
	statusName VARCHAR(75) null,
	feedbackNote VARCHAR(75) null,
	paymentConfirmed INTEGER
);

create table oep_dossiermgt_DossierDoc (
	dossierDocId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	documentNo VARCHAR(75) null,
	documentName VARCHAR(75) null,
	note VARCHAR(75) null,
	sequenceNo INTEGER,
	documentType INTEGER,
	numberOfFile INTEGER,
	onlineForm VARCHAR(75) null
);

create table oep_dossiermgt_DossierDoc2Template (
	id_ LONG not null primary key,
	companyId LONG,
	dossierDocId LONG,
	docTemplateId LONG,
	sequenceNo INTEGER
);

create table oep_dossiermgt_DossierFolder (
	uuid_ VARCHAR(75) null,
	dossierFolderId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	folderName VARCHAR(75) null,
	parentFolderId LONG,
	sequenceNo INTEGER,
	procedureFilter VARCHAR(75) null,
	statusFilter VARCHAR(75) null,
	filterByOrganization INTEGER,
	filterByUser INTEGER
);

create table oep_dossiermgt_DossierFolder2Role (
	id_ LONG not null primary key,
	companyId LONG,
	dossierFolderId LONG,
	roleId LONG
);

create table oep_dossiermgt_DossierProc (
	dossierProcId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcNo VARCHAR(75) null,
	name VARCHAR(75) null,
	enName VARCHAR(75) null,
	shortName VARCHAR(75) null,
	processDescription VARCHAR(75) null,
	methodDescription VARCHAR(75) null,
	dossierDescription VARCHAR(75) null,
	conditionDescription VARCHAR(75) null,
	durationDescription VARCHAR(75) null,
	actorsDescription VARCHAR(75) null,
	resultsDescription VARCHAR(75) null,
	feeDescription VARCHAR(75) null,
	instructionsDescription VARCHAR(75) null,
	administrationNo VARCHAR(75) null,
	administrationName VARCHAR(75) null,
	domainNo VARCHAR(75) null,
	domainName VARCHAR(75) null,
	effectDate DATE null,
	expireDate DATE null,
	active_ INTEGER
);

create table oep_dossiermgt_DossierProc2Agent (
	id_ LONG not null primary key,
	companyId LONG,
	dossierProcId LONG,
	govAgentNo VARCHAR(75) null,
	govAgentName VARCHAR(75) null
);

create table oep_dossiermgt_PaymentConfig (
	paymentConfigId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgentNo VARCHAR(75) null,
	govAgentName VARCHAR(75) null,
	prePaidFee LONG,
	bankTransfer VARCHAR(75) null,
	keypay VARCHAR(75) null
);

create table oep_dossiermgt_PaymentFile (
	uuid_ VARCHAR(75) null,
	paymentFileId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	amount LONG,
	paymentType INTEGER,
	detailInfo VARCHAR(75) null,
	note VARCHAR(75) null,
	fileEntryId LONG,
	issueDate DATE null,
	checkingDate DATE null,
	checkingUserId LONG,
	checkingUserName VARCHAR(75) null,
	checkingResult INTEGER,
	checkingNote VARCHAR(75) null,
	feedbackDate DATE null
);

create table oep_dossiermgt_PaymentFile2Dossier (
	id_ LONG not null primary key,
	companyId LONG,
	paymentFileId LONG,
	dossierId LONG,
	amount LONG
);

create table oep_dossiermgt_PaymentRequest (
	uuid_ VARCHAR(75) null,
	paymentRequestId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	dossierId LONG,
	amount LONG,
	note VARCHAR(75) null,
	issueDate DATE null,
	paymentFileId LONG
);

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