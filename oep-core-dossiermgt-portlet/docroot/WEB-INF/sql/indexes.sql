create index IX_96AD8465 on oep_dossiermgt_docfile (uuid_);
create index IX_EB083EA3 on oep_dossiermgt_docfile (uuid_, companyId);
create unique index IX_7DC611E5 on oep_dossiermgt_docfile (uuid_, groupId);

create index IX_862FCC3F on oep_dossiermgt_docfileversion (uuid_);
create index IX_686A6A89 on oep_dossiermgt_docfileversion (uuid_, companyId);
create unique index IX_456DFF4B on oep_dossiermgt_docfileversion (uuid_, groupId);

create index IX_EC25829B on oep_dossiermgt_doctemplate (companyId);
create index IX_C3E9B06F on oep_dossiermgt_doctemplate (companyId, groupId);
create index IX_F14A497E on oep_dossiermgt_doctemplate (companyId, groupId, templateNo);
create index IX_12E039AA on oep_dossiermgt_doctemplate (companyId, templateNo);

create index IX_26AB4E2E on oep_dossiermgt_dossier (uuid_);
create index IX_F03DAD3A on oep_dossiermgt_dossier (uuid_, companyId);
create unique index IX_11E43A3C on oep_dossiermgt_dossier (uuid_, groupId);

create index IX_20720D80 on oep_dossiermgt_dossierfolder (uuid_);
create index IX_400086A8 on oep_dossiermgt_dossierfolder (uuid_, companyId);

create index IX_BA92D40C on oep_dossiermgt_dossierproc (companyId);
create index IX_55EC687D on oep_dossiermgt_dossierproc (companyId, active_);
create index IX_ECD9D8FF on oep_dossiermgt_dossierproc (companyId, administrationNo);
create index IX_D108E998 on oep_dossiermgt_dossierproc (companyId, administrationNo, domainNo);
create index IX_A3A13865 on oep_dossiermgt_dossierproc (companyId, domainNo);
create index IX_F1526E1E on oep_dossiermgt_dossierproc (companyId, groupId);
create index IX_86A1D291 on oep_dossiermgt_dossierproc (companyId, groupId, administrationNo);
create index IX_7A5B94AA on oep_dossiermgt_dossierproc (companyId, groupId, administrationNo, domainNo);
create index IX_C33CE3F7 on oep_dossiermgt_dossierproc (companyId, groupId, domainNo);
create index IX_282710B4 on oep_dossiermgt_dossierproc (companyId, groupId, dossierProcNo);
create index IX_70C6C858 on oep_dossiermgt_dossierproc (companyId, groupId, userId);
create unique index IX_DF17C76 on oep_dossiermgt_dossierproc (dossierProcNo);
create index IX_3698ED8E on oep_dossiermgt_dossierproc (groupId);
create index IX_39FDE13B on oep_dossiermgt_dossierproc (groupId, active_);

create index IX_FBEFE8D7 on oep_dossiermgt_paymentfile (uuid_);
create index IX_DA3AFEF1 on oep_dossiermgt_paymentfile (uuid_, companyId);
create unique index IX_5BA88DB3 on oep_dossiermgt_paymentfile (uuid_, groupId);

create index IX_7F98A3BA on oep_dossiermgt_paymentrequest (uuid_);
create index IX_E23FA82E on oep_dossiermgt_paymentrequest (uuid_, companyId);
create unique index IX_6E506230 on oep_dossiermgt_paymentrequest (uuid_, groupId);