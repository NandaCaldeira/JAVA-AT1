public class Principal {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Luis", 23, "Caixa", true, 2.500);
        Funcionarios f2 = new Funcionarios("Gabriel", 30, "Atendente", true, 2.500);
        Funcionarios f3 = new Funcionarios("Mariana", 45, "Gerente", true, 4725.25);
        Funcionarios f4 = new Funcionarios("João", 29, "Supervisor", true, 4400.42);

        f1.demitir();
        f2.promover("Gerente");
        f3.aniversariar();
        f4.pagarSalario();

    }

}

