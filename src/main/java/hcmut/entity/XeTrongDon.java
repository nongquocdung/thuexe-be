package hcmut.entity;

import hcmut.enumeration.TruyenDong;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "XeTrongDon")
public class XeTrongDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hang_xe")
    private String hangXe;

    @Column(name = "loai_xe")
    private String loaiXe;

    @Column(name = "mau_xe")
    private String mauXe;

    @Column(name = "truyen_dong")
    @Enumerated(EnumType.STRING)
    private TruyenDong truyenDong;

    @Column(name = "so_luong")
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "id_yeu_cau_thue_xe", referencedColumnName = "id")
    private YeuCauThueXe yeuCauThueXe;
}
