-- Criação da base de dados
CREATE DATABASE IF NOT EXISTS do_your_stuff_db;
USE do_your_stuff_db;

-- Criação da tabela de usuários
CREATE TABLE IF NOT EXISTS users (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
    );

-- Criação da tabela de tarefas
CREATE TABLE IF NOT EXISTS tasks (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     title VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    limit_date_to_be_done TIMESTAMP,
    created_by INT NOT NULL,
    assigned_to INT,
    who_last_change INT NOT NULL,
    FOREIGN KEY (created_by) REFERENCES users(id),
    FOREIGN KEY (assigned_to) REFERENCES users(id),
    FOREIGN KEY (who_last_change) REFERENCES users(id)
    );
