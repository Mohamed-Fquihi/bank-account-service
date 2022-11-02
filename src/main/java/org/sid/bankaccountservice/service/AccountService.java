package org.sid.bankaccountservice.service;

import org.sid.bankaccountservice.dto.BankAccountRequestDTO;
import org.sid.bankaccountservice.dto.BankAccountResponse;
import org.sid.bankaccountservice.entities.BankAccount;

public interface AccountService {
    public BankAccountResponse addAccount(BankAccountRequestDTO bankAccountDTO);
}
