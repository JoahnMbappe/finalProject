CREATE DATABASE bibliotech;

USE bibliotech;

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    correo VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15),
    fecha_registro DATE NOT NULL
);

CREATE TABLE libros (
    id_libro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    anio INT,
    isbn VARCHAR(20) UNIQUE,
    disponible BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE prestamos (
    id_prestamo INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_libro INT NOT NULL,
    fecha_prestamo DATE NOT NULL,
    fecha_limite DATE NOT NULL,
    fecha_devolucion DATE,
    estado VARCHAR(20) NOT NULL DEFAULT 'Prestado',

    FOREIGN KEY (id_usuario)
        REFERENCES usuarios(id_usuario),

    FOREIGN KEY (id_libro)
        REFERENCES libros(id_libro)
);

CREATE TABLE multas (
    id_multa INT AUTO_INCREMENT PRIMARY KEY,
    id_prestamo INT NOT NULL,
    dias_retraso INT NOT NULL DEFAULT 0,
    monto DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    estado VARCHAR(20) NOT NULL DEFAULT 'Pendiente',

    FOREIGN KEY (id_prestamo)
        REFERENCES prestamos(id_prestamo)
);