USE usuarios;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role TINYINT NOT NULL
);

INSERT INTO usuarios (name, last_name, email, password, role)
VALUES
('John', 'Doe', 'john.doe@example.com', '$2a$10$lhHX06vn68drIrKdmISC7.0fG8Smpj2kB34WHRz2oIQA3Hcvo7DJO', 0),
('Jane', 'Smith', 'jane.smith@example.com', '$2a$10$lhHX06vn68drIrKdmISC7.0fG8Smpj2kB34WHRz2oIQA3Hcvo7DJO', 0),
('Lucas', 'Martins', 'lucas.martins@example.com', '$2a$10$lhHX06vn68drIrKdmISC7.0fG8Smpj2kB34WHRz2oIQA3Hcvo7DJO', 1),
('Maria', 'Oliveira', 'maria.oliveira@example.com', '$2a$10$lhHX06vn68drIrKdmISC7.0fG8Smpj2kB34WHRz2oIQA3Hcvo7DJO', 1),
('Carlos', 'Silva', 'carlos.silva@example.com', '$2a$10$lhHX06vn68drIrKdmISC7.0fG8Smpj2kB34WHRz2oIQA3Hcvo7DJO', 0);
