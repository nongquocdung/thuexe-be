package hcmut.entity;

import javax.persistence.*;

@Entity
public class Xe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hang_xe")
    private String hangXe;

    @Column(name = "loai_xe")
    private String loaiXe;
}
