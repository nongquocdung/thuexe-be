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
@Table(name = "HinhAnhNguoi")
public class HinhAnhTaiXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "loai_hinh_anh")
    private LoaiHinhAnhNguoi loaiHinhAnh;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_tai_xe", referencedColumnName = "id")
    private TaiXe taiXe;
}
