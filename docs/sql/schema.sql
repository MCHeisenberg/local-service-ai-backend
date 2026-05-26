CREATE DATABASE IF NOT EXISTS local_service_ai
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_unicode_ci;

USE local_service_ai;

CREATE TABLE IF NOT EXISTS service_order(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    user_id BIGINT NOT NULL,
    runner_id BIGINT NULL,

    service_type VARCHAR(30) NOT NULL,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(255),

    price DECIMAL(10,2) NOT NULL,
    contact_phone VARCHAR(20) NOT NULL,
    service_address VARCHAR(255) NOT NULL,

    expected_service_time DATETIME NULL,

    status VARCHAR(20) NOT NULL,

    create_time DATETIME NOT NULL,
    accept_time DATETIME NULL,
    finish_time DATETIME NULL,
    update_time DATETIME NOT NULL
);


