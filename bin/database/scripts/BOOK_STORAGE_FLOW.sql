create table BOOK_STORAGE_FLOW (
 ID varchar(10) NOT NULL PRIMARY KEY,
 IN_OUT_TYPE varchar(3),
 IN_OUT_DATE varchar(10),
 IN_OUT_USER varchar(21),
 VERSION varchar(1),
 CREATED_USER varchar(21),
 CREATED_DATE DATE,
 MODIFIED_USER varchar(21),
 MODIFIED_DATE DATE)

 
 