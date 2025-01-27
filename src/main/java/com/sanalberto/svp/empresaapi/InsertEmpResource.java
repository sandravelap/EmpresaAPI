package com.sanalberto.svp.empresaapi;

import com.google.gson.Gson;
import com.sanalberto.svp.dto.EmpleadoDTO;
import com.sanalberto.svp.services.EmpleadoServices;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/insertEmp")
public class InsertEmpResource {
    private EmpleadoServices empleadoService = new EmpleadoServices();
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String insertEmp(String jsonNuevoEmpleado) {
        String respuesta = "";
        Gson gson = new Gson();
        EmpleadoDTO empleadoDTO = gson.fromJson(jsonNuevoEmpleado, EmpleadoDTO.class);
        respuesta = empleadoService.insertarEmpleado(empleadoDTO);
        return respuesta;
    }
}
