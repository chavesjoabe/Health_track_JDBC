package br.com.fiap.healthtrack;

import SystemEntities.HealthTrackDbManager;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class testeConnectionHT {
    public static void main(String[] args) {


        /*//lista com mais 5 registros de peso, fora os que ja foram inseridos
        List<Peso> novosPesos = new ArrayList<Peso>();
        novosPesos.add(new Peso(11, 1234, 123.3, "15/06/2020"));
        novosPesos.add(new Peso(12, 1234, 123.3, "30/06/2020"));
        novosPesos.add(new Peso(13, 1234, 123.3, "10/07/2020"));
        novosPesos.add(new Peso(14, 1234, 123.3, "22/08/2020"));
        novosPesos.add(new Peso(15, 1234, 123.3, "20/09/2020"));



        //loop para inserçao dos novos pesos no BD
        for (Peso peso : novosPesos) {
            pesoDao.insert(peso);
        }*/
        //instancia do pesoDao
        PesoDao pesoDao = new PesoDao();

        //metodo que retorna todos os pesos do banco de dados
        System.out.println(pesoDao.getAll());

        //metodo que atualiza os dados de um peso a partir da coluna cd_weight
        System.out.println("Resultado do metodo UPDATE() \n");
        pesoDao.update(144, "25/10/2020", 14);
        System.out.println(pesoDao.getById(14));
        System.out.println();

        //metodo que deleta um registro de peso a partir da coluna cd_weight
        /*System.out.println("Resultado do metodo DELETE()\n");
        pesoDao.delete(14);
        pesoDao.getAll().clear();
        System.out.println(pesoDao.getAll());*/

    }
}
