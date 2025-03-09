package br.com.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.screenmatch.modelo.Titulo;
import br.com.screenmatch.modelo.TituloOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner tc = new Scanner(System.in);
        String nomeFilme;

        System.out.print("Digite o nome do filme que desaja saber as informações: ");
        nomeFilme = tc.nextLine();
        nomeFilme = nomeFilme.replace(" ", "+");
        System.out.println(nomeFilme);


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://www.omdbapi.com/?t=" + nomeFilme + "&apikey=bb6f5dad"))
            .build();
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Titulo convertido");
        System.out.println(meTitulo);


        tc.close();
    }
}
