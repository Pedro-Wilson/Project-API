package com.exemplo;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Configuração inicial do JAX-RS.
 * Define o caminho base da API como /api.
 */
@ApplicationPath("/api")
public class RestApplication extends Application {
    // Não é necessário implementar nada dentro da classe neste exemplo simples
}