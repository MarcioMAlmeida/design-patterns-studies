package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveNotificarCliente() {
        App app =  new App("Bradesco");
        Usuario usuario = new Usuario("Marcio");
        usuario.abrirConta(app);
        app.avisarAtualizacao();
        assertEquals("Bradesco: Marcio seu aplicativo tem uma atualização disponivel.", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        App app =  new App("Bradesco");
        Usuario usuario = new Usuario("Marcio");
        Usuario usuario2 = new Usuario("Iasmyn");
        usuario.abrirConta(app);
        usuario2.abrirConta(app);
        app.avisarAtualizacao();
        assertEquals("Bradesco: Marcio seu aplicativo tem uma atualização disponivel.", usuario.getUltimaNotificacao());
        assertEquals("Bradesco: Iasmyn seu aplicativo tem uma atualização disponivel.", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        App app =  new App("Bradesco");
        Usuario usuario = new Usuario("Marcio");
        app.avisarAtualizacao();
        assertEquals(null, usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientesBradesco() {
        App app =  new App("Bradesco");
        App app2 =  new App("Caixa");
        Usuario usuario = new Usuario("Marcio");
        Usuario usuario2 = new Usuario("Iasmyn");
        usuario.abrirConta(app);
        usuario2.abrirConta(app2);
        app.avisarAtualizacao();
        assertEquals("Bradesco: Marcio seu aplicativo tem uma atualização disponivel.", usuario.getUltimaNotificacao());
        assertEquals(null, usuario2.getUltimaNotificacao());
    }
}