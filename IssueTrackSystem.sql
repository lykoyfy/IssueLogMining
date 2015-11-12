drop table if exists user;
create table user(
	id integer not null,
	real_name varchar(100),
	email varchar(100),
	name varchar(100),
	can_login boolean,
	primary key(id)
);

drop table if exists group;
create table group(
	id integer not null,
	name varchar(100),
	description text,
	is_bug_group integer,
	user_regexp varchar(200),
	is_active integer,
	primary key(id)
);

drop table if exists product;
create table product(
	id integer not null,
	name varchar(100),
	description text,
	is_active boolean,
	default_milestone varchar(200),
	has_unconfirmed boolean,
	classification varchar(200),
	primary key(id)
);

drop table if exists component;
create table component(
	id integer not null,
	name varchar(100),
	description text,
	default_assigned_to	varchar(100),
	default_qa_contact varchar(100),
	sort_key integer,
	is_active boolean,
	primary key(id);
);

drop table if exists bug;
create table if exists bug(
	id integer,
	actual_time float,
	assigned_to varchar(100),
	classification varchar(100),
	component varchar(100),
	creation_time varchar(100),
	creator varchar(100),
	deadline varchar(100),
	dupe_of integer,     /**duplicated id**/
	is_cc_accessible boolean(100),
	is_confirmed boolean(100),
	is_open boolean,
	is_creator_accessible boolean,
	last_change_time varchar(100),
	op_sys varchar,
	platform varchar,
	priority varchar,
	product varchar,
	qa_contact varchar,
	severity varchar,
	status varchar,
	summary varchar,
	target_milestone varchar,
	version varchar,
	whiteboard varchar,
	primary key(id)
);

drop table if exists attachment;
create table attachment(
	id integer not null,
	size integer,
	creation_time varchar(100),
	last_change_time varchar(100),
	bug_id int,
	file_name varchar(100),
	summary varchar(100),
	content_type varchar(100),
	is_private boolean,
	is_obsolete boolean,
	is_patch boolean,
	creator varchar(100),
	primary key(id)
);

drop table if exists comment;
create table comment(
	id integer not null,
	bug_id integer,
	attachment_id integer,
	count integer,
	content text,
	creator varchar(100),
	time varchar(100),
	creation_time varchar(100),
	is_private boolean,
	primary key(id)
);

drop table if exists flag;
create table flag(
	id integer not null,
	name varchar(100),
	type_id integer,
	creation_date varchar(100),
	modification_date varchar(100),
	status varchar(100),
	setter varchar(100),
	requestee varchar(100),
	primary key(id)
);


drop table if exists flag_type;
create table flag_type(
	id integer not null,
	name varchar(100),
	description text,
	cc_list text,
	sort_key integer,
	is_active boolean,
	is_requestable boolean,	
);

drop table if exists history;
create table history(
	id integer not null,
	bug_id integer,
	when varchar(100),
	who varchar(100),
	primary key(id)
);

drop table if exists change;
create table change(
	id integer not null,
	history_id integer,
	field_name varchar(100),
	removed varchar(100),
	added varchar(100),
	attachment_id integer,
	primary key(id)
);



