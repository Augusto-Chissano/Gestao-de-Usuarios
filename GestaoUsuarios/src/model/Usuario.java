package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Está é a classe modelo de usuários, para o seguinte projecto usei o framework ORM Eclipselink e JPA
 * para a conexao da aplicacao com a base de dados MySQL.
 * E de forma a deixar o codigo mais enxuto e reducao de codigo boilerplate fiz o uso da biblioteca lombok.
 * 
 * @author Augusto Chissano
 */

@NamedQueries(
        {
    @NamedQuery(
            name = "Usuario.findByLikeNome",
            query = "SELECT u FROM Usuario u WHERE u.nome LIKE :nome")
}
)

@Entity
@Table(name = "Usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor 

public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String nomeUsuario;
    private String biografia;
    private String senha;
    private String estadoCivil;
    private String morada;
    private String contacto;

}
