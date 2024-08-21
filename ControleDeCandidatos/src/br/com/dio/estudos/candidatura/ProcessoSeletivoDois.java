package br.com.dio.estudos.candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoDois {

    public static void main(String[] args) {    
        List<String> candidatosSelecionados = selecaoCandidatos();

        System.out.println("\nIniciando contato com os candidatos selecionados:\n");
        for(String candidato: candidatosSelecionados) {
            entrandoEmContato(candidato);
        }
    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static List<String> selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "JÚLIA", "MÁRCIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        
        List<String> selecionados = new ArrayList<>();
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        while(selecionados.size() < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("\nO candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                selecionados.add(candidato);
                
            }
            candidatosAtual++;
            
        }
        
        System.out.println("\nCandidatos selecionados:\n");
        System.out.println(selecionados);
        return selecionados;
    }
    
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO COM " + candidato);
            
        } while(continuarTentando && tentativasRealizadas < 3); 
        
        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA\n");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS (" + tentativasRealizadas + ") REALIZADAS\n");
    }
    
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
