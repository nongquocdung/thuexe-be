package hcmut.entity;

import hcmut.enumeration.GioiTinh;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NonNull
@Embeddable
public class ThongTinCoBan {
    private String ten;
    @NonNull
    private String cccd;
    private String email;
    private String soDienThoai;
    private GioiTinh gioiTinh;
}
