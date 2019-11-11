-- begin TASKS_CARRIER
create table TASKS_CARRIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COST decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end TASKS_CARRIER
-- begin TASKS_GOODS
create table TASKS_GOODS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    NAME varchar(255) not null,
    COST decimal(19, 2) not null,
    --
    -- from tasks_Foodstuffs
    EXPIRATION_DATE decimal(19, 2),
    --
    -- from tasks_IndustrialProducts
    WEIGHT integer,
    --
    primary key (ID)
)^
-- end TASKS_GOODS
-- begin TASKS_DELIVERY
create table TASKS_DELIVERY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ decimal(19, 2) not null,
    GOODS_ID varchar(36) not null,
    DISTANCE decimal(19, 2) not null,
    STATUS integer not null,
    DATE_ date not null,
    CARRIER_ID varchar(36),
    TRUCK_ID varchar(36),
    --
    primary key (ID)
)^
-- end TASKS_DELIVERY
-- begin TASKS_TRUCK_TYPE
create table TASKS_TRUCK_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CAPACITY integer not null,
    --
    primary key (ID)
)^
-- end TASKS_TRUCK_TYPE
-- begin TASKS_TRUCK
create table TASKS_TRUCK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255) not null,
    CARRIER_ID varchar(36),
    TRUCK_TYPE_ID varchar(36),
    --
    primary key (ID)
)^
-- end TASKS_TRUCK
-- begin TASKS_HISTORY_COST
create table TASKS_HISTORY_COST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CARRIER_ID varchar(36),
    CHANGE_DATE timestamp,
    --
    primary key (ID)
)^
-- end TASKS_HISTORY_COST
