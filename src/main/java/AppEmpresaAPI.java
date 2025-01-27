import com.sanalberto.svp.services.DepartamentoService;

import java.util.ArrayList;

public class AppEmpresaAPI {
    public static void main(String[] args) {
        DepartamentoService ds = new DepartamentoService();
        ArrayList<String> deps = ds.listarDepartamentos();
        for (String dep : deps) {
            System.out.println(dep);
        }
    }
}
