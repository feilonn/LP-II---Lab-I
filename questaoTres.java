import java.util.Scanner;
import java.util.Locale;

public class questaoTres
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        int totalFuncionarios;
        double salariosBase = 800;
        double pagaHora;
        
        System.out.println("Informe o pagamento por hora: ");
        pagaHora = input.nextDouble();
        
        System.out.println("Total de funcionarios: ");
        totalFuncionarios = input.nextInt();
        
        String[] vendedores = new String[totalFuncionarios]; // guarda os nomes dos funcionarios
        int[] horasFuncionarios = new int[totalFuncionarios]; // guarda as horas dos funcionarios
        double[] pagaFuncionarios = new double[totalFuncionarios]; //guarda os salarios dos funcionarios
        
        //Pegar nome dos funcionarios
        for(int i = 0; i < totalFuncionarios; i++){
            System.out.println("Informe o nome do "+(i+1)+"ª funcionario: ");
            vendedores[i] = input.next();
        }
        
        //Pegar as horas trabalhadas dos funcionarios
        for(int i = 0; i < totalFuncionarios; i++){
            System.out.println("Informe quantas horas trabalhou o funcionario: "+vendedores[i]);
            horasFuncionarios[i] = input.nextInt();
        }
        
        //Calcular o salario semanal dos funcionarios
        for(int i = 0; i < totalFuncionarios; i++){
            if(horasFuncionarios[i] <= 40){
                pagaFuncionarios[i] = horasFuncionarios[i] * pagaHora;
            }else{
                pagaFuncionarios[i] = ((horasFuncionarios[i] - 40) * (pagaHora * 0.5) + (horasFuncionarios[i] - (horasFuncionarios[i] - 40)) * pagaHora);
            }
        }
        
        //Imprime pagamento
        for(int i = 0; i < totalFuncionarios; i++){
            System.out.println("*********************************************************************************************");
            System.out.println("O funcionario: "+vendedores[i]+" trabalhou "+horasFuncionarios[i]+" horas nesta essa semana,"+" e "
            + "receberá R$"+pagaFuncionarios[i]);
        }
    }
