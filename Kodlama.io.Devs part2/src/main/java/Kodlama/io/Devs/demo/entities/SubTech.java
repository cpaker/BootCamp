package Kodlama.io.Devs.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SubTech")

public class SubTech {

    @Id
    @GeneratedValue

    @Column
    private int id;
    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "LanguageId")
    private Language language;

}
