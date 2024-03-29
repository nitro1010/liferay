create table Account_ (
	accountId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	parentAccountId int64,
	name varchar(75),
	legalName varchar(75),
	legalId varchar(75),
	legalType varchar(75),
	sicCode varchar(75),
	tickerSymbol varchar(75),
	industry varchar(75),
	type_ varchar(75),
	size_ varchar(75)
);

create table Address (
	addressId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	street1 varchar(75),
	street2 varchar(75),
	street3 varchar(75),
	city varchar(75),
	zip varchar(75),
	regionId int64,
	countryId int64,
	typeId integer,
	mailing smallint,
	primary_ smallint
);

create table AnnouncementsDelivery (
	deliveryId int64 not null primary key,
	companyId int64,
	userId int64,
	type_ varchar(75),
	email smallint,
	sms smallint,
	website smallint
);

create table AnnouncementsEntry (
	uuid_ varchar(75),
	entryId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	title varchar(75),
	content varchar(4000),
	url varchar(4000),
	type_ varchar(75),
	displayDate timestamp,
	expirationDate timestamp,
	priority integer,
	alert smallint
);

create table AnnouncementsFlag (
	flagId int64 not null primary key,
	userId int64,
	createDate timestamp,
	entryId int64,
	value integer
);

create table AssetCategory (
	uuid_ varchar(75),
	categoryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	parentCategoryId int64,
	leftCategoryId int64,
	rightCategoryId int64,
	name varchar(75),
	title varchar(4000),
	description varchar(4000),
	vocabularyId int64
);

create table AssetCategoryProperty (
	categoryPropertyId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	categoryId int64,
	key_ varchar(75),
	value varchar(75)
);

create table AssetEntries_AssetCategories (
	entryId int64 not null,
	categoryId int64 not null,
	primary key (entryId, categoryId)
);

create table AssetEntries_AssetTags (
	entryId int64 not null,
	tagId int64 not null,
	primary key (entryId, tagId)
);

create table AssetEntry (
	entryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	classUuid varchar(75),
	classTypeId int64,
	visible smallint,
	startDate timestamp,
	endDate timestamp,
	publishDate timestamp,
	expirationDate timestamp,
	mimeType varchar(75),
	title varchar(4000),
	description varchar(4000),
	summary varchar(4000),
	url varchar(4000),
	layoutUuid varchar(75),
	height integer,
	width integer,
	priority double precision,
	viewCount integer
);

create table AssetLink (
	linkId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	entryId1 int64,
	entryId2 int64,
	type_ integer,
	weight integer
);

create table AssetTag (
	tagId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	assetCount integer
);

create table AssetTagProperty (
	tagPropertyId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	tagId int64,
	key_ varchar(75),
	value varchar(255)
);

create table AssetTagStats (
	tagStatsId int64 not null primary key,
	tagId int64,
	classNameId int64,
	assetCount integer
);

create table AssetVocabulary (
	uuid_ varchar(75),
	vocabularyId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	title varchar(4000),
	description varchar(4000),
	settings_ varchar(4000)
);

create table BlogsEntry (
	uuid_ varchar(75),
	entryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	title varchar(150),
	urlTitle varchar(150),
	description varchar(75),
	content blob,
	displayDate timestamp,
	allowPingbacks smallint,
	allowTrackbacks smallint,
	trackbacks blob,
	smallImage smallint,
	smallImageId int64,
	smallImageURL varchar(4000),
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table BlogsStatsUser (
	statsUserId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	entryCount integer,
	lastPostDate timestamp,
	ratingsTotalEntries integer,
	ratingsTotalScore double precision,
	ratingsAverageScore double precision
);

create table BookmarksEntry (
	uuid_ varchar(75),
	entryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceBlockId int64,
	folderId int64,
	name varchar(255),
	url varchar(4000),
	description varchar(4000),
	visits integer,
	priority integer
);

create table BookmarksFolder (
	uuid_ varchar(75),
	folderId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceBlockId int64,
	parentFolderId int64,
	name varchar(75),
	description varchar(4000)
);

create table BrowserTracker (
	browserTrackerId int64 not null primary key,
	userId int64,
	browserKey int64
);

create table CalEvent (
	uuid_ varchar(75),
	eventId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	title varchar(75),
	description varchar(4000),
	location varchar(4000),
	startDate timestamp,
	endDate timestamp,
	durationHour integer,
	durationMinute integer,
	allDay smallint,
	timeZoneSensitive smallint,
	type_ varchar(75),
	repeating smallint,
	recurrence blob,
	remindBy integer,
	firstReminder integer,
	secondReminder integer
);

create table ClassName_ (
	classNameId int64 not null primary key,
	value varchar(200)
);

create table ClusterGroup (
	clusterGroupId int64 not null primary key,
	name varchar(75),
	clusterNodeIds varchar(75),
	wholeCluster smallint
);

create table Company (
	companyId int64 not null primary key,
	accountId int64,
	webId varchar(75),
	key_ blob,
	mx varchar(75),
	homeURL varchar(4000),
	logoId int64,
	system smallint,
	maxUsers integer,
	active_ smallint
);

create table Contact_ (
	contactId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	accountId int64,
	parentContactId int64,
	firstName varchar(75),
	middleName varchar(75),
	lastName varchar(75),
	prefixId integer,
	suffixId integer,
	male smallint,
	birthday timestamp,
	smsSn varchar(75),
	aimSn varchar(75),
	facebookSn varchar(75),
	icqSn varchar(75),
	jabberSn varchar(75),
	msnSn varchar(75),
	mySpaceSn varchar(75),
	skypeSn varchar(75),
	twitterSn varchar(75),
	ymSn varchar(75),
	employeeStatusId varchar(75),
	employeeNumber varchar(75),
	jobTitle varchar(100),
	jobClass varchar(75),
	hoursOfOperation varchar(75)
);

create table Counter (
	name varchar(75) not null primary key,
	currentId int64
);

create table Country (
	countryId int64 not null primary key,
	name varchar(75),
	a2 varchar(75),
	a3 varchar(75),
	number_ varchar(75),
	idd_ varchar(75),
	zipRequired smallint,
	active_ smallint
);

create table CyrusUser (
	userId varchar(75) not null primary key,
	password_ varchar(75) not null
);

create table CyrusVirtual (
	emailAddress varchar(75) not null primary key,
	userId varchar(75) not null
);

create table DDLRecord (
	uuid_ varchar(75),
	recordId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	versionUserId int64,
	versionUserName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	DDMStorageId int64,
	recordSetId int64,
	version varchar(75),
	displayIndex integer
);

create table DDLRecordSet (
	uuid_ varchar(75),
	recordSetId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	DDMStructureId int64,
	recordSetKey varchar(75),
	name varchar(4000),
	description varchar(4000),
	minDisplayRows integer,
	scope integer
);

create table DDLRecordVersion (
	recordVersionId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	DDMStorageId int64,
	recordSetId int64,
	recordId int64,
	version varchar(75),
	displayIndex integer,
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table DDMContent (
	uuid_ varchar(75),
	contentId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(4000),
	description varchar(4000),
	xml blob
);

create table DDMStorageLink (
	uuid_ varchar(75),
	storageLinkId int64 not null primary key,
	classNameId int64,
	classPK int64,
	structureId int64
);

create table DDMStructure (
	uuid_ varchar(75),
	structureId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	structureKey varchar(75),
	name varchar(4000),
	description varchar(4000),
	xsd blob,
	storageType varchar(75),
	type_ integer
);

create table DDMStructureLink (
	structureLinkId int64 not null primary key,
	classNameId int64,
	classPK int64,
	structureId int64
);

create table DDMTemplate (
	uuid_ varchar(75),
	templateId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	structureId int64,
	name varchar(4000),
	description varchar(4000),
	type_ varchar(75),
	mode_ varchar(75),
	language varchar(75),
	script blob
);

create table DLContent (
	contentId int64 not null primary key,
	groupId int64,
	companyId int64,
	repositoryId int64,
	path_ varchar(255),
	version varchar(75),
	data_ blob,
	size_ int64
);

create table DLFileEntry (
	uuid_ varchar(75),
	fileEntryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	versionUserId int64,
	versionUserName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	repositoryId int64,
	folderId int64,
	name varchar(255),
	extension varchar(75),
	mimeType varchar(75),
	title varchar(255),
	description varchar(4000),
	extraSettings blob,
	fileEntryTypeId int64,
	version varchar(75),
	size_ int64,
	readCount integer,
	smallImageId int64,
	largeImageId int64,
	custom1ImageId int64,
	custom2ImageId int64
);

create table DLFileEntryMetadata (
	uuid_ varchar(75),
	fileEntryMetadataId int64 not null primary key,
	DDMStorageId int64,
	DDMStructureId int64,
	fileEntryTypeId int64,
	fileEntryId int64,
	fileVersionId int64
);

create table DLFileEntryType (
	uuid_ varchar(75),
	fileEntryTypeId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	description varchar(4000)
);

create table DLFileEntryTypes_DDMStructures (
	fileEntryTypeId int64 not null,
	structureId int64 not null,
	primary key (fileEntryTypeId, structureId)
);

create table DLFileEntryTypes_DLFolders (
	fileEntryTypeId int64 not null,
	folderId int64 not null,
	primary key (fileEntryTypeId, folderId)
);

create table DLFileRank (
	fileRankId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	createDate timestamp,
	fileEntryId int64
);

create table DLFileShortcut (
	uuid_ varchar(75),
	fileShortcutId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	repositoryId int64,
	folderId int64,
	toFileEntryId int64,
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table DLFileVersion (
	fileVersionId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	repositoryId int64,
	folderId int64,
	fileEntryId int64,
	extension varchar(75),
	mimeType varchar(75),
	title varchar(255),
	description varchar(4000),
	changeLog varchar(75),
	extraSettings blob,
	fileEntryTypeId int64,
	version varchar(75),
	size_ int64,
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table DLFolder (
	uuid_ varchar(75),
	folderId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	repositoryId int64,
	mountPoint smallint,
	parentFolderId int64,
	name varchar(100),
	description varchar(4000),
	lastPostDate timestamp,
	defaultFileEntryTypeId int64,
	overrideFileEntryTypes smallint
);

create table DLSync (
	syncId int64 not null primary key,
	companyId int64,
	createDate timestamp,
	modifiedDate timestamp,
	fileId int64,
	fileUuid varchar(75),
	repositoryId int64,
	parentFolderId int64,
	name varchar(255),
	event varchar(75),
	type_ varchar(75),
	version varchar(75)
);

create table EmailAddress (
	emailAddressId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	address varchar(75),
	typeId integer,
	primary_ smallint
);

create table ExpandoColumn (
	columnId int64 not null primary key,
	companyId int64,
	tableId int64,
	name varchar(75),
	type_ integer,
	defaultData varchar(4000),
	typeSettings blob
);

create table ExpandoRow (
	rowId_ int64 not null primary key,
	companyId int64,
	tableId int64,
	classPK int64
);

create table ExpandoTable (
	tableId int64 not null primary key,
	companyId int64,
	classNameId int64,
	name varchar(75)
);

create table ExpandoValue (
	valueId int64 not null primary key,
	companyId int64,
	tableId int64,
	columnId int64,
	rowId_ int64,
	classNameId int64,
	classPK int64,
	data_ varchar(4000)
);

create table Group_ (
	groupId int64 not null primary key,
	companyId int64,
	creatorUserId int64,
	classNameId int64,
	classPK int64,
	parentGroupId int64,
	liveGroupId int64,
	name varchar(150),
	description varchar(4000),
	type_ integer,
	typeSettings varchar(4000),
	friendlyURL varchar(100),
	site smallint,
	active_ smallint
);

create table Groups_Orgs (
	groupId int64 not null,
	organizationId int64 not null,
	primary key (groupId, organizationId)
);

create table Groups_Permissions (
	groupId int64 not null,
	permissionId int64 not null,
	primary key (groupId, permissionId)
);

create table Groups_Roles (
	groupId int64 not null,
	roleId int64 not null,
	primary key (groupId, roleId)
);

create table Groups_UserGroups (
	groupId int64 not null,
	userGroupId int64 not null,
	primary key (groupId, userGroupId)
);

create table Image (
	imageId int64 not null primary key,
	modifiedDate timestamp,
	text_ blob,
	type_ varchar(75),
	height integer,
	width integer,
	size_ integer
);

create table JournalArticle (
	uuid_ varchar(75),
	id_ int64 not null primary key,
	resourcePrimKey int64,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	articleId varchar(75),
	version double precision,
	title varchar(4000),
	urlTitle varchar(150),
	description varchar(4000),
	content blob,
	type_ varchar(75),
	structureId varchar(75),
	templateId varchar(75),
	layoutUuid varchar(75),
	displayDate timestamp,
	expirationDate timestamp,
	reviewDate timestamp,
	indexable smallint,
	smallImage smallint,
	smallImageId int64,
	smallImageURL varchar(4000),
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table JournalArticleImage (
	articleImageId int64 not null primary key,
	groupId int64,
	articleId varchar(75),
	version double precision,
	elInstanceId varchar(75),
	elName varchar(75),
	languageId varchar(75),
	tempImage smallint
);

create table JournalArticleResource (
	uuid_ varchar(75),
	resourcePrimKey int64 not null primary key,
	groupId int64,
	articleId varchar(75)
);

create table JournalContentSearch (
	contentSearchId int64 not null primary key,
	groupId int64,
	companyId int64,
	privateLayout smallint,
	layoutId int64,
	portletId varchar(200),
	articleId varchar(75)
);

create table JournalFeed (
	uuid_ varchar(75),
	id_ int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	feedId varchar(75),
	name varchar(75),
	description varchar(4000),
	type_ varchar(75),
	structureId varchar(75),
	templateId varchar(75),
	rendererTemplateId varchar(75),
	delta integer,
	orderByCol varchar(75),
	orderByType varchar(75),
	targetLayoutFriendlyUrl varchar(255),
	targetPortletId varchar(75),
	contentField varchar(75),
	feedType varchar(75),
	feedVersion double precision
);

create table JournalStructure (
	uuid_ varchar(75),
	id_ int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	structureId varchar(75),
	parentStructureId varchar(75),
	name varchar(4000),
	description varchar(4000),
	xsd blob
);

create table JournalTemplate (
	uuid_ varchar(75),
	id_ int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	templateId varchar(75),
	structureId varchar(75),
	name varchar(4000),
	description varchar(4000),
	xsl blob,
	langType varchar(75),
	cacheable smallint,
	smallImage smallint,
	smallImageId int64,
	smallImageURL varchar(4000)
);

create table Layout (
	uuid_ varchar(75),
	plid int64 not null primary key,
	groupId int64,
	companyId int64,
	createDate timestamp,
	modifiedDate timestamp,
	privateLayout smallint,
	layoutId int64,
	parentLayoutId int64,
	name varchar(4000),
	title varchar(4000),
	description varchar(4000),
	keywords varchar(4000),
	robots varchar(4000),
	type_ varchar(75),
	typeSettings blob,
	hidden_ smallint,
	friendlyURL varchar(255),
	iconImage smallint,
	iconImageId int64,
	themeId varchar(75),
	colorSchemeId varchar(75),
	wapThemeId varchar(75),
	wapColorSchemeId varchar(75),
	css varchar(4000),
	priority integer,
	layoutPrototypeUuid varchar(75),
	layoutPrototypeLinkEnabled smallint,
	sourcePrototypeLayoutUuid varchar(75)
);

create table LayoutBranch (
	LayoutBranchId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	layoutSetBranchId int64,
	plid int64,
	name varchar(75),
	description varchar(4000),
	master smallint
);

create table LayoutPrototype (
	uuid_ varchar(75),
	layoutPrototypeId int64 not null primary key,
	companyId int64,
	name varchar(4000),
	description varchar(4000),
	settings_ varchar(4000),
	active_ smallint
);

create table LayoutRevision (
	layoutRevisionId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	layoutSetBranchId int64,
	layoutBranchId int64,
	parentLayoutRevisionId int64,
	head smallint,
	major smallint,
	plid int64,
	privateLayout smallint,
	name varchar(4000),
	title varchar(4000),
	description varchar(4000),
	keywords varchar(4000),
	robots varchar(4000),
	typeSettings blob,
	iconImage smallint,
	iconImageId int64,
	themeId varchar(75),
	colorSchemeId varchar(75),
	wapThemeId varchar(75),
	wapColorSchemeId varchar(75),
	css varchar(4000),
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table LayoutSet (
	layoutSetId int64 not null primary key,
	groupId int64,
	companyId int64,
	createDate timestamp,
	modifiedDate timestamp,
	privateLayout smallint,
	logo smallint,
	logoId int64,
	themeId varchar(75),
	colorSchemeId varchar(75),
	wapThemeId varchar(75),
	wapColorSchemeId varchar(75),
	css varchar(4000),
	pageCount integer,
	settings_ varchar(4000),
	layoutSetPrototypeUuid varchar(75),
	layoutSetPrototypeLinkEnabled smallint
);

create table LayoutSetBranch (
	layoutSetBranchId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	privateLayout smallint,
	name varchar(75),
	description varchar(4000),
	master smallint
);

create table LayoutSetPrototype (
	uuid_ varchar(75),
	layoutSetPrototypeId int64 not null primary key,
	companyId int64,
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(4000),
	description varchar(4000),
	settings_ varchar(4000),
	active_ smallint
);

create table ListType (
	listTypeId integer not null primary key,
	name varchar(75),
	type_ varchar(75)
);

create table Lock_ (
	uuid_ varchar(75),
	lockId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	className varchar(75),
	key_ varchar(200),
	owner varchar(255),
	inheritable smallint,
	expirationDate timestamp
);

create table MBBan (
	banId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	banUserId int64
);

create table MBCategory (
	uuid_ varchar(75),
	categoryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	parentCategoryId int64,
	name varchar(75),
	description varchar(4000),
	displayStyle varchar(75),
	threadCount integer,
	messageCount integer,
	lastPostDate timestamp
);

create table MBDiscussion (
	discussionId int64 not null primary key,
	classNameId int64,
	classPK int64,
	threadId int64
);

create table MBMailingList (
	uuid_ varchar(75),
	mailingListId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	categoryId int64,
	emailAddress varchar(75),
	inProtocol varchar(75),
	inServerName varchar(75),
	inServerPort integer,
	inUseSSL smallint,
	inUserName varchar(75),
	inPassword varchar(75),
	inReadInterval integer,
	outEmailAddress varchar(75),
	outCustom smallint,
	outServerName varchar(75),
	outServerPort integer,
	outUseSSL smallint,
	outUserName varchar(75),
	outPassword varchar(75),
	allowAnonymous smallint,
	active_ smallint
);

create table MBMessage (
	uuid_ varchar(75),
	messageId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	categoryId int64,
	threadId int64,
	rootMessageId int64,
	parentMessageId int64,
	subject varchar(75),
	body blob,
	format varchar(75),
	attachments smallint,
	anonymous smallint,
	priority double precision,
	allowPingbacks smallint,
	answer smallint,
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table MBStatsUser (
	statsUserId int64 not null primary key,
	groupId int64,
	userId int64,
	messageCount integer,
	lastPostDate timestamp
);

create table MBThread (
	threadId int64 not null primary key,
	groupId int64,
	companyId int64,
	categoryId int64,
	rootMessageId int64,
	rootMessageUserId int64,
	messageCount integer,
	viewCount integer,
	lastPostByUserId int64,
	lastPostDate timestamp,
	priority double precision,
	question smallint,
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table MBThreadFlag (
	threadFlagId int64 not null primary key,
	userId int64,
	modifiedDate timestamp,
	threadId int64
);

create table MDRAction (
	uuid_ varchar(75),
	actionId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	ruleGroupInstanceId int64,
	name varchar(4000),
	description varchar(4000),
	type_ varchar(255),
	typeSettings blob
);

create table MDRRule (
	uuid_ varchar(75),
	ruleId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ruleGroupId int64,
	name varchar(4000),
	description varchar(4000),
	type_ varchar(255),
	typeSettings blob
);

create table MDRRuleGroup (
	uuid_ varchar(75),
	ruleGroupId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(4000),
	description varchar(4000)
);

create table MDRRuleGroupInstance (
	uuid_ varchar(75),
	ruleGroupInstanceId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	ruleGroupId int64,
	priority integer
);

create table MembershipRequest (
	membershipRequestId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	createDate timestamp,
	comments varchar(4000),
	replyComments varchar(4000),
	replyDate timestamp,
	replierUserId int64,
	statusId integer
);

create table Organization_ (
	organizationId int64 not null primary key,
	companyId int64,
	parentOrganizationId int64,
	treePath varchar(4000),
	name varchar(100),
	type_ varchar(75),
	recursable smallint,
	regionId int64,
	countryId int64,
	statusId integer,
	comments varchar(4000)
);

create table OrgGroupPermission (
	organizationId int64 not null,
	groupId int64 not null,
	permissionId int64 not null,
	primary key (organizationId, groupId, permissionId)
);

create table OrgGroupRole (
	organizationId int64 not null,
	groupId int64 not null,
	roleId int64 not null,
	primary key (organizationId, groupId, roleId)
);

create table OrgLabor (
	orgLaborId int64 not null primary key,
	organizationId int64,
	typeId integer,
	sunOpen integer,
	sunClose integer,
	monOpen integer,
	monClose integer,
	tueOpen integer,
	tueClose integer,
	wedOpen integer,
	wedClose integer,
	thuOpen integer,
	thuClose integer,
	friOpen integer,
	friClose integer,
	satOpen integer,
	satClose integer
);

create table PasswordPolicy (
	passwordPolicyId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	defaultPolicy smallint,
	name varchar(75),
	description varchar(4000),
	changeable smallint,
	changeRequired smallint,
	minAge int64,
	checkSyntax smallint,
	allowDictionaryWords smallint,
	minAlphanumeric integer,
	minLength integer,
	minLowerCase integer,
	minNumbers integer,
	minSymbols integer,
	minUpperCase integer,
	history smallint,
	historyCount integer,
	expireable smallint,
	maxAge int64,
	warningTime int64,
	graceLimit integer,
	lockout smallint,
	maxFailure integer,
	lockoutDuration int64,
	requireUnlock smallint,
	resetFailureCount int64,
	resetTicketMaxAge int64
);

create table PasswordPolicyRel (
	passwordPolicyRelId int64 not null primary key,
	passwordPolicyId int64,
	classNameId int64,
	classPK int64
);

create table PasswordTracker (
	passwordTrackerId int64 not null primary key,
	userId int64,
	createDate timestamp,
	password_ varchar(75)
);

create table Permission_ (
	permissionId int64 not null primary key,
	companyId int64,
	actionId varchar(75),
	resourceId int64
);

create table Phone (
	phoneId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	number_ varchar(75),
	extension varchar(75),
	typeId integer,
	primary_ smallint
);

create table PluginSetting (
	pluginSettingId int64 not null primary key,
	companyId int64,
	pluginId varchar(75),
	pluginType varchar(75),
	roles varchar(4000),
	active_ smallint
);

create table PollsChoice (
	uuid_ varchar(75),
	choiceId int64 not null primary key,
	questionId int64,
	name varchar(75),
	description varchar(4000)
);

create table PollsQuestion (
	uuid_ varchar(75),
	questionId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	title varchar(4000),
	description varchar(4000),
	expirationDate timestamp,
	lastVoteDate timestamp
);

create table PollsVote (
	voteId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	questionId int64,
	choiceId int64,
	voteDate timestamp
);

create table PortalPreferences (
	portalPreferencesId int64 not null primary key,
	ownerId int64,
	ownerType integer,
	preferences blob
);

create table Portlet (
	id_ int64 not null primary key,
	companyId int64,
	portletId varchar(200),
	roles varchar(4000),
	active_ smallint
);

create table PortletItem (
	portletItemId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	portletId varchar(75),
	classNameId int64
);

create table PortletPreferences (
	portletPreferencesId int64 not null primary key,
	ownerId int64,
	ownerType integer,
	plid int64,
	portletId varchar(200),
	preferences blob
);

create table RatingsEntry (
	entryId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	score double precision
);

create table RatingsStats (
	statsId int64 not null primary key,
	classNameId int64,
	classPK int64,
	totalEntries integer,
	totalScore double precision,
	averageScore double precision
);

create table Region (
	regionId int64 not null primary key,
	countryId int64,
	regionCode varchar(75),
	name varchar(75),
	active_ smallint
);

create table Release_ (
	releaseId int64 not null primary key,
	createDate timestamp,
	modifiedDate timestamp,
	servletContextName varchar(75),
	buildNumber integer,
	buildDate timestamp,
	verified smallint,
	testString varchar(1024)
);

create table Repository (
	uuid_ varchar(75),
	repositoryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	name varchar(75),
	description varchar(4000),
	portletId varchar(75),
	typeSettings blob,
	dlFolderId int64
);

create table RepositoryEntry (
	uuid_ varchar(75),
	repositoryEntryId int64 not null primary key,
	groupId int64,
	repositoryId int64,
	mappedId varchar(75)
);

create table ResourceBlock (
	resourceBlockId int64 not null primary key,
	companyId int64,
	groupId int64,
	name varchar(75),
	permissionsHash varchar(75),
	referenceCount int64
);

create table ResourceBlockPermission (
	resourceBlockPermissionId int64 not null primary key,
	resourceBlockId int64,
	roleId int64,
	actionIds int64
);

create table ResourceTypePermission (
	resourceTypePermissionId int64 not null primary key,
	companyId int64,
	groupId int64,
	name varchar(75),
	roleId int64,
	actionIds int64
);

create table Resource_ (
	resourceId int64 not null primary key,
	codeId int64,
	primKey varchar(255)
);

create table ResourceAction (
	resourceActionId int64 not null primary key,
	name varchar(255),
	actionId varchar(75),
	bitwiseValue int64
);

create table ResourceCode (
	codeId int64 not null primary key,
	companyId int64,
	name varchar(255),
	scope integer
);

create table ResourcePermission (
	resourcePermissionId int64 not null primary key,
	companyId int64,
	name varchar(255),
	scope integer,
	primKey varchar(255),
	roleId int64,
	ownerId int64,
	actionIds int64
);

create table Role_ (
	roleId int64 not null primary key,
	companyId int64,
	classNameId int64,
	classPK int64,
	name varchar(75),
	title varchar(4000),
	description varchar(4000),
	type_ integer,
	subtype varchar(75)
);

create table Roles_Permissions (
	roleId int64 not null,
	permissionId int64 not null,
	primary key (roleId, permissionId)
);

create table SCFrameworkVersi_SCProductVers (
	frameworkVersionId int64 not null,
	productVersionId int64 not null,
	primary key (frameworkVersionId, productVersionId)
);

create table SCFrameworkVersion (
	frameworkVersionId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	url varchar(4000),
	active_ smallint,
	priority integer
);

create table SCLicense (
	licenseId int64 not null primary key,
	name varchar(75),
	url varchar(4000),
	openSource smallint,
	active_ smallint,
	recommended smallint
);

create table SCLicenses_SCProductEntries (
	licenseId int64 not null,
	productEntryId int64 not null,
	primary key (licenseId, productEntryId)
);

create table SCProductEntry (
	productEntryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	type_ varchar(75),
	tags varchar(255),
	shortDescription varchar(4000),
	longDescription varchar(4000),
	pageURL varchar(4000),
	author varchar(75),
	repoGroupId varchar(75),
	repoArtifactId varchar(75)
);

create table SCProductScreenshot (
	productScreenshotId int64 not null primary key,
	companyId int64,
	groupId int64,
	productEntryId int64,
	thumbnailId int64,
	fullImageId int64,
	priority integer
);

create table SCProductVersion (
	productVersionId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	productEntryId int64,
	version varchar(75),
	changeLog varchar(4000),
	downloadPageURL varchar(4000),
	directDownloadURL varchar(2000),
	repoStoreArtifact smallint
);

create table ServiceComponent (
	serviceComponentId int64 not null primary key,
	buildNamespace varchar(75),
	buildNumber int64,
	buildDate int64,
	data_ blob
);

create table Shard (
	shardId int64 not null primary key,
	classNameId int64,
	classPK int64,
	name varchar(75)
);

create table ShoppingCart (
	cartId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	itemIds varchar(4000),
	couponCodes varchar(75),
	altShipping integer,
	insure smallint
);

create table ShoppingCategory (
	categoryId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	parentCategoryId int64,
	name varchar(75),
	description varchar(4000)
);

create table ShoppingCoupon (
	couponId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	code_ varchar(75),
	name varchar(75),
	description varchar(4000),
	startDate timestamp,
	endDate timestamp,
	active_ smallint,
	limitCategories varchar(4000),
	limitSkus varchar(4000),
	minOrder double precision,
	discount double precision,
	discountType varchar(75)
);

create table ShoppingItem (
	itemId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	categoryId int64,
	sku varchar(75),
	name varchar(200),
	description varchar(4000),
	properties varchar(4000),
	fields_ smallint,
	fieldsQuantities varchar(4000),
	minQuantity integer,
	maxQuantity integer,
	price double precision,
	discount double precision,
	taxable smallint,
	shipping double precision,
	useShippingFormula smallint,
	requiresShipping smallint,
	stockQuantity integer,
	featured_ smallint,
	sale_ smallint,
	smallImage smallint,
	smallImageId int64,
	smallImageURL varchar(4000),
	mediumImage smallint,
	mediumImageId int64,
	mediumImageURL varchar(4000),
	largeImage smallint,
	largeImageId int64,
	largeImageURL varchar(4000)
);

create table ShoppingItemField (
	itemFieldId int64 not null primary key,
	itemId int64,
	name varchar(75),
	values_ varchar(4000),
	description varchar(4000)
);

create table ShoppingItemPrice (
	itemPriceId int64 not null primary key,
	itemId int64,
	minQuantity integer,
	maxQuantity integer,
	price double precision,
	discount double precision,
	taxable smallint,
	shipping double precision,
	useShippingFormula smallint,
	status integer
);

create table ShoppingOrder (
	orderId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	number_ varchar(75),
	tax double precision,
	shipping double precision,
	altShipping varchar(75),
	requiresShipping smallint,
	insure smallint,
	insurance double precision,
	couponCodes varchar(75),
	couponDiscount double precision,
	billingFirstName varchar(75),
	billingLastName varchar(75),
	billingEmailAddress varchar(75),
	billingCompany varchar(75),
	billingStreet varchar(75),
	billingCity varchar(75),
	billingState varchar(75),
	billingZip varchar(75),
	billingCountry varchar(75),
	billingPhone varchar(75),
	shipToBilling smallint,
	shippingFirstName varchar(75),
	shippingLastName varchar(75),
	shippingEmailAddress varchar(75),
	shippingCompany varchar(75),
	shippingStreet varchar(75),
	shippingCity varchar(75),
	shippingState varchar(75),
	shippingZip varchar(75),
	shippingCountry varchar(75),
	shippingPhone varchar(75),
	ccName varchar(75),
	ccType varchar(75),
	ccNumber varchar(75),
	ccExpMonth integer,
	ccExpYear integer,
	ccVerNumber varchar(75),
	comments varchar(4000),
	ppTxnId varchar(75),
	ppPaymentStatus varchar(75),
	ppPaymentGross double precision,
	ppReceiverEmail varchar(75),
	ppPayerEmail varchar(75),
	sendOrderEmail smallint,
	sendShippingEmail smallint
);

create table ShoppingOrderItem (
	orderItemId int64 not null primary key,
	orderId int64,
	itemId varchar(75),
	sku varchar(75),
	name varchar(200),
	description varchar(4000),
	properties varchar(4000),
	price double precision,
	quantity integer,
	shippedDate timestamp
);

create table SocialActivity (
	activityId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	createDate int64,
	mirrorActivityId int64,
	classNameId int64,
	classPK int64,
	type_ integer,
	extraData varchar(4000),
	receiverUserId int64
);

create table SocialActivityAchievement (
	activityAchievementId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	createDate int64,
	name varchar(75),
	firstInGroup smallint
);

create table SocialActivityCounter (
	activityCounterId int64 not null primary key,
	groupId int64,
	companyId int64,
	classNameId int64,
	classPK int64,
	name varchar(75),
	ownerType integer,
	currentValue integer,
	totalValue integer,
	graceValue integer,
	startPeriod integer,
	endPeriod integer
);

create table SocialActivityLimit (
	activityLimitId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	classNameId int64,
	classPK int64,
	activityType integer,
	activityCounterName varchar(75),
	value varchar(75)
);

create table SocialActivitySetting (
	activitySettingId int64 not null primary key,
	groupId int64,
	companyId int64,
	classNameId int64,
	activityType integer,
	name varchar(75),
	value varchar(1024)
);

create table SocialRelation (
	uuid_ varchar(75),
	relationId int64 not null primary key,
	companyId int64,
	createDate int64,
	userId1 int64,
	userId2 int64,
	type_ integer
);

create table SocialRequest (
	uuid_ varchar(75),
	requestId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	createDate int64,
	modifiedDate int64,
	classNameId int64,
	classPK int64,
	type_ integer,
	extraData varchar(4000),
	receiverUserId int64,
	status integer
);

create table Subscription (
	subscriptionId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	frequency varchar(75)
);

create table Team (
	teamId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	groupId int64,
	name varchar(75),
	description varchar(4000)
);

create table Ticket (
	ticketId int64 not null primary key,
	companyId int64,
	createDate timestamp,
	classNameId int64,
	classPK int64,
	key_ varchar(75),
	type_ integer,
	extraInfo blob,
	expirationDate timestamp
);

create table User_ (
	uuid_ varchar(75),
	userId int64 not null primary key,
	companyId int64,
	createDate timestamp,
	modifiedDate timestamp,
	defaultUser smallint,
	contactId int64,
	password_ varchar(75),
	passwordEncrypted smallint,
	passwordReset smallint,
	passwordModifiedDate timestamp,
	digest varchar(255),
	reminderQueryQuestion varchar(75),
	reminderQueryAnswer varchar(75),
	graceLoginCount integer,
	screenName varchar(75),
	emailAddress varchar(75),
	facebookId int64,
	openId varchar(1024),
	portraitId int64,
	languageId varchar(75),
	timeZoneId varchar(75),
	greeting varchar(255),
	comments varchar(4000),
	firstName varchar(75),
	middleName varchar(75),
	lastName varchar(75),
	jobTitle varchar(100),
	loginDate timestamp,
	loginIP varchar(75),
	lastLoginDate timestamp,
	lastLoginIP varchar(75),
	lastFailedLoginDate timestamp,
	failedLoginAttempts integer,
	lockout smallint,
	lockoutDate timestamp,
	agreedToTermsOfUse smallint,
	emailAddressVerified smallint,
	status integer
);

create table UserGroup (
	userGroupId int64 not null primary key,
	companyId int64,
	parentUserGroupId int64,
	name varchar(75),
	description varchar(4000),
	addedByLDAPImport smallint
);

create table UserGroupGroupRole (
	userGroupId int64 not null,
	groupId int64 not null,
	roleId int64 not null,
	primary key (userGroupId, groupId, roleId)
);

create table UserGroupRole (
	userId int64 not null,
	groupId int64 not null,
	roleId int64 not null,
	primary key (userId, groupId, roleId)
);

create table UserGroups_Teams (
	userGroupId int64 not null,
	teamId int64 not null,
	primary key (userGroupId, teamId)
);

create table UserIdMapper (
	userIdMapperId int64 not null primary key,
	userId int64,
	type_ varchar(75),
	description varchar(75),
	externalUserId varchar(75)
);

create table UserNotificationEvent (
	uuid_ varchar(75),
	userNotificationEventId int64 not null primary key,
	companyId int64,
	userId int64,
	type_ varchar(75),
	timestamp int64,
	deliverBy int64,
	payload blob,
	archived smallint
);

create table Users_Groups (
	userId int64 not null,
	groupId int64 not null,
	primary key (userId, groupId)
);

create table Users_Orgs (
	userId int64 not null,
	organizationId int64 not null,
	primary key (userId, organizationId)
);

create table Users_Permissions (
	userId int64 not null,
	permissionId int64 not null,
	primary key (userId, permissionId)
);

create table Users_Roles (
	userId int64 not null,
	roleId int64 not null,
	primary key (userId, roleId)
);

create table Users_Teams (
	userId int64 not null,
	teamId int64 not null,
	primary key (userId, teamId)
);

create table Users_UserGroups (
	userGroupId int64 not null,
	userId int64 not null,
	primary key (userGroupId, userId)
);

create table UserTracker (
	userTrackerId int64 not null primary key,
	companyId int64,
	userId int64,
	modifiedDate timestamp,
	sessionId varchar(200),
	remoteAddr varchar(75),
	remoteHost varchar(75),
	userAgent varchar(200)
);

create table UserTrackerPath (
	userTrackerPathId int64 not null primary key,
	userTrackerId int64,
	path_ varchar(4000),
	pathDate timestamp
);

create table VirtualHost (
	virtualHostId int64 not null primary key,
	companyId int64,
	layoutSetId int64,
	hostname varchar(75)
);

create table Vocabulary (
	vocabularyId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	description varchar(75),
	folksonomy smallint
);

create table WebDAVProps (
	webDavPropsId int64 not null primary key,
	companyId int64,
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	props blob
);

create table Website (
	websiteId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	url varchar(4000),
	typeId integer,
	primary_ smallint
);

create table WikiNode (
	uuid_ varchar(75),
	nodeId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	description varchar(4000),
	lastPostDate timestamp
);

create table WikiPage (
	uuid_ varchar(75),
	pageId int64 not null primary key,
	resourcePrimKey int64,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	nodeId int64,
	title varchar(255),
	version double precision,
	minorEdit smallint,
	content blob,
	summary varchar(4000),
	format varchar(75),
	head smallint,
	parentTitle varchar(255),
	redirectTitle varchar(255),
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table WikiPageResource (
	uuid_ varchar(75),
	resourcePrimKey int64 not null primary key,
	nodeId int64,
	title varchar(255)
);

create table WorkflowDefinitionLink (
	workflowDefinitionLinkId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	typePK int64,
	workflowDefinitionName varchar(75),
	workflowDefinitionVersion integer
);

create table WorkflowInstanceLink (
	workflowInstanceLinkId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	classNameId int64,
	classPK int64,
	workflowInstanceId int64
);




--
-- List types for accounts
--





--
-- List types for contacts
--







--
-- List types for organizations
--












create table QUARTZ_BLOB_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	BLOB_DATA blob,
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table QUARTZ_CALENDARS (
	SCHED_NAME varchar(120) not null,
	CALENDAR_NAME varchar(200) not null,
	CALENDAR blob not null,
	primary key (SCHED_NAME,CALENDAR_NAME)
);

create table QUARTZ_CRON_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	CRON_EXPRESSION varchar(200) not null,
	TIME_ZONE_ID varchar(80),
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table QUARTZ_FIRED_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	ENTRY_ID varchar(95) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	INSTANCE_NAME varchar(200) not null,
	FIRED_TIME int64 not null,
	PRIORITY integer not null,
	STATE varchar(16) not null,
	JOB_NAME varchar(200),
	JOB_GROUP varchar(200),
	IS_NONCONCURRENT smallint NULL,
	REQUESTS_RECOVERY smallint NULL,
	primary key (SCHED_NAME, ENTRY_ID)
);

create table QUARTZ_JOB_DETAILS (
	SCHED_NAME varchar(120) not null,
	JOB_NAME varchar(200) not null,
	JOB_GROUP varchar(200) not null,
	DESCRIPTION varchar(250),
	JOB_CLASS_NAME varchar(250) not null,
	IS_DURABLE smallint not null,
	IS_NONCONCURRENT smallint not null,
	IS_UPDATE_DATA smallint not null,
	REQUESTS_RECOVERY smallint not null,
	JOB_DATA blob,
	primary key (SCHED_NAME, JOB_NAME, JOB_GROUP)
);

create table QUARTZ_LOCKS (
	SCHED_NAME varchar(120) not null,
	LOCK_NAME varchar(40) not null ,
	primary key (SCHED_NAME, LOCK_NAME)
);

create table QUARTZ_PAUSED_TRIGGER_GRPS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_GROUP varchar(200) not null,
	primary key (SCHED_NAME, TRIGGER_GROUP)
);

create table QUARTZ_SCHEDULER_STATE (
	SCHED_NAME varchar(120) not null,
	INSTANCE_NAME varchar(200) not null,
	LAST_CHECKIN_TIME int64 not null,
	CHECKIN_INTERVAL int64 not null,
	primary key (SCHED_NAME, INSTANCE_NAME)
);

create table QUARTZ_SIMPLE_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	REPEAT_COUNT int64 not null,
	REPEAT_INTERVAL int64 not null,
	TIMES_TRIGGERED int64 not null,
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

CREATE TABLE QUARTZ_SIMPROP_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	STR_PROP_1 varchar(512),
	STR_PROP_2 varchar(512),
	STR_PROP_3 varchar(512),
	INT_PROP_1 integer,
	INT_PROP_2 integer,
	LONG_PROP_1 int64,
	LONG_PROP_2 int64,
	DEC_PROP_1 NUMERIC(13,4),
	DEC_PROP_2 NUMERIC(13,4),
	BOOL_PROP_1 smallint,
	BOOL_PROP_2 smallint,
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table QUARTZ_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	JOB_NAME varchar(200) not null,
	JOB_GROUP varchar(200) not null,
	DESCRIPTION varchar(250),
	NEXT_FIRE_TIME int64,
	PREV_FIRE_TIME int64,
	PRIORITY integer,
	TRIGGER_STATE varchar(16) not null,
	TRIGGER_TYPE varchar(8) not null,
	START_TIME int64 not null,
	END_TIME int64,
	CALENDAR_NAME varchar(200),
	MISFIRE_INSTR integer,
	JOB_DATA blob,
	primary key  (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

commit;

create index IX_88328984 on QUARTZ_JOB_DETAILS (SCHED_NAME, JOB_GROUP);
create index IX_779BCA37 on QUARTZ_JOB_DETAILS (SCHED_NAME, REQUESTS_RECOVERY);

create index IX_BE3835E5 on QUARTZ_FIRED_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP);
create index IX_4BD722BM on QUARTZ_FIRED_TRIGGERS (SCHED_NAME, TRIGGER_GROUP);
create index IX_204D31E8 on QUARTZ_FIRED_TRIGGERS (SCHED_NAME, INSTANCE_NAME);
create index IX_339E078M on QUARTZ_FIRED_TRIGGERS (SCHED_NAME, INSTANCE_NAME, REQUESTS_RECOVERY);
create index IX_5005E3AF on QUARTZ_FIRED_TRIGGERS (SCHED_NAME, JOB_NAME, JOB_GROUP);
create index IX_BC2F03B0 on QUARTZ_FIRED_TRIGGERS (SCHED_NAME, JOB_GROUP);

create index IX_186442A4 on QUARTZ_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, TRIGGER_STATE);
create index IX_1BA1F9DC on QUARTZ_TRIGGERS (SCHED_NAME, TRIGGER_GROUP);
create index IX_91CA7CCE on QUARTZ_TRIGGERS (SCHED_NAME, TRIGGER_GROUP, NEXT_FIRE_TIME, TRIGGER_STATE, MISFIRE_INSTR);
create index IX_D219AFDE on QUARTZ_TRIGGERS (SCHED_NAME, TRIGGER_GROUP, TRIGGER_STATE);
create index IX_A85822A0 on QUARTZ_TRIGGERS (SCHED_NAME, JOB_NAME, JOB_GROUP);
create index IX_8AA50BE1 on QUARTZ_TRIGGERS (SCHED_NAME, JOB_GROUP);
create index IX_EEFE382A on QUARTZ_TRIGGERS (SCHED_NAME, NEXT_FIRE_TIME);
create index IX_F026CF4C on QUARTZ_TRIGGERS (SCHED_NAME, NEXT_FIRE_TIME, TRIGGER_STATE);
create index IX_F2DD7C7E on QUARTZ_TRIGGERS (SCHED_NAME, NEXT_FIRE_TIME, TRIGGER_STATE, MISFIRE_INSTR);
create index IX_1F92813C on QUARTZ_TRIGGERS (SCHED_NAME, NEXT_FIRE_TIME, MISFIRE_INSTR);
create index IX_99108B6E on QUARTZ_TRIGGERS (SCHED_NAME, TRIGGER_STATE);
create index IX_CD7132D0 on QUARTZ_TRIGGERS (SCHED_NAME, CALENDAR_NAME);


commit;
