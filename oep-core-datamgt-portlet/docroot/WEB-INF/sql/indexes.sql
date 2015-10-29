create index IX_709A330 on oep_datamgt_dictattribute (companyId);
create index IX_728034AD on oep_datamgt_dictattribute (companyId, collectionName);
create index IX_1669B865 on oep_datamgt_dictattribute (companyId, collectionName, dataType);
create index IX_C9891F28 on oep_datamgt_dictattribute (companyId, dataType);
create index IX_3C0135B2 on oep_datamgt_dictattribute (groupId);
create index IX_B056832F on oep_datamgt_dictattribute (groupId, collectionName);
create index IX_CB594C67 on oep_datamgt_dictattribute (groupId, collectionName, dataType);
create index IX_7FD4F72A on oep_datamgt_dictattribute (groupId, dataType);

create index IX_28D6585A on oep_datamgt_dictcollection (companyId);
create index IX_D23F7C99 on oep_datamgt_dictcollection (companyId, name);
create index IX_6E28127F on oep_datamgt_dictcollection (companyId, name, status);
create index IX_7E61158F on oep_datamgt_dictcollection (companyId, name, version);
create index IX_E8ED2D5C on oep_datamgt_dictcollection (groupId);
create index IX_A2EF081B on oep_datamgt_dictcollection (groupId, name);
create index IX_92DCFC01 on oep_datamgt_dictcollection (groupId, name, status);
create index IX_F0495C4D on oep_datamgt_dictcollection (groupId, name, version);

create index IX_29CA28CB on oep_datamgt_dictdata (companyId, collectionName);
create index IX_3757017F on oep_datamgt_dictdata (companyId, collectionName, dataLevel);
create index IX_4E573FB9 on oep_datamgt_dictdata (companyId, dataCode);
create index IX_2DFD9F36 on oep_datamgt_dictdata (companyId, dataCode, collectionName);
create index IX_309C481C on oep_datamgt_dictdata (companyId, dataCode, collectionName, status);
create index IX_4896F71C on oep_datamgt_dictdata (companyId, dataLevel);
create index IX_CB2AE6CD on oep_datamgt_dictdata (groupId, collectionName);
create index IX_E216CE3D on oep_datamgt_dictdata (groupId, collectionName, dataLevel);
create index IX_BE97273B on oep_datamgt_dictdata (groupId, dataCode);
create index IX_7DD242B8 on oep_datamgt_dictdata (groupId, dataCode, collectionName);
create index IX_49DE499E on oep_datamgt_dictdata (groupId, dataCode, collectionName, status);
create index IX_E053FFDA on oep_datamgt_dictdata (groupId, dataLevel);

create index IX_427A16A5 on oep_datamgt_dictdata2collection (dictCollectionId);
create index IX_7151FD31 on oep_datamgt_dictdata2collection (dictDataId);

create index IX_2BE554D8 on oep_datamgt_dictmetadata (companyId, dictDataId);
create index IX_FEC6CE5F on oep_datamgt_dictmetadata (companyId, dictDataId, attributeName);
create index IX_75E331D0 on oep_datamgt_dictmetadata (companyId, groupId, dictDataId);
create index IX_BB246267 on oep_datamgt_dictmetadata (companyId, groupId, dictDataId, attributeName);