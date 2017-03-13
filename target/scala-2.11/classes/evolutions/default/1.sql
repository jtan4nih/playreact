# --- First database schema

# --- !Ups

set ignorecase true;

-- CREATE TABLE employee (
--   id                        BIGINT NOT NULL AUTO_INCREMENT,
--   name                      VARCHAR(255) NOT NULL,
--   address                   VARCHAR(1000) NOT NULL,
--   designation               VARCHAR(255) NOT NULL,
--   CONSTRAINT pk_employee PRIMARY KEY (id))
-- ;
-- # --- !Downs

-- drop table if exists employee;


CREATE TABLE bloggermessage (
  id                        BIGINT NOT NULL AUTO_INCREMENT,
  title                      VARCHAR(255) NOT NULL,
  text                   VARCHAR(1000) NOT NULL,
  datetime               VARCHAR(20) NOT NULL,
  CONSTRAINT pk_bloggermessage PRIMARY KEY (id))
;


CREATE TABLE user (
  email varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  CONSTRAINT pk_user PRIMARY KEY (email)
)



# --- !Downs

drop table if exists bloggermessage;
drop table if exists user;
