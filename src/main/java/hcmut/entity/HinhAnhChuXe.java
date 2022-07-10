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
@Table(name = "HinhAnhChuXe")
public class HinhAnhChuXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "loai_hinh_anh")
    private LoaiHinhAnhNguoi loaiHinhAnh;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_chu_xe", referencedColumnName = "id")
    private ChuXe chuXe;
}
