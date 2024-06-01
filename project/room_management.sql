-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 01, 2024 lúc 05:28 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `room_management`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `ID` int(11) NOT NULL,
  `IDCustomer` int(11) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `DateCreat` date DEFAULT NULL,
  `Role` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`ID`, `IDCustomer`, `Username`, `Password`, `DateCreat`, `Role`) VALUES
(1, 1, 'admin', '$2a$10$BDFuRR1KpVmA6KTNB3Zr5.V1ZtdOn8C5UejrYDmRAJb', '2024-05-01', 1),
(2, 1, 'minhkhanh2002', '123', '2024-05-01', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customer`
--

CREATE TABLE `customer` (
  `ID` int(11) NOT NULL,
  `HoVaTen` varchar(50) DEFAULT NULL,
  `GioiTinh` varchar(5) DEFAULT NULL,
  `CCCD` varchar(12) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `DiaChiThuongTru` varchar(255) DEFAULT NULL,
  `QuocTich` varchar(50) DEFAULT NULL,
  `DienThoai` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `customer`
--

INSERT INTO `customer` (`ID`, `HoVaTen`, `GioiTinh`, `CCCD`, `NgaySinh`, `DiaChiThuongTru`, `QuocTich`, `DienThoai`) VALUES
(1, 'Ngô Minh Khánh', 'Nam', '123456789', '2002-09-01', 'Bình Dương', 'Việt Nam', '0123321123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rent`
--

CREATE TABLE `rent` (
  `ID` int(11) NOT NULL,
  `IDCustomer` int(11) DEFAULT NULL,
  `IDRoom` int(11) DEFAULT NULL,
  `GiaPhong` double DEFAULT NULL,
  `TienDatCoc` double DEFAULT NULL,
  `NgayThue` date DEFAULT NULL,
  `NgayHetHan` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(1, 'ADMIN'),
(2, 'USER');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `ID` int(11) NOT NULL,
  `TenPhong` varchar(50) DEFAULT NULL,
  `IDLoaiPhong` int(11) DEFAULT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `TrangThai` int(11) DEFAULT NULL,
  `MoTa` varchar(500) DEFAULT NULL,
  `HinhAnh` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`ID`, `TenPhong`, `IDLoaiPhong`, `DiaChi`, `TrangThai`, `MoTa`, `HinhAnh`) VALUES
(1, 'PT001', 2, 'Quận Thủ Đức', 1, NULL, NULL),
(2, 'PT002', 2, 'Quận Thủ Đức', 1, NULL, NULL),
(3, 'CC001', 1, 'Quận 7', 1, NULL, NULL),
(4, 'CC1203', 1, 'Quận 7', 1, NULL, NULL),
(5, 'CC0812', 1, 'Quận 7', 1, NULL, NULL),
(6, 'NP001', 3, 'Quận Tân Bình', 3, NULL, NULL),
(7, 'NP002', 3, 'Quận Tân Bình', 1, NULL, NULL),
(8, 'BT001', 4, 'Quận 7', 4, NULL, NULL),
(9, 'BT002', 4, 'Quận 7', 1, NULL, NULL),
(10, 'BT003', 4, 'Quận Thủ Đức', 1, NULL, NULL),
(11, 'PT003', 2, 'Quận Thủ Đức', 1, NULL, NULL),
(12, 'PT004', 2, 'Quận Thủ Đức', 1, NULL, NULL),
(13, 'PT005', 2, 'Quận Thủ Đức', 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roomtype`
--

CREATE TABLE `roomtype` (
  `ID` int(11) NOT NULL,
  `TenLoaiPhong` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `roomtype`
--

INSERT INTO `roomtype` (`ID`, `TenLoaiPhong`) VALUES
(1, 'Chung Cư'),
(2, 'Phòng Trọ'),
(3, 'Nhà Phố'),
(4, 'Biệt Thự');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `status`
--

CREATE TABLE `status` (
  `ID` int(11) NOT NULL,
  `Status` varchar(50) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `status`
--

INSERT INTO `status` (`ID`, `Status`) VALUES
(1, 'Đang Trống'),
(2, 'Đang Cho Thuê'),
(3, 'Đang Nâng Cấp'),
(4, 'Không Khả Dụng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birthday` datetime(6) DEFAULT NULL,
  `cccd` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `gender` bit(1) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `address`, `birthday`, `cccd`, `email`, `enabled`, `fullname`, `gender`, `password`, `telephone`, `username`) VALUES
(1, 'Bình Dương', '2002-09-01 00:00:00.000000', '123456', 'admin@email.com', b'1', 'Admin', b'1', '$2a$10$YnWGEAZ7tTcLS40uNRWrsuozvvDkr6WWoLRevzj4cx74QBnHGJVZa', '0123321123', 'admin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users_roles`
--

CREATE TABLE `users_roles` (
  `id` bigint(20) NOT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users_roles`
--

INSERT INTO `users_roles` (`id`, `role_id`, `user_id`) VALUES
(1, 1, 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK1_Customer` (`IDCustomer`);

--
-- Chỉ mục cho bảng `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `IDRoom` (`IDRoom`),
  ADD KEY `IDCustomer` (`IDCustomer`);

--
-- Chỉ mục cho bảng `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `IDLoaiPhong` (`IDLoaiPhong`),
  ADD KEY `TrangThai` (`TrangThai`);

--
-- Chỉ mục cho bảng `roomtype`
--
ALTER TABLE `roomtype`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `users_roles`
--
ALTER TABLE `users_roles`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  ADD KEY `FK2o0jvgh89lemvvo17cbqvdxaa` (`user_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `account`
--
ALTER TABLE `account`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `rent`
--
ALTER TABLE `rent`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `room`
--
ALTER TABLE `room`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT cho bảng `roomtype`
--
ALTER TABLE `roomtype`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `status`
--
ALTER TABLE `status`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `users_roles`
--
ALTER TABLE `users_roles`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `FK1_Customer` FOREIGN KEY (`IDCustomer`) REFERENCES `customer` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `rent`
--
ALTER TABLE `rent`
  ADD CONSTRAINT `FK1` FOREIGN KEY (`IDRoom`) REFERENCES `room` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_rent_customer` FOREIGN KEY (`IDCustomer`) REFERENCES `customer` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `FK1_RoomType` FOREIGN KEY (`IDLoaiPhong`) REFERENCES `roomtype` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_room_status` FOREIGN KEY (`TrangThai`) REFERENCES `status` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FK2o0jvgh89lemvvo17cbqvdxaa` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
