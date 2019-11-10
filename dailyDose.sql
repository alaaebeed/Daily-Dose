-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 04, 2019 at 05:58 PM
-- Server version: 10.3.11-MariaDB
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dailyDose`
--

-- --------------------------------------------------------

--
-- Table structure for table `activityLog`
--

CREATE TABLE `activityLog` (
  `name` varchar(20) NOT NULL,
  `dateAndTime` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `activityLog`
--

INSERT INTO `activityLog` (`name`, `dateAndTime`) VALUES
('user', '24/03/2019 18:07:35'),
('user', '24/03/2019 20:00:57'),
('user', '24/03/2019 20:12:47'),
('user', '24/03/2019 20:47:16'),
('user', '24/03/2019 21:17:50'),
('user', '24/03/2019 21:21:08'),
('user', '24/03/2019 21:24:50'),
('user', '24/03/2019 21:28:08'),
('user', '24/03/2019 21:31:29'),
('user', '02/04/2019 11:09:21'),
('user', '02/04/2019 11:45:00'),
('user', '02/04/2019 13:01:10'),
('user', '02/04/2019 19:06:44'),
('user', '02/04/2019 19:07:46'),
('user', '02/04/2019 19:09:16'),
('user', '02/04/2019 23:57:12'),
('user', '03/04/2019 00:34:05'),
('user', '04/04/2019 19:54:05');

-- --------------------------------------------------------

--
-- Table structure for table `adminSale`
--

CREATE TABLE `adminSale` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `billNum` int(11) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`billNum`, `date`, `total`) VALUES
(1, '23/03/2019', '23.0'),
(2, '24/03/2019', '2.0'),
(3, '24/03/2019', '2.0'),
(4, '24/03/2019', '0.0'),
(5, '24/03/2019', '3.0'),
(6, '24/03/2019', '3.0'),
(7, '24/03/2019', '4.0'),
(8, '24/03/2019', '46.0'),
(9, '24/03/2019', '46.0'),
(10, '24/03/2019', '138.0'),
(11, '24/03/2019', '180.0'),
(12, '24/03/2019', '300.0'),
(13, '24/03/2019', '106.0'),
(14, '24/03/2019', '54.0'),
(15, '24/03/2019', '154.0'),
(16, '24/03/2019', '60.0'),
(17, '24/03/2019', '70.0'),
(18, '24/03/2019', '120.0'),
(19, '24/03/2019', '230.0'),
(20, '24/03/2019', '100.0'),
(21, '24/03/2019', '400.0'),
(22, '24/03/2019', '400.0'),
(23, '24/03/2019', '50.0'),
(24, '24/03/2019', '800.0'),
(25, '02/04/2019', '246.0'),
(26, '02/04/2019', '125.0'),
(27, '02/04/2019', '92.0'),
(28, '02/04/2019', '180.0');

-- --------------------------------------------------------

--
-- Table structure for table `casherUser`
--

CREATE TABLE `casherUser` (
  `userName` varchar(20) NOT NULL,
  `psswd` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `casherUser`
--

INSERT INTO `casherUser` (`userName`, `psswd`) VALUES
('user', 'user'),
('user', 'user'),
('user', 'user123');

-- --------------------------------------------------------

--
-- Table structure for table `desert`
--

CREATE TABLE `desert` (
  `name` text NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `desert`
--

INSERT INTO `desert` (`name`, `price`) VALUES
('cup cacke', 30),
('pane cake', 40);

-- --------------------------------------------------------

--
-- Table structure for table `drawings`
--

CREATE TABLE `drawings` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `cash` float NOT NULL,
  `date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `drinks`
--

CREATE TABLE `drinks` (
  `name` text NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drinks`
--

INSERT INTO `drinks` (`name`, `price`) VALUES
('hot choclate', 15),
('Nescafe', 12),
('tea', 20),
('coffe', 90);

-- --------------------------------------------------------

--
-- Table structure for table `hotDrinks`
--

CREATE TABLE `hotDrinks` (
  `name` text NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotDrinks`
--

INSERT INTO `hotDrinks` (`name`, `price`) VALUES
('tea', 8),
('Espresso', 10),
('mocha', 10),
('hot choclate', 19);

-- --------------------------------------------------------

--
-- Table structure for table `itemNumer`
--

CREATE TABLE `itemNumer` (
  `item` varchar(20) NOT NULL,
  `qnt` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `koktail`
--

CREATE TABLE `koktail` (
  `name` text NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `koktail`
--

INSERT INTO `koktail` (`name`, `price`) VALUES
('koktails one ', 30),
('koktails Two', 23);

-- --------------------------------------------------------

--
-- Table structure for table `milkShake`
--

CREATE TABLE `milkShake` (
  `name` text NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `milkShake`
--

INSERT INTO `milkShake` (`name`, `price`) VALUES
('rosperry', 25),
('Vanelia', 20),
('Mango', 30),
('Chocolate', 25);

-- --------------------------------------------------------

--
-- Table structure for table `morningBill`
--

CREATE TABLE `morningBill` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `morningBill`
--

INSERT INTO `morningBill` (`billNum`, `date`, `total`) VALUES
(25, '02/04/2019', 246),
(26, '02/04/2019', 125),
(28, '02/04/2019', 180);

-- --------------------------------------------------------

--
-- Table structure for table `mrngShiftDelivery`
--

CREATE TABLE `mrngShiftDelivery` (
  `billNum` int(20) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mrngShiftOrder`
--

CREATE TABLE `mrngShiftOrder` (
  `billNum` int(11) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mrngShiftOrder`
--

INSERT INTO `mrngShiftOrder` (`billNum`, `date`, `total`) VALUES
(25, '02/04/2019', 246),
(26, '02/04/2019', 125),
(28, '02/04/2019', 180);

-- --------------------------------------------------------

--
-- Table structure for table `mrngShiftTakeaway`
--

CREATE TABLE `mrngShiftTakeaway` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mrngShiftTakeaway`
--

INSERT INTO `mrngShiftTakeaway` (`billNum`, `date`, `total`) VALUES
(27, '02/04/2019', 92);

-- --------------------------------------------------------

--
-- Table structure for table `nightSale`
--

CREATE TABLE `nightSale` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nightSale`
--

INSERT INTO `nightSale` (`billNum`, `date`, `total`) VALUES
(13, '24/03/2019', 106),
(14, '24/03/2019', 54),
(15, '24/03/2019', 154),
(19, '24/03/2019', 230),
(23, '24/03/2019', 50);

-- --------------------------------------------------------

--
-- Table structure for table `nightShiftDelivry`
--

CREATE TABLE `nightShiftDelivry` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nightShiftDelivry`
--

INSERT INTO `nightShiftDelivry` (`billNum`, `date`, `total`) VALUES
(21, '24/03/2019', 400),
(22, '24/03/2019', 400);

-- --------------------------------------------------------

--
-- Table structure for table `nightShiftOrder`
--

CREATE TABLE `nightShiftOrder` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nightShiftOrder`
--

INSERT INTO `nightShiftOrder` (`billNum`, `date`, `total`) VALUES
(13, '24/03/2019', 106),
(14, '24/03/2019', 54),
(15, '24/03/2019', 154),
(16, '24/03/2019', 60),
(17, '24/03/2019', 70),
(19, '24/03/2019', 230),
(23, '24/03/2019', 50);

-- --------------------------------------------------------

--
-- Table structure for table `nightShiftTakeaway`
--

CREATE TABLE `nightShiftTakeaway` (
  `billNum` int(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nightShiftTakeaway`
--

INSERT INTO `nightShiftTakeaway` (`billNum`, `date`, `total`) VALUES
(18, '24/03/2019', 120),
(20, '24/03/2019', 100),
(24, '24/03/2019', 800);

-- --------------------------------------------------------

--
-- Table structure for table `s`
--

CREATE TABLE `s` (
  `id` int(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `cash` int(20) NOT NULL,
  `date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `s`
--

INSERT INTO `s` (`id`, `name`, `cash`, `date`) VALUES
(16, 'Clean tools', 100, '23/03/2019'),
(17, 'mohamed ', 100, '23/03/2019');

-- --------------------------------------------------------

--
-- Table structure for table `salesReview`
--

CREATE TABLE `salesReview` (
  `billno` int(10) NOT NULL,
  `item` varchar(20) NOT NULL,
  `qnt` int(10) NOT NULL,
  `amount` int(10) NOT NULL,
  `date` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salesReview`
--

INSERT INTO `salesReview` (`billno`, `item`, `qnt`, `amount`, `date`) VALUES
(13, 'tea', 2, 16, '24/03/2019'),
(13, 'Espresso', 4, 40, '24/03/2019'),
(13, 'koktails one ', 2, 60, '24/03/2019'),
(13, 'koktails Two', 2, 46, '24/03/2019'),
(14, 'tea', 2, 16, '24/03/2019'),
(14, 'hot choclate', 2, 38, '24/03/2019'),
(15, 'hot choclate', 1, 19, '24/03/2019'),
(15, 'Espresso', 1, 10, '24/03/2019'),
(15, 'cup cacke', 1, 30, '24/03/2019'),
(15, 'koktails Two', 5, 115, '24/03/2019'),
(15, 'Nescafe', 2, 24, '24/03/2019'),
(15, 'coffe', 1, 90, '24/03/2019'),
(15, 'tea', 2, 40, '24/03/2019'),
(16, 'tea', 3, 60, '24/03/2019'),
(17, 'Espresso', 3, 30, '24/03/2019'),
(17, 'tea', 2, 40, '24/03/2019'),
(18, 'Espresso', 2, 20, '24/03/2019'),
(18, 'hot choclate', 1, 19, '24/03/2019'),
(18, 'hot choclate', 1, 19, '24/03/2019'),
(18, 'Chocolate', 4, 100, '24/03/2019'),
(18, 'cup cacke', 5, 150, '24/03/2019'),
(18, 'pane cake', 3, 120, '24/03/2019'),
(19, 'cup cacke', 5, 150, '24/03/2019'),
(19, 'koktails Two', 10, 230, '24/03/2019'),
(20, 'Espresso', 10, 100, '24/03/2019'),
(21, 'pane cake', 10, 400, '24/03/2019'),
(23, 'tea', 5, 40, '24/03/2019'),
(23, 'Espresso', 1, 10, '24/03/2019'),
(24, 'pane cake', 20, 800, '24/03/2019'),
(25, 'koktails Two', 2, 46, '02/04/2019'),
(25, 'mocha', 2, 20, '02/04/2019'),
(25, 'Mango', 2, 60, '02/04/2019'),
(25, 'Mango', 2, 60, '02/04/2019'),
(25, 'Mango', 2, 60, '02/04/2019'),
(26, 'pane cake', 40, 1, '02/04/2019'),
(26, 'pane cake', 40, 1, '02/04/2019'),
(26, 'pane cake', 40, 1, '02/04/2019'),
(26, 'pane cake', 40, 1, '02/04/2019'),
(26, 'pane cake', 40, 1, '02/04/2019'),
(26, 'pane cake', 40, 1, '02/04/2019'),
(26, 'rosperry', 2, 25, '02/04/2019'),
(26, 'rosperry', 1, 25, '02/04/2019'),
(27, 'Vanelia', 3, 20, '02/04/2019'),
(27, 'tea', 2, 8, '02/04/2019'),
(27, 'tea', 2, 8, '02/04/2019'),
(28, 'koktails one ', 2, 30, '02/04/2019'),
(28, 'koktails one ', 2, 30, '02/04/2019'),
(28, 'koktails one ', 2, 30, '02/04/2019');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userName` varchar(20) NOT NULL,
  `psswd` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userName`, `psswd`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billNum`);

--
-- Indexes for table `s`
--
ALTER TABLE `s`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `s`
--
ALTER TABLE `s`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
