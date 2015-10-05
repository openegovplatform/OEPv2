create table oep_dossiermgt_docfile (
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
	docName VARCHAR(200) null,
	note VARCHAR(200) null
);

create table oep_dossiermgt_docfileversion (
	uuid_ VARCHAR(75) null,
	docFileVersionId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	docFileId LONG,
	fileEntryId LONG,
	xmlContent VARCHAR(75) null,
	ebMessageId LONG
);

create table oep_dossiermgt_doctemplate (
	docTemplateId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	templateNo VARCHAR(30) null,
	title VARCHAR(255) null,
	enTitle VARCHAR(255) null,
	fileEntryId LONG
);

create table oep_dossiermgt_dossier (
	uuid_ VARCHAR(75) null,
	dossierId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	dossierProcId LONG,
	govAgentId VARCHAR(30) null,
	govAgentName VARCHAR(200) null,
	subjectId VARCHAR(30) null,
	subjectType VARCHAR(30) null,
	subjectName VARCHAR(100) null,
	address VARCHAR(255) null,
	cityNo VARCHAR(30) null,
	cityName VARCHAR(100) null,
	districtNo VARCHAR(30) null,
	districtName VARCHAR(100) null,
	wardNo VARCHAR(30) null,
	wardName VARCHAR(100) null,
	telNo VARCHAR(30) null,
	contactPersonName VARCHAR(100) null,
	contactPersonTel VARCHAR(30) null,
	note VARCHAR(255) null,
	resumeDescription VARCHAR(255) null,
	receptionNo VARCHAR(30) null,
	submissionDate DATE null,
	receptionDate DATE null,
	resubmissionDate DATE null,
	appointmentDate DATE null,
	releaseDate DATE null,
	completionDate DATE null,
	status VARCHAR(30) null,
	statusDescription VARCHAR(100) null,
	feedbackNote VARCHAR(255) null,
	dirty INTEGER
);

create table oep_dossiermgt_dossierdoc (
	dossierDocId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	dossierDocNo VARCHAR(30) null,
	dossierDocName VARCHAR(100) null,
	note VARCHAR(255) null,
	sequenceNo INTEGER,
	defaultDocTemplateId LONG,
	validationType INTEGER,
	numberOfFile INTEGER,
	onlineForm VARCHAR(30) null
);

create table oep_dossiermgt_dossierdoc2template (
	dossierDocId LONG not null,
	docTemplateId LONG not null,
	primary key (dossierDocId, docTemplateId)
);

create table oep_dossiermgt_dossierfolder (
	uuid_ VARCHAR(75) null,
	dossierFolderId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	folderName VARCHAR(100) null,
	parentDossierFolderId LONG,
	sequenceNo INTEGER,
	procedureFilter VARCHAR(100) null,
	statusFilter VARCHAR(100) null,
	filterByOrganization INTEGER,
	filterByUser INTEGER
);

create table oep_dossiermgt_dossierfolder2role (
	dossierFolderId LONG not null,
	roleId LONG not null,
	primary key (dossierFolderId, roleId)
);

create table oep_dossiermgt_dossierproc (
	dossierProcId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcNo VARCHAR(30) null,
	name VARCHAR(200) null,
	enName VARCHAR(200) null,
	shortName VARCHAR(100) null,
	processDescription VARCHAR(75) null,
	methodDescription VARCHAR(75) null,
	dossierDescription VARCHAR(75) null,
	conditionDescription VARCHAR(500) null,
	durationDescription VARCHAR(255) null,
	actorsDescription VARCHAR(255) null,
	resultsDescription VARCHAR(500) null,
	recordsDescription VARCHAR(75) null,
	feeDescription VARCHAR(255) null,
	instructionsDescription VARCHAR(75) null,
	administrationNo VARCHAR(30) null,
	administrationName VARCHAR(200) null,
	domainNo VARCHAR(30) null,
	domainName VARCHAR(200) null,
	effectDate DATE null,
	expireDate DATE null,
	active_ INTEGER
);

create table oep_dossiermgt_dossierprocagent (
	dossierProcAgentId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgentId VARCHAR(30) null,
	govAgentName VARCHAR(200) null,
	ebPartnerShipId LONG
);

create table oep_dossiermgt_ebmessage (
	ebMessageId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	messageId VARCHAR(100) null,
	cpaId VARCHAR(100) null,
	service VARCHAR(100) null,
	action VARCHAR(100) null,
	conversationId VARCHAR(100) null,
	fromPartyId VARCHAR(100) null,
	fromPartyType VARCHAR(100) null,
	toPartyId VARCHAR(100) null,
	toPartyType VARCHAR(100) null,
	refToMessageId VARCHAR(100) null,
	status VARCHAR(100) null,
	statusDescription VARCHAR(100) null,
	ackMessageId VARCHAR(100) null,
	ackStatus VARCHAR(100) null,
	ackStatusDescription VARCHAR(100) null,
	messageDescription VARCHAR(200) null,
	inbound INTEGER
);

create table oep_dossiermgt_ebpartnership (
	ebPartnerShipId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	name VARCHAR(100) null,
	cpaId VARCHAR(100) null,
	service VARCHAR(100) null,
	action VARCHAR(100) null,
	inbound INTEGER
);

create table oep_dossiermgt_paymentconfig (
	paymentConfigId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	govAgentId VARCHAR(30) null,
	govAgentName VARCHAR(200) null,
	bankTransfer VARCHAR(500) null,
	keypay VARCHAR(255) null,
	ebPartnerShipId LONG
);

create table oep_dossiermgt_paymentfile (
	uuid_ VARCHAR(75) null,
	paymentFileId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	govAgentId VARCHAR(30) null,
	govAgentName VARCHAR(200) null,
	subjectId VARCHAR(30) null,
	subjectType VARCHAR(30) null,
	subjectName VARCHAR(100) null,
	amount LONG,
	paymentType VARCHAR(100) null,
	paymentDescription VARCHAR(200) null,
	transactionInfo VARCHAR(200) null,
	fileEntryId LONG,
	checkingDate DATE null,
	checkingUserId LONG,
	checkingUserName VARCHAR(100) null,
	checkingResult INTEGER,
	checkingNote VARCHAR(200) null,
	ebMessageId LONG
);

create table oep_dossiermgt_paymentrequest (
	uuid_ VARCHAR(75) null,
	paymentRequestId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	dossierId LONG,
	govAgentId VARCHAR(30) null,
	govAgentName VARCHAR(200) null,
	subjectId VARCHAR(30) null,
	subjectType VARCHAR(30) null,
	subjectName VARCHAR(100) null,
	amount LONG,
	requestNote VARCHAR(200) null,
	paymentFileId LONG,
	confirmOK INTEGER,
	ebMessageId LONG
);