create unique index IX_F4F93BF7 on oep_ssomgt_application (appCode);
create index IX_3DFD5B1F on oep_ssomgt_application (appCode, appPin);
create index IX_8483DE81 on oep_ssomgt_application (companyId);
create index IX_4A7D5749 on oep_ssomgt_application (companyId, groupId);

create index IX_D6000C9A on oep_ssomgt_approle (companyId);
create index IX_F200F550 on oep_ssomgt_approle (companyId, groupId);
create index IX_C22A7D2B on oep_ssomgt_approle (companyId, groupId, applicationId);
create unique index IX_8F08DF05 on oep_ssomgt_approle (roleCode);

create index IX_8EDC744F on oep_usermgt_appmessage (fromApplication, toUser);
create index IX_89CA77E2 on oep_usermgt_appmessage (fromApplication, toUser, messageType);
create index IX_8988207B on oep_usermgt_appmessage (toUser);

create index IX_23FFC5A4 on oep_usermgt_approle2employee (companyId);
create index IX_D42EA841 on oep_usermgt_approle2employee (companyId, employeeId);
create index IX_907FC786 on oep_usermgt_approle2employee (companyId, groupId);
create index IX_B122399C on oep_usermgt_approle2employee (companyId, groupId, appRoleId);
create index IX_9360E723 on oep_usermgt_approle2employee (companyId, groupId, employeeId);
create index IX_A0F0A6A1 on oep_usermgt_approle2employee (employeeId);

create index IX_4BE9957B on oep_usermgt_approle2jobpos (companyId);
create index IX_CADCD98F on oep_usermgt_approle2jobpos (companyId, groupId);
create index IX_D84B7F3 on oep_usermgt_approle2jobpos (companyId, groupId, appRoleId);
create index IX_D2335A15 on oep_usermgt_approle2jobpos (companyId, groupId, jobPosId);
create index IX_C5A71F01 on oep_usermgt_approle2jobpos (companyId, jobPosId);

create index IX_86615F56 on oep_usermgt_usersync (applicationId, checkpoint);
create index IX_9E0ED1F7 on oep_usermgt_usersync (applicationId, employeeId);
create index IX_C3B4AE94 on oep_usermgt_usersync (applicationId, userId);