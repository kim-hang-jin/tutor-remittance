package untact_tutor_store판ㅁ;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Remittance_table")
public class Remittance {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
