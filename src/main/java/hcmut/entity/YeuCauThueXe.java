package hcmut.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NonNull
@Entity
@Table(name = "YeuCauThueXe")
public class YeuCauThueXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "thoi_gian_giao_xe")
    LocalDate thoiGianGiaoXe;

    @Column(name = "thoi_gian_nhan_xe")
    LocalDate thoiGianNhanXe;

    @Column(name = "dia_diem_giao_xe")
    private String diaDiemGiaoXe;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "con_moi")
    private boolean conMoi;

    @Column(name = "co_bao_hiem")
    private boolean coBaoHiem;

    @Column(name = "co_camera")
    private boolean coCamera;

    @Column(name = "co_man_hinh")
    private boolean coManHinh;

    @Column(name = "co_GPS")
    private boolean coGPS;

    @Column(name = "so_luong_tai_xe")
    private int soLuongTaiXe;
}
