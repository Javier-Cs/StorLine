package com.example.StorLine.tools;

import java.util.UUID;

public final class GenerarCode {
    public static String generarCode(){
        // Genera un UUID y toma una parte de su hash para obtener un número
        UUID uuid = UUID.randomUUID();

        // El hashCode puede ser negativo, usamos Math.abs para asegurarnos que sea positivo
        int hash = Math.abs(uuid.hashCode());

        String code = String.format("%04d", hash % 10000);

        return  "CD"+code;
    }
}
