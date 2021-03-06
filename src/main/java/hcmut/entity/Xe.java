package hcmut.entity;

import hcmut.enumeration.TruyenDong;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Xe")
public class Xe {
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

    @Column(name = "bien_so_xe")
    private String bienSoXe;

    @ManyToOne
    @JoinColumn(name = "id_chu_xe", referencedColumnName = "id")
    private ChuXe chuXe;

}
