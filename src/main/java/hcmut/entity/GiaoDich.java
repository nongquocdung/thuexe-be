package hcmut.entity;

import hcmut.enumeration.TrangThaiGiaoDich;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "GiaoDich")
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "han_thanh_toan_coc")
    private LocalDate hanThanhToanCoc;

    @Column(name = "han_thanh_toan_toan_bo")
    private LocalDate hanThanhToanToanBo;

    @Column(name = "trang_thai")
    private TrangThaiGiaoDich trangThai;

    @OneToOne
    @JoinColumn(name = "id_khach_hang", referencedColumnName = "id")
    private KhachHang khachHang;

    @OneToOne
    @JoinColumn(name = "id_yeu_cau_thue_xe", referencedColumnName = "id")
    private YeuCauThueXe yeuCauThueXe;
}
