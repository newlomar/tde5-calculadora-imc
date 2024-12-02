package org.example.tests;

import org.example.control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calcImc;

    @Before
    public void setup() {
        calcImc = new CalculadoraImc();
    }

    // ------------------------- Adultos ------------------------- //
    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(48.0, 1.735, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(48.0, 1.73, 20, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(38.0,
                1.52, 64, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(52.0, 1.70, 25,
                "feminino"));
    }

    @Test
    public void testeAdultoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(64.0, 1.72, 30
                , "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(69.0, 1.75, 40, "feminino"));
    }

    @Test
    public void testeAdultoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(80.0, 1.70, 35,
                "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(85.0, 1.72, 30, "feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(100.0,
                1.75, 40, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(100.0, 1.70, 50, "feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115.0,
                1.75, 55, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115.0, 1.70, 35, "feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIIInferior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(130.0, 1.75, 45, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIISuperior() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(140.0, 1.70, 60, "feminino"));
    }

    // ------------------------- Idosos ------------------------- //
    @Test
    public void testeIdosoMasculinoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(50.0, 1.75, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(70.0, 1.75, 72, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(80.0, 1.75, 75, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(85.0, 1.75, 78, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(90.0, 1.75, 80, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(95.0, 1.75, 82, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(100.0, 1.75, 85, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115.0,
                1.75, 88, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(110.0, 1.75, 90, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)",
                calcImc.calcularImc(130.0, 1.75, 92, "masculino"));
    }

    @Test
    public void testeIdosoFemininoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(50.0, 1.64, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(60.0, 1.64, 72, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(70.0, 1.64, 75
                , "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(80.0, 1.64, 78, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(85.0, 1.64, 80, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(90.0, 1.64, 82, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(95.0, 1.64, 85, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(100.0, 1.64, 88, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(105.0, 1.64, 90, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(105.0, 1.55, 70, "feminino"));
    }

    // ------------------------- Crianças ------------------------- //

    // 2 anos masculino
    @Test
    public void testeCriança2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(10.0, 0.85, 2, "masculino"));
    }

    @Test
    public void testeCriança2AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(11.2, 0.85, 2,
                "feminino"));
    }

    @Test
    public void testeCriança2AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(12.0, 0.85, 2,
                "masculino"));
    }

    @Test
    public void testeCriança2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(19.5, 0.85, 2, "masculino"));
    }

    // 4 anos masculino

    @Test
    public void testeCriança4AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(13.0, 1.05, 4, "masculino"));
    }

    @Test
    public void testeCriança4AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(15.0, 1.05, 4, "masculino"));
    }

    @Test
    public void testeCriança4AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.0, 1.05, 4, "feminino"));
    }

    @Test
    public void testeCriança4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(23.5, 1.05, 4,
                "masculino"));
    }

    // 6 anos masculino

    @Test
    public void testeCriança6AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriança6AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(16.5, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriança6AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.5, 1.10, 6, "masculino"));
    }

    @Test
    public void testeCriança6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(25.0, 1.10, 6,
                "masculino"));
    }

    // 8 anos masculino

    @Test
    public void testeCriança8AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(15.0, 1.30, 8, "masculino"));
    }

    @Test
    public void testeCriança8AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(26.0, 1.30, 8,
                "masculino"));
    }

    @Test
    public void testeCriança8AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(30.5, 1.30, 8,
                "masculino"));
    }

    @Test
    public void testeCriança8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(34, 1.30, 8,
                "masculino"));
    }

    // 10 anos masculino

    @Test
    public void testeCriança10AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(18.0, 1.40, 10, "masculino"));
    }

    @Test
    public void testeCriança10AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(30.0, 1.40, 10
                , "masculino"));
    }

    @Test
    public void testeCriança10AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(37.0, 1.40, 10,
                "masculino"));
    }

    @Test
    public void testeCriança10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(42.0, 1.40, 10,
                "masculino"));
    }

    // 12 anos masculino

    @Test
    public void testeCriança12AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(19.0, 1.50, 12, "masculino"));
    }

    @Test
    public void testeCriança12AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(36.0, 1.50, 12
                , "masculino"));
    }

    @Test
    public void testeCriança12AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(39.5, 1.40, 12,
                "feminino"));
    }

    @Test
    public void testeCriança12AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(55.0, 1.50, 12,
                "masculino"));
    }

    // 2 anos feminino

    @Test
    public void testeMenina2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(10.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeMenina2AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(11.0, 0.85, 2,
                "feminino"));
    }

    @Test
    public void testeMenina2AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(12.0, 0.85, 2,
                "feminino"));
    }

    @Test
    public void testeMenina2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(19.2, 0.85, 2, "feminino"));
    }

    // 4 anos feminino

    @Test
    public void testeMenina4AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(13.0, 1.05, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(16.0, 1.05, 4,
                "feminino"));
    }

    @Test
    public void testeMenina4AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(17.0, 1.05, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.3, 1.05, 4,
                "feminino"));
    }

    // 6 anos feminino

    @Test
    public void testeMenina6AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.0, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(18.0, 1.10, 6,
                "feminino"));
    }

    @Test
    public void testeMenina6AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(20.0, 1.10, 6,
                "feminino"));
    }

    @Test
    public void testeMenina6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.5, 1.10, 6,
                "feminino"));
    }

    // 8 anos feminino

    @Test
    public void testeMenina8AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.5, 1.30, 8, "feminino"));
    }

    @Test
    public void testeMenina8AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(24.8, 1.30, 8,
                "feminino"));
    }

    @Test
    public void testeMenina8AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(30.5, 1.30, 8,
                "feminino"));
    }

    @Test
    public void testeMenina8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(35.8, 1.30, 8,
                "feminino"));
    }

    // 10 anos feminino

    @Test
    public void testeMenina10AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(16.0, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(32.0, 1.40, 10,
                "feminino"));
    }

    @Test
    public void testeMenina10AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(35.5, 1.40, 10,
                "feminino"));
    }

    @Test
    public void testeMenina10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(42.0, 1.40, 10,
                "feminino"));
    }

    // 12 anos feminino

    @Test
    public void testeMenina12AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(18.0, 1.50, 12, "feminino"));
    }

    @Test
    public void testeMenina12AnosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(35.0, 1.50, 12,
                "feminino"));
    }

    @Test
    public void testeMenina12AnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(43.0, 1.50, 12,
                "feminino"));
    }

    @Test
    public void testeMenina12AnosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(50.0, 1.50, 12,
                "feminino"));
    }
}