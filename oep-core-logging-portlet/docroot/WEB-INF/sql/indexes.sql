create index IX_884C980C on oep_logging_newuserlog (action, createDate);
create index IX_2EFB34CA on oep_logging_newuserlog (action, createDate, createDate);
create index IX_1F073A5E on oep_logging_newuserlog (userId);
create index IX_4AC895BC on oep_logging_newuserlog (userName, email, createDate);
create index IX_D4E658CD on oep_logging_newuserlog (useractivityid);

create index IX_18D6D5AF on oep_logging_useractivity (action);
create index IX_567F15ED on oep_logging_useractivity (action, createDate);
create index IX_6BA6C1BF on oep_logging_useractivity (userId);
create index IX_E59F24FB on oep_logging_useractivity (userName, email, createDate);
create index IX_752ED339 on oep_logging_useractivity (userName, email, createDate, createDate);