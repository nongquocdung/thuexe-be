package hcmut.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NonNull
@Entity
@Table(name = "TaiXe")
public class TaiXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="ten", column=@Column(name="ten")),
            @AttributeOverride(name="cccd", column=@Column(name="cccd")),
            @AttributeOverride(name="email", column=@Column(name="email")),
            @AttributeOverride(name="soDienThoai", column=@Column(name="so_dien_thoai")),
            @AttributeOverride(name="gioiTinh", column=@Column(name="gioi_tinh"))
    })
    private ThongTinCoBan thongTinCoBan;

    @ManyToOne
    @JoinColumn(name = "id_chu_xe", referencedColumnName = "id")
    private ChuXe chuXe;
}
