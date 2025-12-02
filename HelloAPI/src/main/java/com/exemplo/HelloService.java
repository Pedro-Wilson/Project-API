package com.exemplo;

import jakarta.ejb.Stateless;

/**
 * EJB Stateless que contém a lógica de negócio.
 * Será injetado no recurso JAX-RS.
 */
@Stateless
public class HelloService {

    public String sayHello(String name) {
        return "Olá, " + name + "! Bem-vindo à API EJB.";
    }
}
