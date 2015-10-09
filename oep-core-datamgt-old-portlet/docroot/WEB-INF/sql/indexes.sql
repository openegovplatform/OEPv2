create index IX_709A330 on oep_datamgt_dictattribute (companyId);
create index IX_728034AD on oep_datamgt_dictattribute (companyId, collectionName);
create index IX_1669B865 on oep_datamgt_dictattribute (companyId, collectionName, dataType);
create index IX_C9891F28 on oep_datamgt_dictattribute (companyId, dataType);

create index IX_28D6585A on oep_datamgt_dictcollection (companyId);
create index IX_D23F7C99 on oep_datamgt_dictcollection (companyId, name);
create index IX_6E28127F on oep_datamgt_dictcollection (companyId, name, status);
create index IX_7E61158F on oep_datamgt_dictcollection (companyId, name, version);

create index IX_29CA28CB on oep_datamgt_dictdata (companyId, collectionName);
create index IX_3757017F on oep_datamgt_dictdata (companyId, collectionName, dataLevel);
create index IX_2DFD9F36 on oep_datamgt_dictdata (companyId, dataCode, collectionName);
create index IX_8C5AB59F on oep_datamgt_dictdata (companyId, dataCode, status);
create index IX_2114891C on oep_datamgt_dictdata (companyId, dataCode, status, collectionName);
create index IX_4896F71C on oep_datamgt_dictdata (companyId, dataLevel);
create index IX_19B61503 on oep_datamgt_dictdata (dataCode, companyId);

create index IX_427A16A5 on oep_datamgt_dictdata2collection (dictCollectionId);
create index IX_7151FD31 on oep_datamgt_dictdata2collection (dictDataId);

create index IX_2BE554D8 on oep_datamgt_dictmetadata (companyId, dictDataId);
create index IX_FEC6CE5F on oep_datamgt_dictmetadata (companyId, dictDataId, attributeName);