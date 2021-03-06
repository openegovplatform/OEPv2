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
	docFileName VARCHAR(100) null,
	docFileType LONG,
	verifyStatus INTEGER,
	note VARCHAR(200) null,
	approveBy VARCHAR(100) null,
	approveDate DATE null,
	premier INTEGER
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
	xmlContent TEXT null,
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
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
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
	email VARCHAR(30) null,
	subjectAsContactPerson INTEGER,
	contactPersonName VARCHAR(100) null,
	contactPersonId VARCHAR(30) null,
	contactPersonSex INTEGER,
	contactPersonTel VARCHAR(30) null,
	note VARCHAR(255) null,
	resumeDescription VARCHAR(255) null,
	receptionNo VARCHAR(30) null,
	onegate INTEGER,
	submitDate DATE null,
	receiveDate DATE null,
	processDate DATE null,
	renewDate DATE null,
	estimateDate DATE null,
	finishDate DATE null,
	handoverDate DATE null,
	returnDate DATE null,
	archiveDate DATE null,
	mainStatus VARCHAR(30) null,
	subStatus VARCHAR(30) null,
	statusDate DATE null,
	statusDescription VARCHAR(100) null,
	feedbackNote VARCHAR(255) null,
	daysDelay INTEGER,
	errorStatus VARCHAR(30) null,
	errorCode VARCHAR(30) null,
	pendingStatus INTEGER,
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
	dossierDocType INTEGER,
	numberOfFile INTEGER,
	splitSubDossier INTEGER,
	onlineForm VARCHAR(30) null
);

create table oep_dossiermgt_dossierdoc2template (
	docTemplateId LONG not null,
	dossierDocId LONG not null,
	primary key (docTemplateId, dossierDocId)
);

create table oep_dossiermgt_dossierfolder (
	uuid_ VARCHAR(75) null,
	dossierFolderId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	folderName VARCHAR(100) null,
	parentDossierFolderId LONG,
	sequenceNo INTEGER,
	procedureFilter VARCHAR(100) null,
	statusFilter VARCHAR(100) null,
	tagFilter VARCHAR(100) null,
	filterByOrganization INTEGER,
	filterByUser INTEGER,
	orderBy VARCHAR(100) null,
	counting INTEGER
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
	processDescription TEXT null,
	methodDescription TEXT null,
	dossierDescription TEXT null,
	conditionDescription VARCHAR(500) null,
	durationDescription VARCHAR(255) null,
	actorsDescription VARCHAR(255) null,
	resultsDescription VARCHAR(500) null,
	recordsDescription TEXT null,
	feeDescription VARCHAR(255) null,
	instructionsDescription TEXT null,
	administrationNo VARCHAR(30) null,
	administrationName VARCHAR(200) null,
	domainNo VARCHAR(30) null,
	domainName VARCHAR(200) null,
	forCitizen INTEGER,
	forBusiness INTEGER,
	effectDate DATE null,
	expireDate DATE null,
	statusActive INTEGER
);

create table oep_dossiermgt_dossierprocagent (
	dossierProcAgentId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierProcId LONG,
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
	bankTransfer VARCHAR(500) null,
	keypay VARCHAR(255) null,
	ebPartnerShipId LONG
);

create table oep_dossiermgt_dossierprocbookmark (
	dossierProcBookmarkId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	dossierProcAgentId LONG
);

create table oep_dossiermgt_dossiertag (
	dossierTagId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	dossierId LONG,
	tag VARCHAR(100) null
);

create table oep_dossiermgt_ebmessage (
	ebMessageId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
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
	userId LONG,
	groupId LONG,
	createDate DATE null,
	name VARCHAR(100) null,
	cpaId VARCHAR(100) null,
	service VARCHAR(100) null
);

create table oep_dossiermgt_paymentconfig (
	paymentConfigId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
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
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
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
	govAgencyId VARCHAR(30) null,
	govAgencyName VARCHAR(200) null,
	subjectId VARCHAR(30) null,
	subjectType VARCHAR(30) null,
	subjectName VARCHAR(100) null,
	amount LONG,
	requestNote VARCHAR(200) null,
	paymentFileId LONG,
	confirmOK INTEGER,
	ebMessageId LONG
);

create table oep_dossiermgt_profiledata (
	profileDataId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	fieldName VARCHAR(30) null,
	fieldValue VARCHAR(200) null
);

create table oep_dossiermgt_statisticbyagency (
	statisticByAgencyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	month INTEGER,
	year INTEGER,
	govAgencyId VARCHAR(30) null,
	receiveNumber LONG,
	onlineNumber LONG,
	onlineRatio DOUBLE,
	finishNumber INTEGER,
	ontimeNumber INTEGER,
	ontimeRatio DOUBLE,
	delayDaysAvg DOUBLE
);

create table oep_dossiermgt_statisticbyday (
	statisticByDayId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	statisticDate DATE null,
	statisticWeek INTEGER,
	receiveNumber LONG,
	onlineNumber LONG,
	onlineRatio DOUBLE,
	finishNumber INTEGER,
	ontimeNumber INTEGER,
	ontimeRatio DOUBLE,
	delayDaysAvg DOUBLE
);

create table oep_dossiermgt_statisticbydomain (
	statisticByDomainId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	month INTEGER,
	year INTEGER,
	dossierDomain VARCHAR(30) null,
	receiveNumber LONG,
	onlineNumber LONG,
	onlineRatio DOUBLE,
	finishNumber INTEGER,
	ontimeNumber INTEGER,
	ontimeRatio DOUBLE,
	delayDaysAvg DOUBLE
);