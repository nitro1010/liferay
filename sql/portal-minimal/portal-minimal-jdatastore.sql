create table Account_ (
	accountId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	parentAccountId bigint,
	name varchar(75) null,
	legalName varchar(75) null,
	legalId varchar(75) null,
	legalType varchar(75) null,
	sicCode varchar(75) null,
	tickerSymbol varchar(75) null,
	industry varchar(75) null,
	type_ varchar(75) null,
	size_ varchar(75) null
);

create table Address (
	addressId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	street1 varchar(75) null,
	street2 varchar(75) null,
	street3 varchar(75) null,
	city varchar(75) null,
	zip varchar(75) null,
	regionId bigint,
	countryId bigint,
	typeId integer,
	mailing boolean,
	primary_ boolean
);

create table AnnouncementsDelivery (
	deliveryId bigint not null primary key,
	companyId bigint,
	userId bigint,
	type_ varchar(75) null,
	email boolean,
	sms boolean,
	website boolean
);

create table AnnouncementsEntry (
	uuid_ varchar(75) null,
	entryId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	title varchar(75) null,
	content long varchar null,
	url long varchar null,
	type_ varchar(75) null,
	displayDate date null,
	expirationDate date null,
	priority integer,
	alert boolean
);

create table AnnouncementsFlag (
	flagId bigint not null primary key,
	userId bigint,
	createDate date null,
	entryId bigint,
	value integer
);

create table AssetCategory (
	uuid_ varchar(75) null,
	categoryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	parentCategoryId bigint,
	leftCategoryId bigint,
	rightCategoryId bigint,
	name varchar(75) null,
	title long varchar null,
	description long varchar null,
	vocabularyId bigint
);

create table AssetCategoryProperty (
	categoryPropertyId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	categoryId bigint,
	key_ varchar(75) null,
	value varchar(75) null
);

create table AssetEntries_AssetCategories (
	entryId bigint not null,
	categoryId bigint not null,
	primary key (entryId, categoryId)
);

create table AssetEntries_AssetTags (
	entryId bigint not null,
	tagId bigint not null,
	primary key (entryId, tagId)
);

create table AssetEntry (
	entryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	classUuid varchar(75) null,
	classTypeId bigint,
	visible boolean,
	startDate date null,
	endDate date null,
	publishDate date null,
	expirationDate date null,
	mimeType varchar(75) null,
	title long varchar null,
	description long varchar null,
	summary long varchar null,
	url long varchar null,
	layoutUuid varchar(75) null,
	height integer,
	width integer,
	priority double,
	viewCount integer
);

create table AssetLink (
	linkId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	entryId1 bigint,
	entryId2 bigint,
	type_ integer,
	weight integer
);

create table AssetTag (
	tagId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	assetCount integer
);

create table AssetTagProperty (
	tagPropertyId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	tagId bigint,
	key_ varchar(75) null,
	value varchar(255) null
);

create table AssetTagStats (
	tagStatsId bigint not null primary key,
	tagId bigint,
	classNameId bigint,
	assetCount integer
);

create table AssetVocabulary (
	uuid_ varchar(75) null,
	vocabularyId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	title long varchar null,
	description long varchar null,
	settings_ long varchar null
);

create table BlogsEntry (
	uuid_ varchar(75) null,
	entryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	title varchar(150) null,
	urlTitle varchar(150) null,
	description varchar(75) null,
	content long varchar null,
	displayDate date null,
	allowPingbacks boolean,
	allowTrackbacks boolean,
	trackbacks long varchar null,
	smallImage boolean,
	smallImageId bigint,
	smallImageURL long varchar null,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table BlogsStatsUser (
	statsUserId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	entryCount integer,
	lastPostDate date null,
	ratingsTotalEntries integer,
	ratingsTotalScore double,
	ratingsAverageScore double
);

create table BookmarksEntry (
	uuid_ varchar(75) null,
	entryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	resourceBlockId bigint,
	folderId bigint,
	name varchar(255) null,
	url long varchar null,
	description long varchar null,
	visits integer,
	priority integer
);

create table BookmarksFolder (
	uuid_ varchar(75) null,
	folderId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	resourceBlockId bigint,
	parentFolderId bigint,
	name varchar(75) null,
	description long varchar null
);

create table BrowserTracker (
	browserTrackerId bigint not null primary key,
	userId bigint,
	browserKey bigint
);

create table CalEvent (
	uuid_ varchar(75) null,
	eventId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	title varchar(75) null,
	description long varchar null,
	location long varchar null,
	startDate date null,
	endDate date null,
	durationHour integer,
	durationMinute integer,
	allDay boolean,
	timeZoneSensitive boolean,
	type_ varchar(75) null,
	repeating boolean,
	recurrence long varchar null,
	remindBy integer,
	firstReminder integer,
	secondReminder integer
);

create table ClassName_ (
	classNameId bigint not null primary key,
	value varchar(200) null
);

create table ClusterGroup (
	clusterGroupId bigint not null primary key,
	name varchar(75) null,
	clusterNodeIds varchar(75) null,
	wholeCluster boolean
);

create table Company (
	companyId bigint not null primary key,
	accountId bigint,
	webId varchar(75) null,
	key_ long varchar null,
	mx varchar(75) null,
	homeURL long varchar null,
	logoId bigint,
	system boolean,
	maxUsers integer,
	active_ boolean
);

create table Contact_ (
	contactId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	accountId bigint,
	parentContactId bigint,
	firstName varchar(75) null,
	middleName varchar(75) null,
	lastName varchar(75) null,
	prefixId integer,
	suffixId integer,
	male boolean,
	birthday date null,
	smsSn varchar(75) null,
	aimSn varchar(75) null,
	facebookSn varchar(75) null,
	icqSn varchar(75) null,
	jabberSn varchar(75) null,
	msnSn varchar(75) null,
	mySpaceSn varchar(75) null,
	skypeSn varchar(75) null,
	twitterSn varchar(75) null,
	ymSn varchar(75) null,
	employeeStatusId varchar(75) null,
	employeeNumber varchar(75) null,
	jobTitle varchar(100) null,
	jobClass varchar(75) null,
	hoursOfOperation varchar(75) null
);

create table Counter (
	name varchar(75) not null primary key,
	currentId bigint
);

create table Country (
	countryId bigint not null primary key,
	name varchar(75) null,
	a2 varchar(75) null,
	a3 varchar(75) null,
	number_ varchar(75) null,
	idd_ varchar(75) null,
	zipRequired boolean,
	active_ boolean
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
	uuid_ varchar(75) null,
	recordId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	versionUserId bigint,
	versionUserName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	DDMStorageId bigint,
	recordSetId bigint,
	version varchar(75) null,
	displayIndex integer
);

create table DDLRecordSet (
	uuid_ varchar(75) null,
	recordSetId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	DDMStructureId bigint,
	recordSetKey varchar(75) null,
	name long varchar null,
	description long varchar null,
	minDisplayRows integer,
	scope integer
);

create table DDLRecordVersion (
	recordVersionId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	DDMStorageId bigint,
	recordSetId bigint,
	recordId bigint,
	version varchar(75) null,
	displayIndex integer,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table DDMContent (
	uuid_ varchar(75) null,
	contentId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name long varchar null,
	description long varchar null,
	xml long varchar null
);

create table DDMStorageLink (
	uuid_ varchar(75) null,
	storageLinkId bigint not null primary key,
	classNameId bigint,
	classPK bigint,
	structureId bigint
);

create table DDMStructure (
	uuid_ varchar(75) null,
	structureId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	structureKey varchar(75) null,
	name long varchar null,
	description long varchar null,
	xsd long varchar null,
	storageType varchar(75) null,
	type_ integer
);

create table DDMStructureLink (
	structureLinkId bigint not null primary key,
	classNameId bigint,
	classPK bigint,
	structureId bigint
);

create table DDMTemplate (
	uuid_ varchar(75) null,
	templateId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	structureId bigint,
	name long varchar null,
	description long varchar null,
	type_ varchar(75) null,
	mode_ varchar(75) null,
	language varchar(75) null,
	script long varchar null
);

create table DLContent (
	contentId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	repositoryId bigint,
	path_ varchar(255) null,
	version varchar(75) null,
	data_ binary,
	size_ bigint
);

create table DLFileEntry (
	uuid_ varchar(75) null,
	fileEntryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	versionUserId bigint,
	versionUserName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	repositoryId bigint,
	folderId bigint,
	name varchar(255) null,
	extension varchar(75) null,
	mimeType varchar(75) null,
	title varchar(255) null,
	description long varchar null,
	extraSettings long varchar null,
	fileEntryTypeId bigint,
	version varchar(75) null,
	size_ bigint,
	readCount integer,
	smallImageId bigint,
	largeImageId bigint,
	custom1ImageId bigint,
	custom2ImageId bigint
);

create table DLFileEntryMetadata (
	uuid_ varchar(75) null,
	fileEntryMetadataId bigint not null primary key,
	DDMStorageId bigint,
	DDMStructureId bigint,
	fileEntryTypeId bigint,
	fileEntryId bigint,
	fileVersionId bigint
);

create table DLFileEntryType (
	uuid_ varchar(75) null,
	fileEntryTypeId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	description long varchar null
);

create table DLFileEntryTypes_DDMStructures (
	fileEntryTypeId bigint not null,
	structureId bigint not null,
	primary key (fileEntryTypeId, structureId)
);

create table DLFileEntryTypes_DLFolders (
	fileEntryTypeId bigint not null,
	folderId bigint not null,
	primary key (fileEntryTypeId, folderId)
);

create table DLFileRank (
	fileRankId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	createDate date null,
	fileEntryId bigint
);

create table DLFileShortcut (
	uuid_ varchar(75) null,
	fileShortcutId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	repositoryId bigint,
	folderId bigint,
	toFileEntryId bigint,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table DLFileVersion (
	fileVersionId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	repositoryId bigint,
	folderId bigint,
	fileEntryId bigint,
	extension varchar(75) null,
	mimeType varchar(75) null,
	title varchar(255) null,
	description long varchar null,
	changeLog varchar(75) null,
	extraSettings long varchar null,
	fileEntryTypeId bigint,
	version varchar(75) null,
	size_ bigint,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table DLFolder (
	uuid_ varchar(75) null,
	folderId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	repositoryId bigint,
	mountPoint boolean,
	parentFolderId bigint,
	name varchar(100) null,
	description long varchar null,
	lastPostDate date null,
	defaultFileEntryTypeId bigint,
	overrideFileEntryTypes boolean
);

create table DLSync (
	syncId bigint not null primary key,
	companyId bigint,
	createDate date null,
	modifiedDate date null,
	fileId bigint,
	fileUuid varchar(75) null,
	repositoryId bigint,
	parentFolderId bigint,
	name varchar(255) null,
	event varchar(75) null,
	type_ varchar(75) null,
	version varchar(75) null
);

create table EmailAddress (
	emailAddressId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	address varchar(75) null,
	typeId integer,
	primary_ boolean
);

create table ExpandoColumn (
	columnId bigint not null primary key,
	companyId bigint,
	tableId bigint,
	name varchar(75) null,
	type_ integer,
	defaultData long varchar null,
	typeSettings long varchar null
);

create table ExpandoRow (
	rowId_ bigint not null primary key,
	companyId bigint,
	tableId bigint,
	classPK bigint
);

create table ExpandoTable (
	tableId bigint not null primary key,
	companyId bigint,
	classNameId bigint,
	name varchar(75) null
);

create table ExpandoValue (
	valueId bigint not null primary key,
	companyId bigint,
	tableId bigint,
	columnId bigint,
	rowId_ bigint,
	classNameId bigint,
	classPK bigint,
	data_ long varchar null
);

create table Group_ (
	groupId bigint not null primary key,
	companyId bigint,
	creatorUserId bigint,
	classNameId bigint,
	classPK bigint,
	parentGroupId bigint,
	liveGroupId bigint,
	name varchar(150) null,
	description long varchar null,
	type_ integer,
	typeSettings long varchar null,
	friendlyURL varchar(100) null,
	site boolean,
	active_ boolean
);

create table Groups_Orgs (
	groupId bigint not null,
	organizationId bigint not null,
	primary key (groupId, organizationId)
);

create table Groups_Permissions (
	groupId bigint not null,
	permissionId bigint not null,
	primary key (groupId, permissionId)
);

create table Groups_Roles (
	groupId bigint not null,
	roleId bigint not null,
	primary key (groupId, roleId)
);

create table Groups_UserGroups (
	groupId bigint not null,
	userGroupId bigint not null,
	primary key (groupId, userGroupId)
);

create table Image (
	imageId bigint not null primary key,
	modifiedDate date null,
	text_ long varchar null,
	type_ varchar(75) null,
	height integer,
	width integer,
	size_ integer
);

create table JournalArticle (
	uuid_ varchar(75) null,
	id_ bigint not null primary key,
	resourcePrimKey bigint,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	articleId varchar(75) null,
	version double,
	title long varchar null,
	urlTitle varchar(150) null,
	description long varchar null,
	content long varchar null,
	type_ varchar(75) null,
	structureId varchar(75) null,
	templateId varchar(75) null,
	layoutUuid varchar(75) null,
	displayDate date null,
	expirationDate date null,
	reviewDate date null,
	indexable boolean,
	smallImage boolean,
	smallImageId bigint,
	smallImageURL long varchar null,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table JournalArticleImage (
	articleImageId bigint not null primary key,
	groupId bigint,
	articleId varchar(75) null,
	version double,
	elInstanceId varchar(75) null,
	elName varchar(75) null,
	languageId varchar(75) null,
	tempImage boolean
);

create table JournalArticleResource (
	uuid_ varchar(75) null,
	resourcePrimKey bigint not null primary key,
	groupId bigint,
	articleId varchar(75) null
);

create table JournalContentSearch (
	contentSearchId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	privateLayout boolean,
	layoutId bigint,
	portletId varchar(200) null,
	articleId varchar(75) null
);

create table JournalFeed (
	uuid_ varchar(75) null,
	id_ bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	feedId varchar(75) null,
	name varchar(75) null,
	description long varchar null,
	type_ varchar(75) null,
	structureId varchar(75) null,
	templateId varchar(75) null,
	rendererTemplateId varchar(75) null,
	delta integer,
	orderByCol varchar(75) null,
	orderByType varchar(75) null,
	targetLayoutFriendlyUrl varchar(255) null,
	targetPortletId varchar(75) null,
	contentField varchar(75) null,
	feedType varchar(75) null,
	feedVersion double
);

create table JournalStructure (
	uuid_ varchar(75) null,
	id_ bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	structureId varchar(75) null,
	parentStructureId varchar(75) null,
	name long varchar null,
	description long varchar null,
	xsd long varchar null
);

create table JournalTemplate (
	uuid_ varchar(75) null,
	id_ bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	templateId varchar(75) null,
	structureId varchar(75) null,
	name long varchar null,
	description long varchar null,
	xsl long varchar null,
	langType varchar(75) null,
	cacheable boolean,
	smallImage boolean,
	smallImageId bigint,
	smallImageURL long varchar null
);

create table Layout (
	uuid_ varchar(75) null,
	plid bigint not null primary key,
	groupId bigint,
	companyId bigint,
	createDate date null,
	modifiedDate date null,
	privateLayout boolean,
	layoutId bigint,
	parentLayoutId bigint,
	name long varchar null,
	title long varchar null,
	description long varchar null,
	keywords long varchar null,
	robots long varchar null,
	type_ varchar(75) null,
	typeSettings long varchar null,
	hidden_ boolean,
	friendlyURL varchar(255) null,
	iconImage boolean,
	iconImageId bigint,
	themeId varchar(75) null,
	colorSchemeId varchar(75) null,
	wapThemeId varchar(75) null,
	wapColorSchemeId varchar(75) null,
	css long varchar null,
	priority integer,
	layoutPrototypeUuid varchar(75) null,
	layoutPrototypeLinkEnabled boolean,
	sourcePrototypeLayoutUuid varchar(75) null
);

create table LayoutBranch (
	LayoutBranchId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	layoutSetBranchId bigint,
	plid bigint,
	name varchar(75) null,
	description long varchar null,
	master boolean
);

create table LayoutPrototype (
	uuid_ varchar(75) null,
	layoutPrototypeId bigint not null primary key,
	companyId bigint,
	name long varchar null,
	description long varchar null,
	settings_ long varchar null,
	active_ boolean
);

create table LayoutRevision (
	layoutRevisionId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	layoutSetBranchId bigint,
	layoutBranchId bigint,
	parentLayoutRevisionId bigint,
	head boolean,
	major boolean,
	plid bigint,
	privateLayout boolean,
	name long varchar null,
	title long varchar null,
	description long varchar null,
	keywords long varchar null,
	robots long varchar null,
	typeSettings long varchar null,
	iconImage boolean,
	iconImageId bigint,
	themeId varchar(75) null,
	colorSchemeId varchar(75) null,
	wapThemeId varchar(75) null,
	wapColorSchemeId varchar(75) null,
	css long varchar null,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table LayoutSet (
	layoutSetId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	createDate date null,
	modifiedDate date null,
	privateLayout boolean,
	logo boolean,
	logoId bigint,
	themeId varchar(75) null,
	colorSchemeId varchar(75) null,
	wapThemeId varchar(75) null,
	wapColorSchemeId varchar(75) null,
	css long varchar null,
	pageCount integer,
	settings_ long varchar null,
	layoutSetPrototypeUuid varchar(75) null,
	layoutSetPrototypeLinkEnabled boolean
);

create table LayoutSetBranch (
	layoutSetBranchId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	privateLayout boolean,
	name varchar(75) null,
	description long varchar null,
	master boolean
);

create table LayoutSetPrototype (
	uuid_ varchar(75) null,
	layoutSetPrototypeId bigint not null primary key,
	companyId bigint,
	createDate date null,
	modifiedDate date null,
	name long varchar null,
	description long varchar null,
	settings_ long varchar null,
	active_ boolean
);

create table ListType (
	listTypeId integer not null primary key,
	name varchar(75) null,
	type_ varchar(75) null
);

create table Lock_ (
	uuid_ varchar(75) null,
	lockId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	className varchar(75) null,
	key_ varchar(200) null,
	owner varchar(255) null,
	inheritable boolean,
	expirationDate date null
);

create table MBBan (
	banId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	banUserId bigint
);

create table MBCategory (
	uuid_ varchar(75) null,
	categoryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	parentCategoryId bigint,
	name varchar(75) null,
	description long varchar null,
	displayStyle varchar(75) null,
	threadCount integer,
	messageCount integer,
	lastPostDate date null
);

create table MBDiscussion (
	discussionId bigint not null primary key,
	classNameId bigint,
	classPK bigint,
	threadId bigint
);

create table MBMailingList (
	uuid_ varchar(75) null,
	mailingListId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	categoryId bigint,
	emailAddress varchar(75) null,
	inProtocol varchar(75) null,
	inServerName varchar(75) null,
	inServerPort integer,
	inUseSSL boolean,
	inUserName varchar(75) null,
	inPassword varchar(75) null,
	inReadInterval integer,
	outEmailAddress varchar(75) null,
	outCustom boolean,
	outServerName varchar(75) null,
	outServerPort integer,
	outUseSSL boolean,
	outUserName varchar(75) null,
	outPassword varchar(75) null,
	allowAnonymous boolean,
	active_ boolean
);

create table MBMessage (
	uuid_ varchar(75) null,
	messageId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	categoryId bigint,
	threadId bigint,
	rootMessageId bigint,
	parentMessageId bigint,
	subject varchar(75) null,
	body long varchar null,
	format varchar(75) null,
	attachments boolean,
	anonymous boolean,
	priority double,
	allowPingbacks boolean,
	answer boolean,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table MBStatsUser (
	statsUserId bigint not null primary key,
	groupId bigint,
	userId bigint,
	messageCount integer,
	lastPostDate date null
);

create table MBThread (
	threadId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	categoryId bigint,
	rootMessageId bigint,
	rootMessageUserId bigint,
	messageCount integer,
	viewCount integer,
	lastPostByUserId bigint,
	lastPostDate date null,
	priority double,
	question boolean,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table MBThreadFlag (
	threadFlagId bigint not null primary key,
	userId bigint,
	modifiedDate date null,
	threadId bigint
);

create table MDRAction (
	uuid_ varchar(75) null,
	actionId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	ruleGroupInstanceId bigint,
	name long varchar null,
	description long varchar null,
	type_ varchar(255) null,
	typeSettings long varchar null
);

create table MDRRule (
	uuid_ varchar(75) null,
	ruleId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ruleGroupId bigint,
	name long varchar null,
	description long varchar null,
	type_ varchar(255) null,
	typeSettings long varchar null
);

create table MDRRuleGroup (
	uuid_ varchar(75) null,
	ruleGroupId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name long varchar null,
	description long varchar null
);

create table MDRRuleGroupInstance (
	uuid_ varchar(75) null,
	ruleGroupInstanceId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	ruleGroupId bigint,
	priority integer
);

create table MembershipRequest (
	membershipRequestId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	createDate date null,
	comments long varchar null,
	replyComments long varchar null,
	replyDate date null,
	replierUserId bigint,
	statusId integer
);

create table Organization_ (
	organizationId bigint not null primary key,
	companyId bigint,
	parentOrganizationId bigint,
	treePath long varchar null,
	name varchar(100) null,
	type_ varchar(75) null,
	recursable boolean,
	regionId bigint,
	countryId bigint,
	statusId integer,
	comments long varchar null
);

create table OrgGroupPermission (
	organizationId bigint not null,
	groupId bigint not null,
	permissionId bigint not null,
	primary key (organizationId, groupId, permissionId)
);

create table OrgGroupRole (
	organizationId bigint not null,
	groupId bigint not null,
	roleId bigint not null,
	primary key (organizationId, groupId, roleId)
);

create table OrgLabor (
	orgLaborId bigint not null primary key,
	organizationId bigint,
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
	passwordPolicyId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	defaultPolicy boolean,
	name varchar(75) null,
	description long varchar null,
	changeable boolean,
	changeRequired boolean,
	minAge bigint,
	checkSyntax boolean,
	allowDictionaryWords boolean,
	minAlphanumeric integer,
	minLength integer,
	minLowerCase integer,
	minNumbers integer,
	minSymbols integer,
	minUpperCase integer,
	history boolean,
	historyCount integer,
	expireable boolean,
	maxAge bigint,
	warningTime bigint,
	graceLimit integer,
	lockout boolean,
	maxFailure integer,
	lockoutDuration bigint,
	requireUnlock boolean,
	resetFailureCount bigint,
	resetTicketMaxAge bigint
);

create table PasswordPolicyRel (
	passwordPolicyRelId bigint not null primary key,
	passwordPolicyId bigint,
	classNameId bigint,
	classPK bigint
);

create table PasswordTracker (
	passwordTrackerId bigint not null primary key,
	userId bigint,
	createDate date null,
	password_ varchar(75) null
);

create table Permission_ (
	permissionId bigint not null primary key,
	companyId bigint,
	actionId varchar(75) null,
	resourceId bigint
);

create table Phone (
	phoneId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	number_ varchar(75) null,
	extension varchar(75) null,
	typeId integer,
	primary_ boolean
);

create table PluginSetting (
	pluginSettingId bigint not null primary key,
	companyId bigint,
	pluginId varchar(75) null,
	pluginType varchar(75) null,
	roles long varchar null,
	active_ boolean
);

create table PollsChoice (
	uuid_ varchar(75) null,
	choiceId bigint not null primary key,
	questionId bigint,
	name varchar(75) null,
	description long varchar null
);

create table PollsQuestion (
	uuid_ varchar(75) null,
	questionId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	title long varchar null,
	description long varchar null,
	expirationDate date null,
	lastVoteDate date null
);

create table PollsVote (
	voteId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	questionId bigint,
	choiceId bigint,
	voteDate date null
);

create table PortalPreferences (
	portalPreferencesId bigint not null primary key,
	ownerId bigint,
	ownerType integer,
	preferences long varchar null
);

create table Portlet (
	id_ bigint not null primary key,
	companyId bigint,
	portletId varchar(200) null,
	roles long varchar null,
	active_ boolean
);

create table PortletItem (
	portletItemId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	portletId varchar(75) null,
	classNameId bigint
);

create table PortletPreferences (
	portletPreferencesId bigint not null primary key,
	ownerId bigint,
	ownerType integer,
	plid bigint,
	portletId varchar(200) null,
	preferences long varchar null
);

create table RatingsEntry (
	entryId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	score double
);

create table RatingsStats (
	statsId bigint not null primary key,
	classNameId bigint,
	classPK bigint,
	totalEntries integer,
	totalScore double,
	averageScore double
);

create table Region (
	regionId bigint not null primary key,
	countryId bigint,
	regionCode varchar(75) null,
	name varchar(75) null,
	active_ boolean
);

create table Release_ (
	releaseId bigint not null primary key,
	createDate date null,
	modifiedDate date null,
	servletContextName varchar(75) null,
	buildNumber integer,
	buildDate date null,
	verified boolean,
	testString varchar(1024) null
);

create table Repository (
	uuid_ varchar(75) null,
	repositoryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	name varchar(75) null,
	description long varchar null,
	portletId varchar(75) null,
	typeSettings long varchar null,
	dlFolderId bigint
);

create table RepositoryEntry (
	uuid_ varchar(75) null,
	repositoryEntryId bigint not null primary key,
	groupId bigint,
	repositoryId bigint,
	mappedId varchar(75) null
);

create table ResourceBlock (
	resourceBlockId bigint not null primary key,
	companyId bigint,
	groupId bigint,
	name varchar(75) null,
	permissionsHash varchar(75) null,
	referenceCount bigint
);

create table ResourceBlockPermission (
	resourceBlockPermissionId bigint not null primary key,
	resourceBlockId bigint,
	roleId bigint,
	actionIds bigint
);

create table ResourceTypePermission (
	resourceTypePermissionId bigint not null primary key,
	companyId bigint,
	groupId bigint,
	name varchar(75) null,
	roleId bigint,
	actionIds bigint
);

create table Resource_ (
	resourceId bigint not null primary key,
	codeId bigint,
	primKey varchar(255) null
);

create table ResourceAction (
	resourceActionId bigint not null primary key,
	name varchar(255) null,
	actionId varchar(75) null,
	bitwiseValue bigint
);

create table ResourceCode (
	codeId bigint not null primary key,
	companyId bigint,
	name varchar(255) null,
	scope integer
);

create table ResourcePermission (
	resourcePermissionId bigint not null primary key,
	companyId bigint,
	name varchar(255) null,
	scope integer,
	primKey varchar(255) null,
	roleId bigint,
	ownerId bigint,
	actionIds bigint
);

create table Role_ (
	roleId bigint not null primary key,
	companyId bigint,
	classNameId bigint,
	classPK bigint,
	name varchar(75) null,
	title long varchar null,
	description long varchar null,
	type_ integer,
	subtype varchar(75) null
);

create table Roles_Permissions (
	roleId bigint not null,
	permissionId bigint not null,
	primary key (roleId, permissionId)
);

create table SCFrameworkVersi_SCProductVers (
	frameworkVersionId bigint not null,
	productVersionId bigint not null,
	primary key (frameworkVersionId, productVersionId)
);

create table SCFrameworkVersion (
	frameworkVersionId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	url long varchar null,
	active_ boolean,
	priority integer
);

create table SCLicense (
	licenseId bigint not null primary key,
	name varchar(75) null,
	url long varchar null,
	openSource boolean,
	active_ boolean,
	recommended boolean
);

create table SCLicenses_SCProductEntries (
	licenseId bigint not null,
	productEntryId bigint not null,
	primary key (licenseId, productEntryId)
);

create table SCProductEntry (
	productEntryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	type_ varchar(75) null,
	tags varchar(255) null,
	shortDescription long varchar null,
	longDescription long varchar null,
	pageURL long varchar null,
	author varchar(75) null,
	repoGroupId varchar(75) null,
	repoArtifactId varchar(75) null
);

create table SCProductScreenshot (
	productScreenshotId bigint not null primary key,
	companyId bigint,
	groupId bigint,
	productEntryId bigint,
	thumbnailId bigint,
	fullImageId bigint,
	priority integer
);

create table SCProductVersion (
	productVersionId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	productEntryId bigint,
	version varchar(75) null,
	changeLog long varchar null,
	downloadPageURL long varchar null,
	directDownloadURL varchar(2000) null,
	repoStoreArtifact boolean
);

create table ServiceComponent (
	serviceComponentId bigint not null primary key,
	buildNamespace varchar(75) null,
	buildNumber bigint,
	buildDate bigint,
	data_ long varchar null
);

create table Shard (
	shardId bigint not null primary key,
	classNameId bigint,
	classPK bigint,
	name varchar(75) null
);

create table ShoppingCart (
	cartId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	itemIds long varchar null,
	couponCodes varchar(75) null,
	altShipping integer,
	insure boolean
);

create table ShoppingCategory (
	categoryId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	parentCategoryId bigint,
	name varchar(75) null,
	description long varchar null
);

create table ShoppingCoupon (
	couponId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	code_ varchar(75) null,
	name varchar(75) null,
	description long varchar null,
	startDate date null,
	endDate date null,
	active_ boolean,
	limitCategories long varchar null,
	limitSkus long varchar null,
	minOrder double,
	discount double,
	discountType varchar(75) null
);

create table ShoppingItem (
	itemId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	categoryId bigint,
	sku varchar(75) null,
	name varchar(200) null,
	description long varchar null,
	properties long varchar null,
	fields_ boolean,
	fieldsQuantities long varchar null,
	minQuantity integer,
	maxQuantity integer,
	price double,
	discount double,
	taxable boolean,
	shipping double,
	useShippingFormula boolean,
	requiresShipping boolean,
	stockQuantity integer,
	featured_ boolean,
	sale_ boolean,
	smallImage boolean,
	smallImageId bigint,
	smallImageURL long varchar null,
	mediumImage boolean,
	mediumImageId bigint,
	mediumImageURL long varchar null,
	largeImage boolean,
	largeImageId bigint,
	largeImageURL long varchar null
);

create table ShoppingItemField (
	itemFieldId bigint not null primary key,
	itemId bigint,
	name varchar(75) null,
	values_ long varchar null,
	description long varchar null
);

create table ShoppingItemPrice (
	itemPriceId bigint not null primary key,
	itemId bigint,
	minQuantity integer,
	maxQuantity integer,
	price double,
	discount double,
	taxable boolean,
	shipping double,
	useShippingFormula boolean,
	status integer
);

create table ShoppingOrder (
	orderId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	number_ varchar(75) null,
	tax double,
	shipping double,
	altShipping varchar(75) null,
	requiresShipping boolean,
	insure boolean,
	insurance double,
	couponCodes varchar(75) null,
	couponDiscount double,
	billingFirstName varchar(75) null,
	billingLastName varchar(75) null,
	billingEmailAddress varchar(75) null,
	billingCompany varchar(75) null,
	billingStreet varchar(75) null,
	billingCity varchar(75) null,
	billingState varchar(75) null,
	billingZip varchar(75) null,
	billingCountry varchar(75) null,
	billingPhone varchar(75) null,
	shipToBilling boolean,
	shippingFirstName varchar(75) null,
	shippingLastName varchar(75) null,
	shippingEmailAddress varchar(75) null,
	shippingCompany varchar(75) null,
	shippingStreet varchar(75) null,
	shippingCity varchar(75) null,
	shippingState varchar(75) null,
	shippingZip varchar(75) null,
	shippingCountry varchar(75) null,
	shippingPhone varchar(75) null,
	ccName varchar(75) null,
	ccType varchar(75) null,
	ccNumber varchar(75) null,
	ccExpMonth integer,
	ccExpYear integer,
	ccVerNumber varchar(75) null,
	comments long varchar null,
	ppTxnId varchar(75) null,
	ppPaymentStatus varchar(75) null,
	ppPaymentGross double,
	ppReceiverEmail varchar(75) null,
	ppPayerEmail varchar(75) null,
	sendOrderEmail boolean,
	sendShippingEmail boolean
);

create table ShoppingOrderItem (
	orderItemId bigint not null primary key,
	orderId bigint,
	itemId varchar(75) null,
	sku varchar(75) null,
	name varchar(200) null,
	description long varchar null,
	properties long varchar null,
	price double,
	quantity integer,
	shippedDate date null
);

create table SocialActivity (
	activityId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	createDate bigint,
	mirrorActivityId bigint,
	classNameId bigint,
	classPK bigint,
	type_ integer,
	extraData long varchar null,
	receiverUserId bigint
);

create table SocialActivityAchievement (
	activityAchievementId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	createDate bigint,
	name varchar(75) null,
	firstInGroup boolean
);

create table SocialActivityCounter (
	activityCounterId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	classNameId bigint,
	classPK bigint,
	name varchar(75) null,
	ownerType integer,
	currentValue integer,
	totalValue integer,
	graceValue integer,
	startPeriod integer,
	endPeriod integer
);

create table SocialActivityLimit (
	activityLimitId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	classNameId bigint,
	classPK bigint,
	activityType integer,
	activityCounterName varchar(75) null,
	value varchar(75) null
);

create table SocialActivitySetting (
	activitySettingId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	classNameId bigint,
	activityType integer,
	name varchar(75) null,
	value varchar(1024) null
);

create table SocialRelation (
	uuid_ varchar(75) null,
	relationId bigint not null primary key,
	companyId bigint,
	createDate bigint,
	userId1 bigint,
	userId2 bigint,
	type_ integer
);

create table SocialRequest (
	uuid_ varchar(75) null,
	requestId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	createDate bigint,
	modifiedDate bigint,
	classNameId bigint,
	classPK bigint,
	type_ integer,
	extraData long varchar null,
	receiverUserId bigint,
	status integer
);

create table Subscription (
	subscriptionId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	frequency varchar(75) null
);

create table Team (
	teamId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	groupId bigint,
	name varchar(75) null,
	description long varchar null
);

create table Ticket (
	ticketId bigint not null primary key,
	companyId bigint,
	createDate date null,
	classNameId bigint,
	classPK bigint,
	key_ varchar(75) null,
	type_ integer,
	extraInfo long varchar null,
	expirationDate date null
);

create table User_ (
	uuid_ varchar(75) null,
	userId bigint not null primary key,
	companyId bigint,
	createDate date null,
	modifiedDate date null,
	defaultUser boolean,
	contactId bigint,
	password_ varchar(75) null,
	passwordEncrypted boolean,
	passwordReset boolean,
	passwordModifiedDate date null,
	digest varchar(255) null,
	reminderQueryQuestion varchar(75) null,
	reminderQueryAnswer varchar(75) null,
	graceLoginCount integer,
	screenName varchar(75) null,
	emailAddress varchar(75) null,
	facebookId bigint,
	openId varchar(1024) null,
	portraitId bigint,
	languageId varchar(75) null,
	timeZoneId varchar(75) null,
	greeting varchar(255) null,
	comments long varchar null,
	firstName varchar(75) null,
	middleName varchar(75) null,
	lastName varchar(75) null,
	jobTitle varchar(100) null,
	loginDate date null,
	loginIP varchar(75) null,
	lastLoginDate date null,
	lastLoginIP varchar(75) null,
	lastFailedLoginDate date null,
	failedLoginAttempts integer,
	lockout boolean,
	lockoutDate date null,
	agreedToTermsOfUse boolean,
	emailAddressVerified boolean,
	status integer
);

create table UserGroup (
	userGroupId bigint not null primary key,
	companyId bigint,
	parentUserGroupId bigint,
	name varchar(75) null,
	description long varchar null,
	addedByLDAPImport boolean
);

create table UserGroupGroupRole (
	userGroupId bigint not null,
	groupId bigint not null,
	roleId bigint not null,
	primary key (userGroupId, groupId, roleId)
);

create table UserGroupRole (
	userId bigint not null,
	groupId bigint not null,
	roleId bigint not null,
	primary key (userId, groupId, roleId)
);

create table UserGroups_Teams (
	userGroupId bigint not null,
	teamId bigint not null,
	primary key (userGroupId, teamId)
);

create table UserIdMapper (
	userIdMapperId bigint not null primary key,
	userId bigint,
	type_ varchar(75) null,
	description varchar(75) null,
	externalUserId varchar(75) null
);

create table UserNotificationEvent (
	uuid_ varchar(75) null,
	userNotificationEventId bigint not null primary key,
	companyId bigint,
	userId bigint,
	type_ varchar(75) null,
	timestamp bigint,
	deliverBy bigint,
	payload long varchar null,
	archived boolean
);

create table Users_Groups (
	userId bigint not null,
	groupId bigint not null,
	primary key (userId, groupId)
);

create table Users_Orgs (
	userId bigint not null,
	organizationId bigint not null,
	primary key (userId, organizationId)
);

create table Users_Permissions (
	userId bigint not null,
	permissionId bigint not null,
	primary key (userId, permissionId)
);

create table Users_Roles (
	userId bigint not null,
	roleId bigint not null,
	primary key (userId, roleId)
);

create table Users_Teams (
	userId bigint not null,
	teamId bigint not null,
	primary key (userId, teamId)
);

create table Users_UserGroups (
	userGroupId bigint not null,
	userId bigint not null,
	primary key (userGroupId, userId)
);

create table UserTracker (
	userTrackerId bigint not null primary key,
	companyId bigint,
	userId bigint,
	modifiedDate date null,
	sessionId varchar(200) null,
	remoteAddr varchar(75) null,
	remoteHost varchar(75) null,
	userAgent varchar(200) null
);

create table UserTrackerPath (
	userTrackerPathId bigint not null primary key,
	userTrackerId bigint,
	path_ long varchar null,
	pathDate date null
);

create table VirtualHost (
	virtualHostId bigint not null primary key,
	companyId bigint,
	layoutSetId bigint,
	hostname varchar(75) null
);

create table Vocabulary (
	vocabularyId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	description varchar(75) null,
	folksonomy boolean
);

create table WebDAVProps (
	webDavPropsId bigint not null primary key,
	companyId bigint,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	props long varchar null
);

create table Website (
	websiteId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	url long varchar null,
	typeId integer,
	primary_ boolean
);

create table WikiNode (
	uuid_ varchar(75) null,
	nodeId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	description long varchar null,
	lastPostDate date null
);

create table WikiPage (
	uuid_ varchar(75) null,
	pageId bigint not null primary key,
	resourcePrimKey bigint,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	nodeId bigint,
	title varchar(255) null,
	version double,
	minorEdit boolean,
	content long varchar null,
	summary long varchar null,
	format varchar(75) null,
	head boolean,
	parentTitle varchar(255) null,
	redirectTitle varchar(255) null,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate date null
);

create table WikiPageResource (
	uuid_ varchar(75) null,
	resourcePrimKey bigint not null primary key,
	nodeId bigint,
	title varchar(255) null
);

create table WorkflowDefinitionLink (
	workflowDefinitionLinkId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	typePK bigint,
	workflowDefinitionName varchar(75) null,
	workflowDefinitionVersion integer
);

create table WorkflowInstanceLink (
	workflowInstanceLinkId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	classNameId bigint,
	classPK bigint,
	workflowInstanceId bigint
);


insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (1, 'Canada', 'CA', 'CAN', '124', '001', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (2, 'China', 'CN', 'CHN', '156', '086', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (3, 'France', 'FR', 'FRA', '250', '033', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (4, 'Germany', 'DE', 'DEU', '276', '049', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (5, 'Hong Kong', 'HK', 'HKG', '344', '852', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (6, 'Hungary', 'HU', 'HUN', '348', '036', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (7, 'Israel', 'IL', 'ISR', '376', '972', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (8, 'Italy', 'IT', 'ITA', '380', '039', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (9, 'Japan', 'JP', 'JPN', '392', '081', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (10, 'South Korea', 'KR', 'KOR', '410', '082', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (11, 'Netherlands', 'NL', 'NLD', '528', '031', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (12, 'Portugal', 'PT', 'PRT', '620', '351', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (13, 'Russia', 'RU', 'RUS', '643', '007', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (14, 'Singapore', 'SG', 'SGP', '702', '065', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (15, 'Spain', 'ES', 'ESP', '724', '034', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (16, 'Turkey', 'TR', 'TUR', '792', '090', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (17, 'Vietnam', 'VN', 'VNM', '704', '084', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (18, 'United Kingdom', 'GB', 'GBR', '826', '044', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (19, 'United States', 'US', 'USA', '840', '001', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (20, 'Afghanistan', 'AF', 'AFG', '4', '093', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (21, 'Albania', 'AL', 'ALB', '8', '355', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (22, 'Algeria', 'DZ', 'DZA', '12', '213', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (23, 'American Samoa', 'AS', 'ASM', '16', '684', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (24, 'Andorra', 'AD', 'AND', '20', '376', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (25, 'Angola', 'AO', 'AGO', '24', '244', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (26, 'Anguilla', 'AI', 'AIA', '660', '264', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (27, 'Antarctica', 'AQ', 'ATA', '10', '672', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (28, 'Antigua', 'AG', 'ATG', '28', '268', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (29, 'Argentina', 'AR', 'ARG', '32', '054', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (30, 'Armenia', 'AM', 'ARM', '51', '374', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (31, 'Aruba', 'AW', 'ABW', '533', '297', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (32, 'Australia', 'AU', 'AUS', '36', '061', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (33, 'Austria', 'AT', 'AUT', '40', '043', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (34, 'Azerbaijan', 'AZ', 'AZE', '31', '994', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (35, 'Bahamas', 'BS', 'BHS', '44', '242', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (36, 'Bahrain', 'BH', 'BHR', '48', '973', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (37, 'Bangladesh', 'BD', 'BGD', '50', '880', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (38, 'Barbados', 'BB', 'BRB', '52', '246', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (39, 'Belarus', 'BY', 'BLR', '112', '375', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (40, 'Belgium', 'BE', 'BEL', '56', '032', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (41, 'Belize', 'BZ', 'BLZ', '84', '501', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (42, 'Benin', 'BJ', 'BEN', '204', '229', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (43, 'Bermuda', 'BM', 'BMU', '60', '441', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (44, 'Bhutan', 'BT', 'BTN', '64', '975', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (45, 'Bolivia', 'BO', 'BOL', '68', '591', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (46, 'Bosnia-Herzegovina', 'BA', 'BIH', '70', '387', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (47, 'Botswana', 'BW', 'BWA', '72', '267', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (48, 'Brazil', 'BR', 'BRA', '76', '055', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (49, 'British Virgin Islands', 'VG', 'VGB', '92', '284', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (50, 'Brunei', 'BN', 'BRN', '96', '673', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (51, 'Bulgaria', 'BG', 'BGR', '100', '359', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (52, 'Burkina Faso', 'BF', 'BFA', '854', '226', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (53, 'Burma (Myanmar)', 'MM', 'MMR', '104', '095', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (54, 'Burundi', 'BI', 'BDI', '108', '257', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (55, 'Cambodia', 'KH', 'KHM', '116', '855', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (56, 'Cameroon', 'CM', 'CMR', '120', '237', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (57, 'Cape Verde Island', 'CV', 'CPV', '132', '238', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (58, 'Cayman Islands', 'KY', 'CYM', '136', '345', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (59, 'Central African Republic', 'CF', 'CAF', '140', '236', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (60, 'Chad', 'TD', 'TCD', '148', '235', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (61, 'Chile', 'CL', 'CHL', '152', '056', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (62, 'Christmas Island', 'CX', 'CXR', '162', '061', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (63, 'Cocos Islands', 'CC', 'CCK', '166', '061', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (64, 'Colombia', 'CO', 'COL', '170', '057', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (65, 'Comoros', 'KM', 'COM', '174', '269', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (66, 'Republic of Congo', 'CD', 'COD', '180', '242', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (67, 'Democratic Republic of Congo', 'CG', 'COG', '178', '243', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (68, 'Cook Islands', 'CK', 'COK', '184', '682', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (69, 'Costa Rica', 'CR', 'CRI', '188', '506', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (70, 'Croatia', 'HR', 'HRV', '191', '385', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (71, 'Cuba', 'CU', 'CUB', '192', '053', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (72, 'Cyprus', 'CY', 'CYP', '196', '357', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (73, 'Czech Republic', 'CZ', 'CZE', '203', '420', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (74, 'Denmark', 'DK', 'DNK', '208', '045', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (75, 'Djibouti', 'DJ', 'DJI', '262', '253', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (76, 'Dominica', 'DM', 'DMA', '212', '767', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (77, 'Dominican Republic', 'DO', 'DOM', '214', '809', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (78, 'Ecuador', 'EC', 'ECU', '218', '593', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (79, 'Egypt', 'EG', 'EGY', '818', '020', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (80, 'El Salvador', 'SV', 'SLV', '222', '503', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (81, 'Equatorial Guinea', 'GQ', 'GNQ', '226', '240', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (82, 'Eritrea', 'ER', 'ERI', '232', '291', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (83, 'Estonia', 'EE', 'EST', '233', '372', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (84, 'Ethiopia', 'ET', 'ETH', '231', '251', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (85, 'Faeroe Islands', 'FO', 'FRO', '234', '298', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (86, 'Falkland Islands', 'FK', 'FLK', '238', '500', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (87, 'Fiji Islands', 'FJ', 'FJI', '242', '679', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (88, 'Finland', 'FI', 'FIN', '246', '358', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (89, 'French Guiana', 'GF', 'GUF', '254', '594', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (90, 'French Polynesia', 'PF', 'PYF', '258', '689', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (91, 'Gabon', 'GA', 'GAB', '266', '241', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (92, 'Gambia', 'GM', 'GMB', '270', '220', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (93, 'Georgia', 'GE', 'GEO', '268', '995', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (94, 'Ghana', 'GH', 'GHA', '288', '233', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (95, 'Gibraltar', 'GI', 'GIB', '292', '350', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (96, 'Greece', 'GR', 'GRC', '300', '030', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (97, 'Greenland', 'GL', 'GRL', '304', '299', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (98, 'Grenada', 'GD', 'GRD', '308', '473', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (99, 'Guadeloupe', 'GP', 'GLP', '312', '590', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (100, 'Guam', 'GU', 'GUM', '316', '671', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (101, 'Guatemala', 'GT', 'GTM', '320', '502', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (102, 'Guinea', 'GN', 'GIN', '324', '224', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (103, 'Guinea-Bissau', 'GW', 'GNB', '624', '245', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (104, 'Guyana', 'GY', 'GUY', '328', '592', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (105, 'Haiti', 'HT', 'HTI', '332', '509', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (106, 'Honduras', 'HN', 'HND', '340', '504', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (107, 'Iceland', 'IS', 'ISL', '352', '354', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (108, 'India', 'IN', 'IND', '356', '091', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (109, 'Indonesia', 'ID', 'IDN', '360', '062', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (110, 'Iran', 'IR', 'IRN', '364', '098', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (111, 'Iraq', 'IQ', 'IRQ', '368', '964', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (112, 'Ireland', 'IE', 'IRL', '372', '353', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (113, 'Ivory Coast', 'CI', 'CIV', '384', '225', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (114, 'Jamaica', 'JM', 'JAM', '388', '876', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (115, 'Jordan', 'JO', 'JOR', '400', '962', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (116, 'Kazakhstan', 'KZ', 'KAZ', '398', '007', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (117, 'Kenya', 'KE', 'KEN', '404', '254', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (118, 'Kiribati', 'KI', 'KIR', '408', '686', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (119, 'Kuwait', 'KW', 'KWT', '414', '965', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (120, 'North Korea', 'KP', 'PRK', '408', '850', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (121, 'Kyrgyzstan', 'KG', 'KGZ', '471', '996', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (122, 'Laos', 'LA', 'LAO', '418', '856', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (123, 'Latvia', 'LV', 'LVA', '428', '371', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (124, 'Lebanon', 'LB', 'LBN', '422', '961', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (125, 'Lesotho', 'LS', 'LSO', '426', '266', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (126, 'Liberia', 'LR', 'LBR', '430', '231', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (127, 'Libya', 'LY', 'LBY', '434', '218', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (128, 'Liechtenstein', 'LI', 'LIE', '438', '423', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (129, 'Lithuania', 'LT', 'LTU', '440', '370', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (130, 'Luxembourg', 'LU', 'LUX', '442', '352', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (131, 'Macau', 'MO', 'MAC', '446', '853', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (132, 'Macedonia', 'MK', 'MKD', '807', '389', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (133, 'Madagascar', 'MG', 'MDG', '450', '261', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (134, 'Malawi', 'MW', 'MWI', '454', '265', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (135, 'Malaysia', 'MY', 'MYS', '458', '060', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (136, 'Maldives', 'MV', 'MDV', '462', '960', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (137, 'Mali', 'ML', 'MLI', '466', '223', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (138, 'Malta', 'MT', 'MLT', '470', '356', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (139, 'Marshall Islands', 'MH', 'MHL', '584', '692', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (140, 'Martinique', 'MQ', 'MTQ', '474', '596', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (141, 'Mauritania', 'MR', 'MRT', '478', '222', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (142, 'Mauritius', 'MU', 'MUS', '480', '230', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (143, 'Mayotte Island', 'YT', 'MYT', '175', '269', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (144, 'Mexico', 'MX', 'MEX', '484', '052', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (145, 'Micronesia', 'FM', 'FSM', '583', '691', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (146, 'Moldova', 'MD', 'MDA', '498', '373', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (147, 'Monaco', 'MC', 'MCO', '492', '377', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (148, 'Mongolia', 'MN', 'MNG', '496', '976', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (149, 'Montenegro', 'ME', 'MNE', '499', '382', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (150, 'Montserrat', 'MS', 'MSR', '500', '664', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (151, 'Morocco', 'MA', 'MAR', '504', '212', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (152, 'Mozambique', 'MZ', 'MOZ', '508', '258', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (153, 'Namibia', 'NA', 'NAM', '516', '264', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (154, 'Nauru', 'NR', 'NRU', '520', '674', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (155, 'Nepal', 'NP', 'NPL', '524', '977', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (156, 'Netherlands Antilles', 'AN', 'ANT', '530', '599', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (157, 'New Caledonia', 'NC', 'NCL', '540', '687', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (158, 'New Zealand', 'NZ', 'NZL', '554', '064', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (159, 'Nicaragua', 'NI', 'NIC', '558', '505', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (160, 'Niger', 'NE', 'NER', '562', '227', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (161, 'Nigeria', 'NG', 'NGA', '566', '234', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (162, 'Niue', 'NU', 'NIU', '570', '683', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (163, 'Norfolk Island', 'NF', 'NFK', '574', '672', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (164, 'Norway', 'NO', 'NOR', '578', '047', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (165, 'Oman', 'OM', 'OMN', '512', '968', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (166, 'Pakistan', 'PK', 'PAK', '586', '092', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (167, 'Palau', 'PW', 'PLW', '585', '680', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (168, 'Palestine', 'PS', 'PSE', '275', '970', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (169, 'Panama', 'PA', 'PAN', '591', '507', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (170, 'Papua New Guinea', 'PG', 'PNG', '598', '675', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (171, 'Paraguay', 'PY', 'PRY', '600', '595', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (172, 'Peru', 'PE', 'PER', '604', '051', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (173, 'Philippines', 'PH', 'PHL', '608', '063', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (174, 'Poland', 'PL', 'POL', '616', '048', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (175, 'Puerto Rico', 'PR', 'PRI', '630', '787', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (176, 'Qatar', 'QA', 'QAT', '634', '974', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (177, 'Reunion Island', 'RE', 'REU', '638', '262', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (178, 'Romania', 'RO', 'ROU', '642', '040', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (179, 'Rwanda', 'RW', 'RWA', '646', '250', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (180, 'St. Helena', 'SH', 'SHN', '654', '290', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (181, 'St. Kitts', 'KN', 'KNA', '659', '869', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (182, 'St. Lucia', 'LC', 'LCA', '662', '758', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (183, 'St. Pierre & Miquelon', 'PM', 'SPM', '666', '508', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (184, 'St. Vincent', 'VC', 'VCT', '670', '784', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (185, 'San Marino', 'SM', 'SMR', '674', '378', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (186, 'Sao Tome & Principe', 'ST', 'STP', '678', '239', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (187, 'Saudi Arabia', 'SA', 'SAU', '682', '966', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (188, 'Senegal', 'SN', 'SEN', '686', '221', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (189, 'Serbia', 'RS', 'SRB', '688', '381', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (190, 'Seychelles', 'SC', 'SYC', '690', '248', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (191, 'Sierra Leone', 'SL', 'SLE', '694', '249', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (192, 'Slovakia', 'SK', 'SVK', '703', '421', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (193, 'Slovenia', 'SI', 'SVN', '705', '386', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (194, 'Solomon Islands', 'SB', 'SLB', '90', '677', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (195, 'Somalia', 'SO', 'SOM', '706', '252', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (196, 'South Africa', 'ZA', 'ZAF', '710', '027', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (197, 'Sri Lanka', 'LK', 'LKA', '144', '094', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (198, 'Sudan', 'SD', 'SDN', '736', '095', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (199, 'Suriname', 'SR', 'SUR', '740', '597', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (200, 'Swaziland', 'SZ', 'SWZ', '748', '268', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (201, 'Sweden', 'SE', 'SWE', '752', '046', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (202, 'Switzerland', 'CH', 'CHE', '756', '041', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (203, 'Syria', 'SY', 'SYR', '760', '963', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (204, 'Taiwan', 'TW', 'TWN', '158', '886', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (205, 'Tajikistan', 'TJ', 'TJK', '762', '992', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (206, 'Tanzania', 'TZ', 'TZA', '834', '255', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (207, 'Thailand', 'TH', 'THA', '764', '066', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (208, 'Togo', 'TG', 'TGO', '768', '228', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (209, 'Tonga', 'TO', 'TON', '776', '676', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (210, 'Trinidad & Tobago', 'TT', 'TTO', '780', '868', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (211, 'Tunisia', 'TN', 'TUN', '788', '216', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (212, 'Turkmenistan', 'TM', 'TKM', '795', '993', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (213, 'Turks & Caicos', 'TC', 'TCA', '796', '649', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (214, 'Tuvalu', 'TV', 'TUV', '798', '688', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (215, 'Uganda', 'UG', 'UGA', '800', '256', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (216, 'Ukraine', 'UA', 'UKR', '804', '380', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (217, 'United Arab Emirates', 'AE', 'ARE', '784', '971', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (218, 'Uruguay', 'UY', 'URY', '858', '598', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (219, 'Uzbekistan', 'UZ', 'UZB', '860', '998', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (220, 'Vanuatu', 'VU', 'VUT', '548', '678', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (221, 'Vatican City', 'VA', 'VAT', '336', '039', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (222, 'Venezuela', 'VE', 'VEN', '862', '058', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (223, 'Wallis & Futuna', 'WF', 'WLF', '876', '681', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (224, 'Western Samoa', 'EH', 'ESH', '732', '685', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (225, 'Yemen', 'YE', 'YEM', '887', '967', FALSE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (226, 'Zambia', 'ZM', 'ZMB', '894', '260', TRUE, TRUE);
insert into Country (countryId, name, a2, a3, number_, idd_, zipRequired, active_) values (227, 'Zimbabwe', 'ZW', 'ZWE', '716', '263', FALSE, TRUE);

insert into Region (regionId, countryId, regionCode, name, active_) values (1001, 1, 'AB', 'Alberta', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1002, 1, 'BC', 'British Columbia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1003, 1, 'MB', 'Manitoba', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1004, 1, 'NB', 'New Brunswick', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1005, 1, 'NL', 'Newfoundland and Labrador', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1006, 1, 'NT', 'Northwest Territories', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1007, 1, 'NS', 'Nova Scotia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1008, 1, 'NU', 'Nunavut', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1009, 1, 'ON', 'Ontario', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1010, 1, 'PE', 'Prince Edward Island', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1011, 1, 'QC', 'Quebec', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1012, 1, 'SK', 'Saskatchewan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (1013, 1, 'YT', 'Yukon', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2001, 2, 'CN-34', 'Anhui', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2002, 2, 'CN-92', 'Aomen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2003, 2, 'CN-11', 'Beijing', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2004, 2, 'CN-50', 'Chongqing', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2005, 2, 'CN-35', 'Fujian', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2006, 2, 'CN-62', 'Gansu', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2007, 2, 'CN-44', 'Guangdong', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2008, 2, 'CN-45', 'Guangxi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2009, 2, 'CN-52', 'Guizhou', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2010, 2, 'CN-46', 'Hainan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2011, 2, 'CN-13', 'Hebei', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2012, 2, 'CN-23', 'Heilongjiang', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2013, 2, 'CN-41', 'Henan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2014, 2, 'CN-42', 'Hubei', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2015, 2, 'CN-43', 'Hunan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2016, 2, 'CN-32', 'Jiangsu', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2017, 2, 'CN-36', 'Jiangxi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2018, 2, 'CN-22', 'Jilin', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2019, 2, 'CN-21', 'Liaoning', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2020, 2, 'CN-15', 'Nei Mongol', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2021, 2, 'CN-64', 'Ningxia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2022, 2, 'CN-63', 'Qinghai', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2023, 2, 'CN-61', 'Shaanxi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2024, 2, 'CN-37', 'Shandong', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2025, 2, 'CN-31', 'Shanghai', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2026, 2, 'CN-14', 'Shanxi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2027, 2, 'CN-51', 'Sichuan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2028, 2, 'CN-71', 'Taiwan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2029, 2, 'CN-12', 'Tianjin', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2030, 2, 'CN-91', 'Xianggang', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2031, 2, 'CN-65', 'Xinjiang', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2032, 2, 'CN-54', 'Xizang', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2033, 2, 'CN-53', 'Yunnan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (2034, 2, 'CN-33', 'Zhejiang', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3001, 3, 'A', 'Alsace', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3002, 3, 'B', 'Aquitaine', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3003, 3, 'C', 'Auvergne', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3004, 3, 'P', 'Basse-Normandie', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3005, 3, 'D', 'Bourgogne', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3006, 3, 'E', 'Bretagne', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3007, 3, 'F', 'Centre', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3008, 3, 'G', 'Champagne-Ardenne', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3009, 3, 'H', 'Corse', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3010, 3, 'GF', 'Guyane', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3011, 3, 'I', 'Franche Comté', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3012, 3, 'GP', 'Guadeloupe', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3013, 3, 'Q', 'Haute-Normandie', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3014, 3, 'J', 'Île-de-France', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3015, 3, 'K', 'Languedoc-Roussillon', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3016, 3, 'L', 'Limousin', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3017, 3, 'M', 'Lorraine', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3018, 3, 'MQ', 'Martinique', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3019, 3, 'N', 'Midi-Pyrénées', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3020, 3, 'O', 'Nord Pas de Calais', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3021, 3, 'R', 'Pays de la Loire', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3022, 3, 'S', 'Picardie', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3023, 3, 'T', 'Poitou-Charentes', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3024, 3, 'U', 'Provence-Alpes-Côte-d''Azur', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3025, 3, 'RE', 'Réunion', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (3026, 3, 'V', 'Rhône-Alpes', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4001, 4, 'BW', 'Baden-Württemberg', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4002, 4, 'BY', 'Bayern', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4003, 4, 'BE', 'Berlin', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4004, 4, 'BR', 'Brandenburg', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4005, 4, 'HB', 'Bremen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4006, 4, 'HH', 'Hamburg', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4007, 4, 'HE', 'Hessen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4008, 4, 'MV', 'Mecklenburg-Vorpommern', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4009, 4, 'NI', 'Niedersachsen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4010, 4, 'NW', 'Nordrhein-Westfalen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4011, 4, 'RP', 'Rheinland-Pfalz', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4012, 4, 'SL', 'Saarland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4013, 4, 'SN', 'Sachsen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4014, 4, 'ST', 'Sachsen-Anhalt', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4015, 4, 'SH', 'Schleswig-Holstein', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (4016, 4, 'TH', 'Thüringen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8001, 8, 'AG', 'Agrigento', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8002, 8, 'AL', 'Alessandria', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8003, 8, 'AN', 'Ancona', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8004, 8, 'AO', 'Aosta', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8005, 8, 'AR', 'Arezzo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8006, 8, 'AP', 'Ascoli Piceno', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8007, 8, 'AT', 'Asti', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8008, 8, 'AV', 'Avellino', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8009, 8, 'BA', 'Bari', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8010, 8, 'BT', 'Barletta-Andria-Trani', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8011, 8, 'BL', 'Belluno', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8012, 8, 'BN', 'Benevento', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8013, 8, 'BG', 'Bergamo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8014, 8, 'BI', 'Biella', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8015, 8, 'BO', 'Bologna', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8016, 8, 'BZ', 'Bolzano', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8017, 8, 'BS', 'Brescia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8018, 8, 'BR', 'Brindisi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8019, 8, 'CA', 'Cagliari', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8020, 8, 'CL', 'Caltanissetta', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8021, 8, 'CB', 'Campobasso', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8022, 8, 'CI', 'Carbonia-Iglesias', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8023, 8, 'CE', 'Caserta', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8024, 8, 'CT', 'Catania', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8025, 8, 'CZ', 'Catanzaro', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8026, 8, 'CH', 'Chieti', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8027, 8, 'CO', 'Como', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8028, 8, 'CS', 'Cosenza', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8029, 8, 'CR', 'Cremona', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8030, 8, 'KR', 'Crotone', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8031, 8, 'CN', 'Cuneo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8032, 8, 'EN', 'Enna', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8033, 8, 'FM', 'Fermo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8034, 8, 'FE', 'Ferrara', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8035, 8, 'FI', 'Firenze', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8036, 8, 'FG', 'Foggia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8037, 8, 'FC', 'Forli-Cesena', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8038, 8, 'FR', 'Frosinone', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8039, 8, 'GE', 'Genova', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8040, 8, 'GO', 'Gorizia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8041, 8, 'GR', 'Grosseto', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8042, 8, 'IM', 'Imperia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8043, 8, 'IS', 'Isernia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8044, 8, 'AQ', 'L''Aquila', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8045, 8, 'SP', 'La Spezia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8046, 8, 'LT', 'Latina', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8047, 8, 'LE', 'Lecce', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8048, 8, 'LC', 'Lecco', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8049, 8, 'LI', 'Livorno', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8050, 8, 'LO', 'Lodi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8051, 8, 'LU', 'Lucca', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8052, 8, 'MC', 'Macerata', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8053, 8, 'MN', 'Mantova', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8054, 8, 'MS', 'Massa-Carrara', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8055, 8, 'MT', 'Matera', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8056, 8, 'MA', 'Medio Campidano', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8057, 8, 'ME', 'Messina', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8058, 8, 'MI', 'Milano', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8059, 8, 'MO', 'Modena', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8060, 8, 'MZ', 'Monza', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8061, 8, 'NA', 'Napoli', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8062, 8, 'NO', 'Novara', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8063, 8, 'NU', 'Nuoro', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8064, 8, 'OG', 'Ogliastra', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8065, 8, 'OT', 'Olbia-Tempio', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8066, 8, 'OR', 'Oristano', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8067, 8, 'PD', 'Padova', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8068, 8, 'PA', 'Palermo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8069, 8, 'PR', 'Parma', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8070, 8, 'PV', 'Pavia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8071, 8, 'PG', 'Perugia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8072, 8, 'PU', 'Pesaro e Urbino', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8073, 8, 'PE', 'Pescara', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8074, 8, 'PC', 'Piacenza', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8075, 8, 'PI', 'Pisa', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8076, 8, 'PT', 'Pistoia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8077, 8, 'PN', 'Pordenone', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8078, 8, 'PZ', 'Potenza', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8079, 8, 'PO', 'Prato', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8080, 8, 'RG', 'Ragusa', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8081, 8, 'RA', 'Ravenna', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8082, 8, 'RC', 'Reggio Calabria', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8083, 8, 'RE', 'Reggio Emilia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8084, 8, 'RI', 'Rieti', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8085, 8, 'RN', 'Rimini', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8086, 8, 'RM', 'Roma', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8087, 8, 'RO', 'Rovigo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8088, 8, 'SA', 'Salerno', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8089, 8, 'SS', 'Sassari', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8090, 8, 'SV', 'Savona', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8091, 8, 'SI', 'Siena', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8092, 8, 'SR', 'Siracusa', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8093, 8, 'SO', 'Sondrio', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8094, 8, 'TA', 'Taranto', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8095, 8, 'TE', 'Teramo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8096, 8, 'TR', 'Terni', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8097, 8, 'TO', 'Torino', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8098, 8, 'TP', 'Trapani', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8099, 8, 'TN', 'Trento', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8100, 8, 'TV', 'Treviso', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8101, 8, 'TS', 'Trieste', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8102, 8, 'UD', 'Udine', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8103, 8, 'VA', 'Varese', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8104, 8, 'VE', 'Venezia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8105, 8, 'VB', 'Verbano-Cusio-Ossola', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8106, 8, 'VC', 'Vercelli', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8107, 8, 'VR', 'Verona', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8108, 8, 'VV', 'Vibo Valentia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8109, 8, 'VI', 'Vicenza', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (8110, 8, 'VT', 'Viterbo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11001, 11, 'DR', 'Drenthe', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11002, 11, 'FL', 'Flevoland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11003, 11, 'FR', 'Friesland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11004, 11, 'GE', 'Gelderland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11005, 11, 'GR', 'Groningen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11006, 11, 'LI', 'Limburg', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11007, 11, 'NB', 'Noord-Brabant', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11008, 11, 'NH', 'Noord-Holland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11009, 11, 'OV', 'Overijssel', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11010, 11, 'UT', 'Utrecht', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11011, 11, 'ZE', 'Zeeland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (11012, 11, 'ZH', 'Zuid-Holland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15001, 15, 'AN', 'Andalusia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15002, 15, 'AR', 'Aragon', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15003, 15, 'AS', 'Asturias', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15004, 15, 'IB', 'Balearic Islands', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15005, 15, 'PV', 'Basque Country', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15006, 15, 'CN', 'Canary Islands', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15007, 15, 'CB', 'Cantabria', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15008, 15, 'CL', 'Castile and Leon', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15009, 15, 'CM', 'Castile-La Mancha', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15010, 15, 'CT', 'Catalonia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15011, 15, 'CE', 'Ceuta', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15012, 15, 'EX', 'Extremadura', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15013, 15, 'GA', 'Galicia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15014, 15, 'LO', 'La Rioja', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15015, 15, 'M', 'Madrid', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15016, 15, 'ML', 'Melilla', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15017, 15, 'MU', 'Murcia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15018, 15, 'NA', 'Navarra', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (15019, 15, 'VC', 'Valencia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19001, 19, 'AL', 'Alabama', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19002, 19, 'AK', 'Alaska', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19003, 19, 'AZ', 'Arizona', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19004, 19, 'AR', 'Arkansas', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19005, 19, 'CA', 'California', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19006, 19, 'CO', 'Colorado', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19007, 19, 'CT', 'Connecticut', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19008, 19, 'DC', 'District of Columbia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19009, 19, 'DE', 'Delaware', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19010, 19, 'FL', 'Florida', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19011, 19, 'GA', 'Georgia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19012, 19, 'HI', 'Hawaii', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19013, 19, 'ID', 'Idaho', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19014, 19, 'IL', 'Illinois', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19015, 19, 'IN', 'Indiana', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19016, 19, 'IA', 'Iowa', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19017, 19, 'KS', 'Kansas', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19018, 19, 'KY', 'Kentucky ', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19019, 19, 'LA', 'Louisiana ', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19020, 19, 'ME', 'Maine', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19021, 19, 'MD', 'Maryland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19022, 19, 'MA', 'Massachusetts', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19023, 19, 'MI', 'Michigan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19024, 19, 'MN', 'Minnesota', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19025, 19, 'MS', 'Mississippi', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19026, 19, 'MO', 'Missouri', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19027, 19, 'MT', 'Montana', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19028, 19, 'NE', 'Nebraska', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19029, 19, 'NV', 'Nevada', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19030, 19, 'NH', 'New Hampshire', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19031, 19, 'NJ', 'New Jersey', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19032, 19, 'NM', 'New Mexico', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19033, 19, 'NY', 'New York', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19034, 19, 'NC', 'North Carolina', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19035, 19, 'ND', 'North Dakota', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19036, 19, 'OH', 'Ohio', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19037, 19, 'OK', 'Oklahoma ', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19038, 19, 'OR', 'Oregon', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19039, 19, 'PA', 'Pennsylvania', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19040, 19, 'PR', 'Puerto Rico', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19041, 19, 'RI', 'Rhode Island', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19042, 19, 'SC', 'South Carolina', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19043, 19, 'SD', 'South Dakota', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19044, 19, 'TN', 'Tennessee', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19045, 19, 'TX', 'Texas', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19046, 19, 'UT', 'Utah', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19047, 19, 'VT', 'Vermont', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19048, 19, 'VA', 'Virginia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19049, 19, 'WA', 'Washington', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19050, 19, 'WV', 'West Virginia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19051, 19, 'WI', 'Wisconsin', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (19052, 19, 'WY', 'Wyoming', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32001, 32, 'ACT', 'Australian Capital Territory', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32002, 32, 'NSW', 'New South Wales', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32003, 32, 'NT', 'Northern Territory', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32004, 32, 'QLD', 'Queensland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32005, 32, 'SA', 'South Australia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32006, 32, 'TAS', 'Tasmania', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32007, 32, 'VIC', 'Victoria', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (32008, 32, 'WA', 'Western Australia', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144001, 144, 'MX-AGS', 'Aguascalientes', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144002, 144, 'MX-BCN', 'Baja California', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144003, 144, 'MX-BCS', 'Baja California Sur', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144004, 144, 'MX-CAM', 'Campeche', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144005, 144, 'MX-CHP', 'Chiapas', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144006, 144, 'MX-CHI', 'Chihuahua', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144007, 144, 'MX-COA', 'Coahuila', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144008, 144, 'MX-COL', 'Colima', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144009, 144, 'MX-DUR', 'Durango', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144010, 144, 'MX-GTO', 'Guanajuato', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144011, 144, 'MX-GRO', 'Guerrero', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144012, 144, 'MX-HGO', 'Hidalgo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144013, 144, 'MX-JAL', 'Jalisco', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144014, 144, 'MX-MEX', 'Mexico', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144015, 144, 'MX-MIC', 'Michoacan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144016, 144, 'MX-MOR', 'Morelos', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144017, 144, 'MX-NAY', 'Nayarit', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144018, 144, 'MX-NLE', 'Nuevo Leon', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144019, 144, 'MX-OAX', 'Oaxaca', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144020, 144, 'MX-PUE', 'Puebla', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144021, 144, 'MX-QRO', 'Queretaro', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144023, 144, 'MX-ROO', 'Quintana Roo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144024, 144, 'MX-SLP', 'San Luis Potosí', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144025, 144, 'MX-SIN', 'Sinaloa', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144026, 144, 'MX-SON', 'Sonora', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144027, 144, 'MX-TAB', 'Tabasco', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144028, 144, 'MX-TAM', 'Tamaulipas', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144029, 144, 'MX-TLX', 'Tlaxcala', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144030, 144, 'MX-VER', 'Veracruz', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144031, 144, 'MX-YUC', 'Yucatan', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (144032, 144, 'MX-ZAC', 'Zacatecas', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164001, 164, '01', 'Østfold', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164002, 164, '02', 'Akershus', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164003, 164, '03', 'Oslo', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164004, 164, '04', 'Hedmark', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164005, 164, '05', 'Oppland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164006, 164, '06', 'Buskerud', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164007, 164, '07', 'Vestfold', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164008, 164, '08', 'Telemark', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164009, 164, '09', 'Aust-Agder', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164010, 164, '10', 'Vest-Agder', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164011, 164, '11', 'Rogaland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164012, 164, '12', 'Hordaland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164013, 164, '14', 'Sogn og Fjordane', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164014, 164, '15', 'Møre of Romsdal', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164015, 164, '16', 'Sør-Trøndelag', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164016, 164, '17', 'Nord-Trøndelag', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164017, 164, '18', 'Nordland', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164018, 164, '19', 'Troms', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (164019, 164, '20', 'Finnmark', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202001, 202, 'AG', 'Aargau', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202002, 202, 'AR', 'Appenzell Ausserrhoden', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202003, 202, 'AI', 'Appenzell Innerrhoden', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202004, 202, 'BL', 'Basel-Landschaft', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202005, 202, 'BS', 'Basel-Stadt', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202006, 202, 'BE', 'Bern', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202007, 202, 'FR', 'Fribourg', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202008, 202, 'GE', 'Geneva', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202009, 202, 'GL', 'Glarus', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202010, 202, 'GR', 'Graubünden', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202011, 202, 'JU', 'Jura', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202012, 202, 'LU', 'Lucerne', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202013, 202, 'NE', 'Neuchâtel', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202014, 202, 'NW', 'Nidwalden', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202015, 202, 'OW', 'Obwalden', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202016, 202, 'SH', 'Schaffhausen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202017, 202, 'SZ', 'Schwyz', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202018, 202, 'SO', 'Solothurn', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202019, 202, 'SG', 'St. Gallen', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202020, 202, 'TG', 'Thurgau', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202021, 202, 'TI', 'Ticino', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202022, 202, 'UR', 'Uri', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202023, 202, 'VS', 'Valais', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202024, 202, 'VD', 'Vaud', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202025, 202, 'ZG', 'Zug', TRUE);
insert into Region (regionId, countryId, regionCode, name, active_) values (202026, 202, 'ZH', 'Zürich', TRUE);

--
-- List types for accounts
--

insert into ListType (listTypeId, name, type_) values (10000, 'billing', 'com.liferay.portal.model.Account.address');
insert into ListType (listTypeId, name, type_) values (10001, 'other', 'com.liferay.portal.model.Account.address');
insert into ListType (listTypeId, name, type_) values (10002, 'p-o-box', 'com.liferay.portal.model.Account.address');
insert into ListType (listTypeId, name, type_) values (10003, 'shipping', 'com.liferay.portal.model.Account.address');

insert into ListType (listTypeId, name, type_) values (10004, 'email-address', 'com.liferay.portal.model.Account.emailAddress');
insert into ListType (listTypeId, name, type_) values (10005, 'email-address-2', 'com.liferay.portal.model.Account.emailAddress');
insert into ListType (listTypeId, name, type_) values (10006, 'email-address-3', 'com.liferay.portal.model.Account.emailAddress');

insert into ListType (listTypeId, name, type_) values (10007, 'fax', 'com.liferay.portal.model.Account.phone');
insert into ListType (listTypeId, name, type_) values (10008, 'local', 'com.liferay.portal.model.Account.phone');
insert into ListType (listTypeId, name, type_) values (10009, 'other', 'com.liferay.portal.model.Account.phone');
insert into ListType (listTypeId, name, type_) values (10010, 'toll-free', 'com.liferay.portal.model.Account.phone');
insert into ListType (listTypeId, name, type_) values (10011, 'tty', 'com.liferay.portal.model.Account.phone');

insert into ListType (listTypeId, name, type_) values (10012, 'intranet', 'com.liferay.portal.model.Account.website');
insert into ListType (listTypeId, name, type_) values (10013, 'public', 'com.liferay.portal.model.Account.website');

--
-- List types for contacts
--

insert into ListType (listTypeId, name, type_) values (11000, 'business', 'com.liferay.portal.model.Contact.address');
insert into ListType (listTypeId, name, type_) values (11001, 'other', 'com.liferay.portal.model.Contact.address');
insert into ListType (listTypeId, name, type_) values (11002, 'personal', 'com.liferay.portal.model.Contact.address');

insert into ListType (listTypeId, name, type_) values (11003, 'email-address', 'com.liferay.portal.model.Contact.emailAddress');
insert into ListType (listTypeId, name, type_) values (11004, 'email-address-2', 'com.liferay.portal.model.Contact.emailAddress');
insert into ListType (listTypeId, name, type_) values (11005, 'email-address-3', 'com.liferay.portal.model.Contact.emailAddress');

insert into ListType (listTypeId, name, type_) values (11006, 'business', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11007, 'business-fax', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11008, 'mobile-phone', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11009, 'other', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11010, 'pager', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11011, 'personal', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11012, 'personal-fax', 'com.liferay.portal.model.Contact.phone');
insert into ListType (listTypeId, name, type_) values (11013, 'tty', 'com.liferay.portal.model.Contact.phone');

insert into ListType (listTypeId, name, type_) values (11014, 'dr', 'com.liferay.portal.model.Contact.prefix');
insert into ListType (listTypeId, name, type_) values (11015, 'mr', 'com.liferay.portal.model.Contact.prefix');
insert into ListType (listTypeId, name, type_) values (11016, 'mrs', 'com.liferay.portal.model.Contact.prefix');
insert into ListType (listTypeId, name, type_) values (11017, 'ms', 'com.liferay.portal.model.Contact.prefix');

insert into ListType (listTypeId, name, type_) values (11020, 'ii', 'com.liferay.portal.model.Contact.suffix');
insert into ListType (listTypeId, name, type_) values (11021, 'iii', 'com.liferay.portal.model.Contact.suffix');
insert into ListType (listTypeId, name, type_) values (11022, 'iv', 'com.liferay.portal.model.Contact.suffix');
insert into ListType (listTypeId, name, type_) values (11023, 'jr', 'com.liferay.portal.model.Contact.suffix');
insert into ListType (listTypeId, name, type_) values (11024, 'phd', 'com.liferay.portal.model.Contact.suffix');
insert into ListType (listTypeId, name, type_) values (11025, 'sr', 'com.liferay.portal.model.Contact.suffix');

insert into ListType (listTypeId, name, type_) values (11026, 'blog', 'com.liferay.portal.model.Contact.website');
insert into ListType (listTypeId, name, type_) values (11027, 'business', 'com.liferay.portal.model.Contact.website');
insert into ListType (listTypeId, name, type_) values (11028, 'other', 'com.liferay.portal.model.Contact.website');
insert into ListType (listTypeId, name, type_) values (11029, 'personal', 'com.liferay.portal.model.Contact.website');

--
-- List types for organizations
--

insert into ListType (listTypeId, name, type_) values (12000, 'billing', 'com.liferay.portal.model.Organization.address');
insert into ListType (listTypeId, name, type_) values (12001, 'other', 'com.liferay.portal.model.Organization.address');
insert into ListType (listTypeId, name, type_) values (12002, 'p-o-box', 'com.liferay.portal.model.Organization.address');
insert into ListType (listTypeId, name, type_) values (12003, 'shipping', 'com.liferay.portal.model.Organization.address');

insert into ListType (listTypeId, name, type_) values (12004, 'email-address', 'com.liferay.portal.model.Organization.emailAddress');
insert into ListType (listTypeId, name, type_) values (12005, 'email-address-2', 'com.liferay.portal.model.Organization.emailAddress');
insert into ListType (listTypeId, name, type_) values (12006, 'email-address-3', 'com.liferay.portal.model.Organization.emailAddress');

insert into ListType (listTypeId, name, type_) values (12007, 'fax', 'com.liferay.portal.model.Organization.phone');
insert into ListType (listTypeId, name, type_) values (12008, 'local', 'com.liferay.portal.model.Organization.phone');
insert into ListType (listTypeId, name, type_) values (12009, 'other', 'com.liferay.portal.model.Organization.phone');
insert into ListType (listTypeId, name, type_) values (12010, 'toll-free', 'com.liferay.portal.model.Organization.phone');
insert into ListType (listTypeId, name, type_) values (12011, 'tty', 'com.liferay.portal.model.Organization.phone');

insert into ListType (listTypeId, name, type_) values (12012, 'administrative', 'com.liferay.portal.model.Organization.service');
insert into ListType (listTypeId, name, type_) values (12013, 'contracts', 'com.liferay.portal.model.Organization.service');
insert into ListType (listTypeId, name, type_) values (12014, 'donation', 'com.liferay.portal.model.Organization.service');
insert into ListType (listTypeId, name, type_) values (12015, 'retail', 'com.liferay.portal.model.Organization.service');
insert into ListType (listTypeId, name, type_) values (12016, 'training', 'com.liferay.portal.model.Organization.service');

insert into ListType (listTypeId, name, type_) values (12017, 'full-member', 'com.liferay.portal.model.Organization.status');
insert into ListType (listTypeId, name, type_) values (12018, 'provisional-member', 'com.liferay.portal.model.Organization.status');

insert into ListType (listTypeId, name, type_) values (12019, 'intranet', 'com.liferay.portal.model.Organization.website');
insert into ListType (listTypeId, name, type_) values (12020, 'public', 'com.liferay.portal.model.Organization.website');


insert into Counter values ('com.liferay.counter.model.Counter', 10000);


insert into Release_ (releaseId, createDate, modifiedDate, servletContextName, buildNumber, verified) values (1, current_timestamp, current_timestamp, 'portal', 6100, FALSE);


create table QUARTZ_BLOB_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	BLOB_DATA binary null,
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table QUARTZ_CALENDARS (
	SCHED_NAME varchar(120) not null,
	CALENDAR_NAME varchar(200) not null,
	CALENDAR binary not null,
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
	FIRED_TIME bigint not null,
	PRIORITY integer not null,
	STATE varchar(16) not null,
	JOB_NAME varchar(200) null,
	JOB_GROUP varchar(200) null,
	IS_NONCONCURRENT boolean NULL,
	REQUESTS_RECOVERY boolean NULL,
	primary key (SCHED_NAME, ENTRY_ID)
);

create table QUARTZ_JOB_DETAILS (
	SCHED_NAME varchar(120) not null,
	JOB_NAME varchar(200) not null,
	JOB_GROUP varchar(200) not null,
	DESCRIPTION varchar(250) null,
	JOB_CLASS_NAME varchar(250) not null,
	IS_DURABLE boolean not null,
	IS_NONCONCURRENT boolean not null,
	IS_UPDATE_DATA boolean not null,
	REQUESTS_RECOVERY boolean not null,
	JOB_DATA binary null,
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
	LAST_CHECKIN_TIME bigint not null,
	CHECKIN_INTERVAL bigint not null,
	primary key (SCHED_NAME, INSTANCE_NAME)
);

create table QUARTZ_SIMPLE_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	REPEAT_COUNT bigint not null,
	REPEAT_INTERVAL bigint not null,
	TIMES_TRIGGERED bigint not null,
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

CREATE TABLE QUARTZ_SIMPROP_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	STR_PROP_1 varchar(512) null,
	STR_PROP_2 varchar(512) null,
	STR_PROP_3 varchar(512) null,
	INT_PROP_1 integer null,
	INT_PROP_2 integer null,
	LONG_PROP_1 bigint null,
	LONG_PROP_2 bigint null,
	DEC_PROP_1 NUMERIC(13,4) null,
	DEC_PROP_2 NUMERIC(13,4) null,
	BOOL_PROP_1 boolean null,
	BOOL_PROP_2 boolean null,
	primary key (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP)
);

create table QUARTZ_TRIGGERS (
	SCHED_NAME varchar(120) not null,
	TRIGGER_NAME varchar(200) not null,
	TRIGGER_GROUP varchar(200) not null,
	JOB_NAME varchar(200) not null,
	JOB_GROUP varchar(200) not null,
	DESCRIPTION varchar(250) null,
	NEXT_FIRE_TIME bigint null,
	PREV_FIRE_TIME bigint null,
	PRIORITY integer null,
	TRIGGER_STATE varchar(16) not null,
	TRIGGER_TYPE varchar(8) not null,
	START_TIME bigint not null,
	END_TIME bigint null,
	CALENDAR_NAME varchar(200) null,
	MISFIRE_INSTR integer null,
	JOB_DATA binary null,
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
