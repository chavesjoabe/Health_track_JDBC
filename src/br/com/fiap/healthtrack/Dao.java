package br.com.fiap.healthtrack;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Peso getById(int cod);
    List<T> getAll();
    void insert(T t);
    void update(double newPeso, String newData,int ID);
    void delete(int idx);
}
