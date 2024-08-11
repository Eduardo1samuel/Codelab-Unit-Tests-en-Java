package com.SpringBoot.JunitTest.PackajeUsoUnitTests;

public class NotificadorEmail {
    private EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        if (direccion == null || direccion.isEmpty()) {
            return;
        }
        if (mensaje == null) {
            mensaje = "";
        }
        emailCliente.enviarCorreo(direccion, mensaje);
    }
}
