package org.example.account.service;

import org.example.account.domain.Account;
import org.example.account.domain.AccountStatus;
import org.example.account.repository.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;
    @InjectMocks
    private AccountService accountService;

    @Test
    @DisplayName("계좌 조회 성공")
    void testXXX() {
        //given
        given(accountRepository.findById(anyLong()))
                .willReturn(Optional.of(Account.builder()
                        .accountStatus(AccountStatus.UNREGISTERED)
                        .accountNumber("69780")
                        .build()));
        //when
        Account account = accountService.getAccount(2555L);

        //then
        assertEquals("69780", account.getAccountNumber());
        assertEquals(AccountStatus.UNREGISTERED, account.getAccountStatus());
    }

    @Test
    @DisplayName("Test 이름 변경")
    void testGetAccount1() {
        //given
        given(accountRepository.findById(anyLong()))
                .willReturn(Optional.of(Account.builder()
                        .accountStatus(AccountStatus.UNREGISTERED)
                        .accountNumber("69780")
                        .build()));
        //when
        Account account = accountService.getAccount(2555L);

        //then
        assertEquals("69780", account.getAccountNumber());
        assertEquals(AccountStatus.UNREGISTERED, account.getAccountStatus());
    }

    @Test
    void testGetAccount2() {
        //given
        given(accountRepository.findById(anyLong()))
                .willReturn(Optional.of(Account.builder()
                        .accountStatus(AccountStatus.UNREGISTERED)
                        .accountNumber("69780")
                        .build()));
        //when
        Account account = accountService.getAccount(2555L);

        //then
        assertEquals("69780", account.getAccountNumber());
        assertEquals(AccountStatus.UNREGISTERED, account.getAccountStatus());
    }
}