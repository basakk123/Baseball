
### 테이블 생성
```sql
CREATE TABLE stadium(
	id number primary key,
    name varchar2(100) unique not null,
    createdAt TIMESTAMP
);

CREATE SEQUENCE stadium_seq 
INCREMENT BY 1 
START WITH 1;

CREATE TABLE team(
	id number primary key,
    name varchar2(100) unique not null,
    stadiumId number,
    createdAt TIMESTAMP
) ;

CREATE SEQUENCE team_seq 
INCREMENT BY 1 
START WITH 1;

CREATE TABLE player(
	id number primary key,
    name varchar2(100) unique not null,
    teamId number,
    position varchar2(100) not null,
    createdAt TIMESTAMP
);

CREATE SEQUENCE player_seq 
INCREMENT BY 1 
START WITH 1;

CREATE TABLE out(
	id number primary key,
    playerId number,
    reason varchar2(100),
    createdAt TIMESTAMP
);   

CREATE SEQUENCE out_seq 
INCREMENT BY 1 
START WITH 1;

DROP table stadium;
DROP table team;
DROP table player;
DROP table out;

DROP SEQUENCE stadium_seq;
DROP SEQUENCE team_seq;
DROP SEQUENCE player_seq;
DROP SEQUENCE out_seq;
```

### 더미데이터 추가
```sql
INSERT into stadium(id,name,createdAt)
VALUES(stadium_seq.nextval,'사직야구장',sysdate);
INSERT into stadium(id,name,createdAt)
VALUES(stadium_seq.nextval, '구덕야구장',sysdate);
INSERT into stadium(id,name,createdAt)
VALUES(stadium_seq.nextval, '잠실야구장',sysdate);

INSERT into team(id,name,stadiumId,createdAt)
VALUES(team_seq.nextval,'두산',1,sysdate);
INSERT into team(id,name,stadiumId,createdAt)
VALUES(team_seq.nextval,'NC',2,sysdate);
INSERT into team(id,name,stadiumId,createdAt)
VALUES(team_seq.nextval,'롯데',3,sysdate);

INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'김민재',1,'타자',sysdate);
INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'채지선',1,'투수',sysdate);
INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'알칸타라',1,'외야수',sysdate);

INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'손민한',2,'타자',sysdate);
INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'루친스키',2,'투수',sysdate);
INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'박석민',2,'내야수',sysdate);

INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'오윤석',3,'타자',sysdate);
INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'박세웅',3,'투수',sysdate);
INSERT into player(id,name,teamId,position,createdAt)
VALUES(player_seq.nextval,'오태근',3,'내야수',sysdate);
commit;
```