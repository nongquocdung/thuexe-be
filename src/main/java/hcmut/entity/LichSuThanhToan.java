package hcmut.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "LichSuThanhToan")
public class LichSuThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "thoi_diem")
    private LocalDateTime thoiDiem;

    @Column(name = "so_tien")
    private double soTien;

    @ManyToOne
    @JoinColumn(name = "id_giao_dich", referencedColumnName = "id")
    private GiaoDich giaoDich;
}
