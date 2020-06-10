-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10 Jun 2020 pada 14.26
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mas_tegar`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `form_login`
--

CREATE TABLE `form_login` (
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `form_login`
--

INSERT INTO `form_login` (`username`, `password`) VALUES
('kasir', 'kasir'),
('', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `form_pemesanan`
--

CREATE TABLE `form_pemesanan` (
  `pesanan` varchar(100) NOT NULL,
  `harga` varchar(30) NOT NULL,
  `jumlah` varchar(100) NOT NULL,
  `nomeja` varchar(10) NOT NULL,
  `pemesan` varchar(30) NOT NULL,
  `jumlah_orang` varchar(100) NOT NULL,
  `jenis` varchar(15) NOT NULL,
  `total` varchar(50) NOT NULL,
  `bayar` varchar(50) NOT NULL,
  `kembalian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `form_pemesanan`
--

INSERT INTO `form_pemesanan` (`pesanan`, `harga`, `jumlah`, `nomeja`, `pemesan`, `jumlah_orang`, `jenis`, `total`, `bayar`, `kembalian`) VALUES
('5. Bakso Tenes', '25000', '1', '3', 'cherly', '1', 'Dine In', 'Rp. 25000', '30000', 'Rp. 5000'),
('10. Soto Ayam', '20000', '10', '9', 'chrys', '5', 'Take Away', 'Rp. 200000', '300000', 'Rp. 100000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
