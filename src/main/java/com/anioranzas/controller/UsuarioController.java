package com.anioranzas.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anioranzas.model.Empleado;
import com.anioranzas.model.ErrorRest;
import com.anioranzas.repository.EmpleadoRepo;



import java.util.List;



@RestController
@RequestMapping("/api/")
public class UsuarioController {
	
	@Autowired
	EmpleadoRepo empleadoRepo;
	

    @GetMapping("/empleados")
    public  List<Empleado> list() {
        List<Empleado> result = empleadoRepo.findAll();
        if (result != null)
            return result;
        else
        	throw new EmpleadoNotFoundException();
    }
    @GetMapping("empleado/{id}")
    public Empleado getEmpleado(@PathVariable Long id){
    	Empleado result=empleadoRepo.findOne(id);
    	if(result!=null)
    		return result;
    	else
    		throw new EmpleadoNotFoundException(id);
    }
/*    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado, HttpServletResponse response){
    	Empleado nuevo=new Empleado(empleado.getNombre(), empleado.getApellidos(), empleado.getFechaNacimiento());
    	response.setStatus(201);
    	return empleadoRepo.save(nuevo);
    }*/
    
    @PostMapping("/empleado")
    public ResponseEntity<?> createEmpleado(RequestEntity<Empleado> reqEmpleado) {

        if (reqEmpleado.getBody() == null) {
            return new ResponseEntity<ErrorRest>(new ErrorRest("Formato de petición incorrecto. Debe enviar los datos del empleado a dar de alta"),
                    HttpStatus.BAD_REQUEST);
        }

        Empleado empleado = reqEmpleado.getBody();

        if (empleadoRepo.findOne(empleado.getId()) != null) {
            return new ResponseEntity<ErrorRest>(new ErrorRest("El empleado con ID " + empleado.getId() + " ya existe"),
                    HttpStatus.CONFLICT);
        } else {
            return new ResponseEntity<Empleado>(empleadoRepo.save(empleado), HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/empleado/{id}")
    public ResponseEntity<?> deleteEmpleado(@PathVariable Long id) {

        Empleado aBorrar = empleadoRepo.findOne(id);
        if (aBorrar != null) {
            empleadoRepo.delete(aBorrar);
            return new ResponseEntity<Empleado>(aBorrar, HttpStatus.OK);
        } else {
            return new ResponseEntity<ErrorRest>(new ErrorRest("El empleado a borrar no existe"),
                    HttpStatus.NOT_FOUND);
        }

    }
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    private class EmpleadoNotFoundException extends RuntimeException{
    	private static final long serialVersionUID =1L;
    	public EmpleadoNotFoundException(){
    		super("no existe ningun empelado");
    	}
    	public EmpleadoNotFoundException(Long id){
    		super(String.format("no existe ningun empleado con el ID=%id",id ));
    	}
    
    }
    


}
