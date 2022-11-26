package Kodlama.io.Devs.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Language")

public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "language")
    private List<SubTech> subTeches;



}
