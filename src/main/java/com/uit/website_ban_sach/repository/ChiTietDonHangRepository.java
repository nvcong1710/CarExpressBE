package com.uit.website_ban_sach.repository;

import com.uit.website_ban_sach.entity.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long> {
    public List<ChiTietDonHang> findAllByDonHangId(Long id);
}
