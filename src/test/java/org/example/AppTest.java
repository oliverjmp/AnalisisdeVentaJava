package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;

public class AppTest {
    public static void main(String[] args) {
        try (InputStream input = App.class.getResourceAsStream("/ventas.xlsx");
             Workbook workbook = new XSSFWorkbook(input)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Saltar encabezado

                String id = row.getCell(0).toString();
                String nombre = row.getCell(1).toString();
                String nacimiento = row.getCell(2).toString();
                String direccion = row.getCell(3).toString();
                String localidad = row.getCell(4).toString();
                String telefono = row.getCell(5).toString();
                String correo = row.getCell(6).toString();
                String alta = row.getCell(7).toString();
                String grupo = row.getCell(8).toString();

                System.out.printf(
                        "ID: %s | Nombre: %s | Nacimiento: %s | Dirección: %s | Localidad: %s | Teléfono: %s | Correo: %s | Alta: %s | Grupo: %s%n",
                        id, nombre, nacimiento, direccion, localidad, telefono, correo, alta, grupo
                );
            }

        } catch (Exception e) {
            System.err.println("Error al leer el archivo Excel:");
            e.printStackTrace();
        }
    }

}
