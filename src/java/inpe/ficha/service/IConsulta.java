package inpe.ficha.service;

import java.util.List;

public interface IConsulta<T> {
    //definir las firmas

    List<T> listar() throws Exception;

    List<T> listar(String nombre) throws Exception;

    List<T> listar(int id) throws Exception;

    T buscar(String id) throws Exception;
}
