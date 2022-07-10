package hcmut.entity;

import hcmut.enumeration.LoaiHinhAnhXe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NonNull
@Entity
@Table(name = "HinhAnhXe")
public class HinhAnhXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "loai_hinh_anh")
    private LoaiHinhAnhXe loaiHinhAnh;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_xe", referencedColumnName = "id")
    private Xe xe;
}
