package com.sanalberto.svp.empresaapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sanalberto.svp.services.DepartamentoService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.ArrayList;

@Path("/hello-world")
public class HelloResource {
    private DepartamentoService departamentoService = new DepartamentoService();
    @GET
    @Produces("application/json")
    public String hello() {
        String respuesta = "Lista de departamentos: \n";
        ArrayList<String> deps;
        deps = departamentoService.listarDepartamentos();
        //creamos el constructor de parseadores gson
        GsonBuilder gsonBuilder = new GsonBuilder();
        //creamos el gson con la opción de indentar correctamente al generar el JSON
        //podríamos instanciar un Gson directamente pero no con la opción prettyprinting
        Gson gson =  gsonBuilder.setPrettyPrinting().create();
        //generamos con Gson el String a volcar en el archivo
        respuesta = gson.toJson(deps);
        return respuesta;
    }
}