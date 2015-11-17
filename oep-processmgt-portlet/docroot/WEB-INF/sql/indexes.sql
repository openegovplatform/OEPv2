create index IX_F2CFCF6F on oep_processmgt_dossierprocess (companyId);
create index IX_B6E6921B on oep_processmgt_dossierprocess (companyId, groupId);

create index IX_1CC8365C on oep_processmgt_dossierstep2role (dossierStepId);
create index IX_8820E62B on oep_processmgt_dossierstep2role (roleId);

create index IX_2F064A20 on oep_processmgt_processorder (uuid_);
create index IX_7EB62608 on oep_processmgt_processorder (uuid_, companyId);
create unique index IX_BE208E8A on oep_processmgt_processorder (uuid_, groupId);

create index IX_F123FB83 on oep_processmgt_processorder2user (processOrderId);
create index IX_FF3E322F on oep_processmgt_processorder2user (userId);