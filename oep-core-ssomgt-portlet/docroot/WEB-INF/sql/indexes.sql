create index IX_F4F93BF7 on oep_ssomgt_application (appCode);
create index IX_3DFD5B1F on oep_ssomgt_application (appCode, appPin);
create index IX_8483DE81 on oep_ssomgt_application (companyId);
create index IX_4A7D5749 on oep_ssomgt_application (companyId, groupId);

create index IX_72617B75 on oep_ssomgt_appmessage (fromApplication, toUser);
create index IX_DFF21095 on oep_ssomgt_appmessage (toUser);

create index IX_D6000C9A on oep_ssomgt_approle (companyId);
create index IX_F200F550 on oep_ssomgt_approle (companyId, groupId);
create index IX_C22A7D2B on oep_ssomgt_approle (companyId, groupId, applicationId);

create index IX_9D3952CA on oep_ssomgt_approle2employee (companyId);
create index IX_1D9BA520 on oep_ssomgt_approle2employee (companyId, groupId);
create index IX_71C7B7C2 on oep_ssomgt_approle2employee (companyId, groupId, appRoleId);

create index IX_44503421 on oep_ssomgt_approle2jobpos (companyId);
create index IX_A0A755A9 on oep_ssomgt_approle2jobpos (companyId, groupId);
create index IX_699F8799 on oep_ssomgt_approle2jobpos (companyId, groupId, appRoleId);