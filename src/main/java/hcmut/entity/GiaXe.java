package hcmut.entity;

import hcmut.enumeration.DonVi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "GiaXe")
public class GiaXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "don_gia")
    private int donGia;

    @Column(name = "don_vi")
    private DonVi donVi;

    @ManyToOne
    @JoinColumn(name = "id_xe", referencedColumnName = "id")
    private Xe xe;
}
