package ex10;

public class Exercicio10 {
    public static void main(String[] args) {
        String[] biomas =  {"Amazônia", "Mata Atlântica", "Cerrado","Caatinga", "Pampa", "Pantanal"};
        String[] novoBiomas;

        
            
            
            
            biomas[3]=null;
        for (int i = 0; i < biomas.length; i++) {
            //novoBiomas[i]=biomas[i];

            System.out.printf("%s, ",biomas[i]);
        }
       
        
    }
}
