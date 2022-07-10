package hcmut.entity;

import hcmut.enumeration.LoaiHinhAnhNguoi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NonNull
@Entity
@Table(name = "HinhAnhKhachHang")
public class HinhAnhKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "loai_hinh_anh")
    private LoaiHinhAnhNguoi loaiHinhAnh;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang", referencedColumnName = "id")
    private KhachHang khachHang;
}
