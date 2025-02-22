package com.uit.website_ban_sach.mapper;

import com.uit.website_ban_sach.dto.dto_entity.DanhMucDTO;
import com.uit.website_ban_sach.entity.DanhMuc;

public class DanhMucMapper {
    public static DanhMuc mapToDanhMuc(DanhMucDTO cDTO){
        return new DanhMuc(cDTO.getId(), cDTO.getTenDanhMuc());
    }

    public static DanhMucDTO mapToDanhMucDTO(DanhMuc c){
        return new DanhMucDTO(c.getId(), c.getTenDanhMuc());
    }
}
