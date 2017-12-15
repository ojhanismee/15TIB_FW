-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 15 Des 2017 pada 15.56
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1067`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_aksesoris_1067`
--

CREATE TABLE `tbl_aksesoris_1067` (
  `id` bigint(20) NOT NULL,
  `jenis` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `mobil_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_mobil_1067`
--

CREATE TABLE `tbl_mobil_1067` (
  `id` bigint(20) NOT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `tipe` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_aksesoris_1067`
--
ALTER TABLE `tbl_aksesoris_1067`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_b61iqxfpxuefvnp1cty0pphsd` (`name`),
  ADD KEY `FK4cmqq7mwfwjfbboaotnoc14io` (`mobil_id`);

--
-- Indexes for table `tbl_mobil_1067`
--
ALTER TABLE `tbl_mobil_1067`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_nupi5dpglblrir5w7xubp86vk` (`name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_aksesoris_1067`
--
ALTER TABLE `tbl_aksesoris_1067`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_mobil_1067`
--
ALTER TABLE `tbl_mobil_1067`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tbl_aksesoris_1067`
--
ALTER TABLE `tbl_aksesoris_1067`
  ADD CONSTRAINT `FK4cmqq7mwfwjfbboaotnoc14io` FOREIGN KEY (`mobil_id`) REFERENCES `tbl_mobil_1067` (`id`),
  ADD CONSTRAINT `FKi60mhmf8uq28og626e47bjd79` FOREIGN KEY (`id`) REFERENCES `tbl_mobil_1067` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
