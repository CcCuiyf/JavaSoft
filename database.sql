/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2021/12/28 9:26:01                           */
/*==============================================================*/
use java;

drop table if exists L_C;

drop table if exists S_C;

drop table if exists S_L;

drop table if exists administrator;

drop table if exists class;

drop table if exists leader;

drop table if exists student;

/*==============================================================*/
/* Table: "L_C"                                                 */
/*==============================================================*/
create table L_C
(
   L_C                integer not null auto_increment,
   id                   integer,
   sno                  numeric(10),
   primary key (L_C)
);

/*==============================================================*/
/* Table: "S_C"                                                 */
/*==============================================================*/
create table S_C
(
   S_C                integer not null auto_increment,
   sno                  numeric(10),
   id                   integer,
   primary key (S_C)
);

/*==============================================================*/
/* Table: "S_L"                                                 */
/*==============================================================*/
create table S_L
(
   S_L                integer not null auto_increment,
   stu_sno            numeric(10),
   leader_sno         numeric(10),
   primary key (S_L)
);

/*==============================================================*/
/* Table: administrator                                         */
/*==============================================================*/
create table administrator
(
   name                 varchar(45),
   sno                  integer not null auto_increment,
   power_id             integer,
   primary key (sno)
);

/*==============================================================*/
/* Table: class                                                 */
/*==============================================================*/
create table class
(
   id                   integer not null auto_increment,
   leader_name          varchar(45),
   subject              varchar(45),
   primary key (id)
);

/*==============================================================*/
/* Table: leader                                                */
/*==============================================================*/
create table leader
(
   name                 varchar(45),
   leader_sno         integer not null auto_increment,
   college              varchar(45),
   primary key (leader_sno)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   name                 varchar(45),
   stu_sno            integer not null auto_increment,
   college              varchar(45),
   primary key (stu_sno)
);

alter table L_C add constraint FK_Reference_5 foreign key (id)
      references class (id) on delete restrict on update restrict;

alter table L_C add constraint FK_Reference_6 foreign key (sno)
      references leader (leader_sno) on delete restrict on update restrict;

alter table S_C add constraint FK_Reference_3 foreign key (sno)
      references student (stu_sno) on delete restrict on update restrict;

alter table S_C add constraint FK_Reference_4 foreign key (id)
      references class (id) on delete restrict on update restrict;

alter table S_L add constraint FK_Reference_7 foreign key (stu_sno)
      references student (stu_sno) on delete restrict on update restrict;

alter table S_L add constraint FK_Reference_8 foreign key (leader_sno)
      references leader (leader_sno) on delete restrict on update restrict;

