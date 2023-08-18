package com.projeto.springBatch.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.springBatch.entities.Empregado;
import com.projeto.springBatch.repository.EmpregadoRepository;

@Component
public class DBWriterEmpregados implements ItemWriter<Empregado> {
	
	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	@Override
	public void write(List<? extends Empregado> empregados) throws Exception {
		System.out.println("Dados salvos para empregados: " + empregados);
		empregadoRepository.saveAll(empregados);
	}
	
}
