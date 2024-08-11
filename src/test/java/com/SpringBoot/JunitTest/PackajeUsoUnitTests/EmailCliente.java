package com.SpringBoot.JunitTest.PackajeUsoUnitTests;

public class EmailCliente {
    public void enviarCorreo(String direccion, String mensaje) {
        System.out.println("Enviando correo a: " + direccion + " con mensaje: " + mensaje);
    }
}
