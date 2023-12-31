package com.java.turnosrotativos.services;

import java.util.List;
import java.util.Optional;

import com.java.turnosrotativos.entities.Empleado;
import com.java.turnosrotativos.exceptions.BussinessException;

public interface EmpleadoService {

	// DAR DE ALTA UN EMPLEADO
	Empleado guardarEmpleado(Empleado empleado) throws BussinessException;

	// OBTENER LA LISTA DE EMPLEADOS
	List<Empleado> obtenerEmpleados();

	// OBTENER UN EMPLEADO A PARTIR DE SU ID
	Optional<Empleado> obtenerEmpleado(Long id);

	// ELIMINAR UN EMPLEADO.
	void eliminarEmpleado(Empleado empleado);
}
