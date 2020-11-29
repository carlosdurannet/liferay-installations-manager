create table LIM_Installation (
	uuid_ VARCHAR(75) null,
	installationId LONG not null primary key,
	description VARCHAR(75) null,
	path_ VARCHAR(75) null,
	version VARCHAR(75) null,
	vmId LONG,
	schemeId LONG
);

create table LIM_Installations_Modules (
	uuid_ VARCHAR(75) null,
	installationId LONG not null,
	moduleId LONG not null,
	primary key (installationId, moduleId)
);

create table LIM_Module (
	uuid_ VARCHAR(75) null,
	moduleId LONG not null primary key,
	name VARCHAR(75) null,
	type_ INTEGER,
	description VARCHAR(75) null,
	gitlabUrl VARCHAR(75) null
);

create table LIM_Scheme (
	uuid_ VARCHAR(75) null,
	schemeId LONG not null primary key,
	name VARCHAR(75) null,
	serverHostname VARCHAR(75) null,
	serverIP VARCHAR(75) null,
	dbUser VARCHAR(75) null,
	dbPass VARCHAR(75) null,
	dbName VARCHAR(75) null
);

create table LIM_Site (
	siteId LONG not null primary key,
	name VARCHAR(75) null,
	privateSite BOOLEAN,
	friendlyUrl VARCHAR(75) null,
	virtualhost VARCHAR(75) null,
	description VARCHAR(75) null,
	installationId LONG
);

create table LIM_VM (
	uuid_ VARCHAR(75) null,
	vmId LONG not null primary key,
	hostname VARCHAR(75) null,
	ip VARCHAR(75) null,
	so VARCHAR(75) null,
	vcpus INTEGER,
	ram INTEGER,
	storage INTEGER,
	jdk INTEGER
);