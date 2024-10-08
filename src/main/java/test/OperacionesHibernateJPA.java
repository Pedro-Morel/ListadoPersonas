package test;

import com.pedro.dao.PersonaDAO;
import com.pedro.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(21);
        
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("Persona encontrada: " + persona);
        
//        persona.setNombre("Leandro");
//        persona.setApellido("Ortigoza");
//        persona.setEmail("leandroo@mail.com");
//        persona.setTelefono("369258");
//        
        //personaDao.insertar(persona);
        
//        personaDao.modificar(persona);
        personaDao.eliminar(persona);
        personaDao.listar(); 
    }
}
