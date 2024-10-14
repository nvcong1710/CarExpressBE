package com.uit.website_ban_sach.service.service_interface;

import com.uit.website_ban_sach.dto.dto_entity.TaiKhoanDTO;
import com.uit.website_ban_sach.dto.request.LoginRequest;
import com.uit.website_ban_sach.entity.TaiKhoan;

import java.util.List;

public interface ITaiKhoanService {
    public TaiKhoan register(TaiKhoan taiKhoan);
    public TaiKhoanDTO login(LoginRequest loginRequest);

    public List<TaiKhoanDTO> getAllTaiKhoan();
}
