create index IX_9410F865 on oep_dossiermgt_DocFile (uuid_);
create index IX_40B44AA3 on oep_dossiermgt_DocFile (uuid_, companyId);
create unique index IX_27051DE5 on oep_dossiermgt_DocFile (uuid_, groupId);

create index IX_19861C5F on oep_dossiermgt_DocFileVersion (uuid_);
create index IX_FD36C669 on oep_dossiermgt_DocFileVersion (uuid_, companyId);
create unique index IX_8F5FD32B on oep_dossiermgt_DocFileVersion (uuid_, groupId);

create index IX_F46F924E on oep_dossiermgt_Dossier (uuid_);
create index IX_C61B951A on oep_dossiermgt_Dossier (uuid_, companyId);
create unique index IX_8BDA9A1C on oep_dossiermgt_Dossier (uuid_, groupId);

create index IX_144D7180 on oep_dossiermgt_DossierFolder (uuid_);
create index IX_49DEA2A8 on oep_dossiermgt_DossierFolder (uuid_, companyId);

create index IX_37544CD7 on oep_dossiermgt_PaymentFile (uuid_);
create index IX_BCF01AF1 on oep_dossiermgt_PaymentFile (uuid_, companyId);
create unique index IX_60F4A9B3 on oep_dossiermgt_PaymentFile (uuid_, groupId);

create index IX_729BFBA on oep_dossiermgt_PaymentRequest (uuid_);
create index IX_14250C2E on oep_dossiermgt_PaymentRequest (uuid_, companyId);
create unique index IX_E23EC630 on oep_dossiermgt_PaymentRequest (uuid_, groupId);