package br.com.Interfaces.Exercicio.services;

import br.com.Interfaces.Exercicio.entities.Contract;
import br.com.Interfaces.Exercicio.entities.Installment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InstallmentService {
    private OnlinePaymentService onlinePaymentService;

    public InstallmentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void calcInstallment(Contract contract, int months) {
        Date d = contract.getDateContract();

        for (int i = 1; i <= months; i++) {
            float contractValue = contract.getTotal() / months;

            float feeValue = contractValue + onlinePaymentService.paymentFee(contractValue);
            float totalValue = feeValue + onlinePaymentService.interest(feeValue, i);

            Date dueDate = contract.getDateContract();

            dueDate = addMonthToDate(dueDate, i);

            Installment installment = new Installment(dueDate, totalValue);
            contract.addInstallment(installment);
        }
    }

    public Date addMonthToDate(Date date, int quantity) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, quantity);

        return cal.getTime();
    }
}
