-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2019 at 06:34 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `carsellingsystemdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `carinfo`
--

CREATE TABLE IF NOT EXISTS `carinfo` (
  `carid` varchar(10) COLLATE utf8_bin NOT NULL,
  `cartype` varchar(50) COLLATE utf8_bin NOT NULL,
  `carmaker` varchar(50) COLLATE utf8_bin NOT NULL,
  `carmodel` varchar(10) COLLATE utf8_bin NOT NULL,
  `minprice` double NOT NULL,
  `maxprice` double NOT NULL,
  `carstyle` varchar(50) COLLATE utf8_bin NOT NULL,
  `drivetype` varchar(50) COLLATE utf8_bin NOT NULL,
  `manufacturingyear` varchar(50) COLLATE utf8_bin NOT NULL,
  `enginesize` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carinfo`
--
ALTER TABLE `carinfo`
  ADD PRIMARY KEY (`carid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
