package Kodlama.io.Devs.demo.dataAccess;

import Kodlama.io.Devs.demo.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageRepository extends JpaRepository<Language,Integer> {




}
