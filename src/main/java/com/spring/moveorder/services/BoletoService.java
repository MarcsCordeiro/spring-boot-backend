package com.spring.moveorder.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.spring.moveorder.model.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date intanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(intanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
