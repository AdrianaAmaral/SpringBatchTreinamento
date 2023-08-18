package com.projeto.springBatch.batch.processor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.projeto.springBatch.entities.Empregado;

@Component
public class Processor implements ItemProcessor<Empregado, Empregado> {
	
	private static final Map<String, String> DEPT_NAMES = new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("01", "Administração");
		DEPT_NAMES.put("02", "Obras");
		DEPT_NAMES.put("03", "Finanças");
	}

	public Empregado process(Empregado empregado) throws Exception {
		
		String codigo = empregado.getCodDepartamento();
		String nome = DEPT_NAMES.get(codigo);
		empregado.setNomeDepartamento(nome);
		System.out.println(String.format("Converte [%s] para [%s]", codigo, nome));
		return empregado;
	}  
	
}
