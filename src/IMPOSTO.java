import java.util.Locale;
import java.util.Scanner;

public class IMPOSTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double rendaSalario, rendaMensal, rendaServico, rendaGanhoCapital;
		double gastosMedicos, gastosEducacionais, impostoGanhoCapital;
		double gastosDedutiveis, maximoDedutivel, abatimento;
		double totalBruto, totalLiquido, impostoSalario, impostoServico;

		System.out.println("Renda anual com salario?");
		rendaSalario = sc.nextDouble();
		System.out.println("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		rendaGanhoCapital = sc.nextDouble();
		System.out.println("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

		rendaMensal = rendaSalario / 12.0;

		if (rendaMensal < 3000.0) {
			impostoSalario = 0;
		} else if (rendaMensal < 5000.0) {
			impostoSalario = rendaSalario * 0.1;
		} else {
			impostoSalario = rendaSalario * 0.2;
		}

		impostoServico = rendaServico * 0.15;

		impostoGanhoCapital = rendaGanhoCapital * 0.2;

		totalBruto = impostoSalario + impostoServico + impostoGanhoCapital;

		gastosDedutiveis = gastosMedicos + gastosEducacionais;

		maximoDedutivel = totalBruto * 0.3;

		if (gastosDedutiveis > maximoDedutivel) {
			abatimento = maximoDedutivel;
		} else {
			abatimento = gastosDedutiveis;
		}
		totalLiquido = totalBruto - abatimento;

		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.println();
		System.out.printf("Imposto sobre salário: %.2f%n ", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n ", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n ", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n ", gastosDedutiveis);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", totalBruto);
		System.out.printf("Abatimento:%.2f%n ", abatimento);
		System.out.printf("Imposto devido: %.2f%n ", totalLiquido);

		sc.close();
	}

}
