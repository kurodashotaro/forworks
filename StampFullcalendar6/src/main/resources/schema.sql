DROP TABLE IF EXISTS STAMP;
 
CREATE TABLE STAMP (
    ID  bigint GENERATED BY DEFAULT AS identity  NOT NULL PRIMARY KEY,
    start VARCHAR(10) NOT NULL
)