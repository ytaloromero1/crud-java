-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-11-2023 a las 05:30:22
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pru`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `nombre` varchar(100) NOT NULL,
  `edad` int(4) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `idclientes` int(11) NOT NULL,
  `dni` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`nombre`, `edad`, `correo`, `sexo`, `idclientes`, `dni`) VALUES
('Juan Pérez', 30, 'juan.perez@example.com', 'M', 1, 91234567),
('Ana Rodríguez', 25, 'ana.rodriguez@example.com', 'F', 2, 92345678),
('Luis Martínez', 35, 'luis.martinez@example.com', 'M', 3, 93456789),
('Laura Gómez', 28, 'laura.gomez@example.com', 'F', 4, 94567890),
('Carlos Sánchez', 32, 'carlos.sanchez@example.com', 'M', 5, 95678901),
('María López', 22, 'maria.lopez@example.com', 'F', 6, 96789012),
('Javier Fernández', 40, 'javier.fernandez@example.com', 'M', 7, 97890123),
('Marta García', 27, 'marta.garcia@example.com', 'F', 8, 98901234),
('Alejandro Pérez', 33, 'alejandro.perez@example.com', 'M', 9, 99012345),
('Paula Rodríguez', 24, 'paula.rodriguez@example.com', 'F', 10, 99112233);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `iddetalleventa` int(100) NOT NULL,
  `idventa` int(100) NOT NULL,
  `idproducto` int(100) NOT NULL,
  `cantidad` int(50) NOT NULL,
  `preciounitario` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`iddetalleventa`, `idventa`, `idproducto`, `cantidad`, `preciounitario`) VALUES
(10, 13, 24, 2, 10),
(11, 13, 35, 2, 2),
(12, 14, 42, 5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto2`
--

CREATE TABLE `producto2` (
  `nombre` varchar(80) NOT NULL,
  `precio` float NOT NULL,
  `cantidad` int(50) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto2`
--

INSERT INTO `producto2` (`nombre`, `precio`, `cantidad`, `marca`, `codigo`) VALUES
('Chocolate', 5, 50, 'Donofrio', 48),
('Atun', 9, 20, 'Florida', 49),
('Sublimes', 2, 20, 'Alicorp', 50),
('Pepsi', 8, 25, 'PepsiCo', 51),
('Cielo', 3.5, 15, 'Alasca', 52),
('Coca Cola', 9.5, 25, 'Coca-Cola', 53),
('7UP ', 5.2, 65, 'PepsiCo', 54),
('Frio Rico', 3.8, 24, 'Alicorp', 55),
('Aceite Primor', 8.1, 10, 'Alicorp', 56),
('Sedal', 5.3, 27, 'Procter & Gamble', 57),
('Dove ', 5.1, 18, 'Unilever', 58),
('Colgate ', 2.5, 20, 'Palmolive', 59),
('Alacena', 7.1, 10, 'Alicorp', 60),
('Pantene', 2.1, 20, 'Gamble', 61);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `usuario` varchar(100) NOT NULL,
  `apellidos` varchar(633) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `idvendedor` int(11) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `clave` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`usuario`, `apellidos`, `nombre`, `sexo`, `idvendedor`, `correo`, `clave`) VALUES
('usuario1', 'Apellidos1', 'Nombre1', 'M', 1, 'usuario1@example.com', 'clave123'),
('usuario2', 'Apellidos2', 'Nombre2', 'F', 2, 'usuario2@example.com', 'clave456'),
('usuario3', 'Apellidos3', 'Nombre3', 'M', 3, 'usuario3@example.com', 'clave789'),
('ytalo33', 'ytalo33', 'ytalo33', 'm', 18, 'ytalo12@12', 'ytalo33');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idventa` int(11) NOT NULL,
  `cliente` varchar(633) NOT NULL,
  `montototal` double NOT NULL,
  `fecha` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idventa`, `cliente`, `montototal`, `fecha`) VALUES
(13, 'ggg', 12, '2022 / 9 / 20'),
(14, 'fffffffffffffff', 5, '2023 / 10 / 29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idclientes`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`iddetalleventa`);

--
-- Indices de la tabla `producto2`
--
ALTER TABLE `producto2`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`idvendedor`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idventa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idclientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `iddetalleventa` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `producto2`
--
ALTER TABLE `producto2`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `idvendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idventa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
