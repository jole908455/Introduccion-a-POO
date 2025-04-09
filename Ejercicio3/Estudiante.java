public static void main(String[] args) {
        // Crear tres estudiantes
        Estudiante estudiante1 = new Estudiante("Ana", 7.5, 8.0);
        Estudiante estudiante2 = new Estudiante("Luis", 5.0, 6.5);
        Estudiante estudiante3 = new Estudiante("Marta", 4.0, 3.5);

        // Mostrar información de cada estudiante
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante3.mostrarInfo();
    }
}