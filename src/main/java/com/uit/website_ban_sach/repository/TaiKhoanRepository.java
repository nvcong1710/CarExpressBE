package com.uit.website_ban_sach.repository;

import com.uit.website_ban_sach.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long> {
    TaiKhoan findByUsername(String username);
}
