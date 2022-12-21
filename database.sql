create database if not exists seoul_parking;

create table if not exists `base_code` (
    `code`          VARCHAR(8)  PRIMARY KEY,
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `name`          TEXT,
    `data1`         TEXT,
    `data2`         TEXT,
    `data3`         TEXT,
    `data4`         TEXT
);

-- 구
create table if not exists `district` (
    `id`            INT         PRIMARY KEY     AUTO_INCREMENT,
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `name`          TEXT
);

-- 주차장
create table if not exists `parking_area` (
    `id`            INT         PRIMARY KEY     AUTO_INCREMENT,
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `districtId`    INT             NOT NULL,
    `code`          VARCHAR(12)     NOT NULL,
    `name`          TEXT,
    `type`          VARCHAR(8)      COMMENT '기초코드. 주차타입. 공영,민영',
    `category`      VARCHAR(8)      COMMENT '기초코드. 주차유형. 노외,노상,부설',
    `segment`       INT             COMMENT '구획 수',
    `level`         VARCHAR(8)      COMMENT '기초코드. 급지',
    `is_rotation`   TINYINT(1)      COMMENT '부제시행. 1:시행, 0:미시행',
    `is_pay`        TINYINT(1)      COMMENT '요금정보. 1:유료, 0:무료',
    `memo`          TEXT            COMMENT '특이사항',
    `managementId`  INT             COMMENT '관리기관',
    `latitude`      DECIMAL(12, 8)  COMMENT '위도',
    `longitude`     DECIMAL(12, 8)  COMMENT '경도',
    'last_updated'  VARCHAR(10)     COMMENT '데이터 기준일자'
);

-- 주소
create table if not exists `address` (
    `areaId`        INT         PRIMARY KEY     COMMENT '주차장 ID',
    `type`          VARCHAR(8)  PRIMARY KEY     COMMENT '기초코드. 주소 타입. 도로명, 지번',
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `address`       VARCHAR(4)  COMMENT '주소'
);

-- 운영 시간
create table if not exists `time_table` (
    `areaId`        INT         PRIMARY KEY     COMMENT '주차장 ID',
    `type`          VARCHAR(8)  PRIMARY KEY     COMMENT '기초코드. 타임테이블 타입. 평일,토요일,공휴일',
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `open_at`       VARCHAR(4)  COMMENT '운영 시작',
    `close_at`      VARCHAR(4)  COMMENT '운영 종료'
);

-- 이용 금액
create table if not exists `price` (
    `areaId`        INT         PRIMARY KEY     COMMENT '주차장 ID',
    `type`          VARCHAR(8)  PRIMARY KEY     COMMENT '기초코드. 요금 타입. 기본요금,추가시간,1일주차,월정기',
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `minute`        INT         COMMENT '시간 단위. 단위:분',
    `price`         INT         COMMENT '요금 단위. 단위:원'
);

-- 결제 방법
create table if not exists `pay_method` (
    `areaId`        INT         PRIMARY KEY     COMMENT '주차장 ID',
    `type`          VARCHAR(8)  PRIMARY KEY     COMMENT '기초코드. 결제 타입. 현금,카드,무통장,지로',
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME
);

-- 관리기관
create table if not exists `management` (
    `id`            INT         PRIMARY KEY     AUTO_INCREMENT,
    `created_at`    DATETIME    DEFAULT now(),
    `updated_at`    DATETIME,
    `name`          TEXT,
    `tel`           TEXT            COMMENT '전화번호'
);
