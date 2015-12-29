create index IX_B35A6C5B on oep_usermgt_business (cityNo);
create index IX_5FDF267E on oep_usermgt_business (districtNo);
create index IX_7452C257 on oep_usermgt_business (masterUserId);
create index IX_81D23FFD on oep_usermgt_business (organizationId);
create index IX_43E45697 on oep_usermgt_business (registerAgent);
create index IX_252E74EC on oep_usermgt_business (wardNo);

create index IX_4C8A73B9 on oep_usermgt_citizen (cityNo);
create index IX_48E04EDC on oep_usermgt_citizen (districtNo);
create index IX_A66B257C on oep_usermgt_citizen (identificationNo);
create index IX_BCE69B8B on oep_usermgt_citizen (mappingUserId);
create index IX_BE5E7C4A on oep_usermgt_citizen (wardNo);

create index IX_1E15BE0C on oep_usermgt_delegacy (fromEmployeeId);
create index IX_8B1F511D on oep_usermgt_delegacy (toEmployeeId);
create index IX_98BA8382 on oep_usermgt_delegacy (toEmployeeId, roleId);

create index IX_46A0DB7B on oep_usermgt_employee (mappingUserId);
create index IX_D8524417 on oep_usermgt_employee (workingUnitId);
create index IX_A76D4B6 on oep_usermgt_employee (workingUnitId, mainJobPosId);

create index IX_51804CE9 on oep_usermgt_employee2jobpos (employeeId);
create index IX_F7A49E92 on oep_usermgt_employee2jobpos (jobPosId);

create index IX_D485A156 on oep_usermgt_jobpos (companyId);
create index IX_E8928558 on oep_usermgt_jobpos (groupId);
create index IX_D227B2E on oep_usermgt_jobpos (workingUnitId);
create index IX_E773376B on oep_usermgt_jobpos (workingUnitId, leader);
create index IX_366804D0 on oep_usermgt_jobpos (workingUnitId, positionCatNo);

create index IX_3BA665E8 on oep_usermgt_jobpos2role (jobPosId);
create index IX_45435E87 on oep_usermgt_jobpos2role (roleId);

create index IX_C9478AB7 on oep_usermgt_subaccount (businessId);
create index IX_DBAC8CCD on oep_usermgt_subaccount (businessId, mappingUserId);
create index IX_ECAB4060 on oep_usermgt_subaccount (businessId, workingRole);
create index IX_FFDFCD5C on oep_usermgt_subaccount (mappingUserId);

create index IX_5000E2C6 on oep_usermgt_workingunit (cityNo);
create index IX_BD5A8A2 on oep_usermgt_workingunit (companyId);
create index IX_E8BA98DB on oep_usermgt_workingunit (companyId, isEmployer);
create index IX_803B8514 on oep_usermgt_workingunit (companyId, parentWorkingUnitId);
create index IX_BE3E6F69 on oep_usermgt_workingunit (districtNo);
create index IX_44093958 on oep_usermgt_workingunit (govAgencyId);
create index IX_9A93EFA4 on oep_usermgt_workingunit (groupId);
create index IX_580B1352 on oep_usermgt_workingunit (groupId, parentWorkingUnitId);
create index IX_13B7A0F7 on oep_usermgt_workingunit (localSiteId);
create index IX_9C3D1B68 on oep_usermgt_workingunit (organizationId);
create index IX_31F3E870 on oep_usermgt_workingunit (parentWorkingUnitId);
create index IX_C1D4EB57 on oep_usermgt_workingunit (wardNo);