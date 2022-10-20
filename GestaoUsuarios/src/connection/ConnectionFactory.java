package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Augusto Chissano
 */
public class ConnectionFactory {

    /**
     * Nesta classe temos o metodo que cria uma fabrica para as entitymanagers
     * que nos permitirao interagir com a base de dados.
     *
     * @return EntityManagerFactory
     */
    public static EntityManagerFactory getEmf() {
        return Persistence.createEntityManagerFactory("GestaoUsuariosPU");
    }

}
