package ru.levelup.lesson9.homework.command;

import ru.levelup.lesson9.homework.command.actions.*;
import ru.levelup.lesson9.homework.command.request.*;
import ru.levelup.lesson9.homework.service.AccountService;

public class ActionFactory {
    private final AccountService accountService;

    public ActionFactory(AccountService accountService) { this.accountService = accountService; }

    public Action create(ActionRequest request) {
        switch (request.getType()) {
            case UPDATE_ACCOUNT:
                UpdateActionRequest updateActionRequest = (UpdateActionRequest) request;
                return new UpdateAccountAction(accountService, updateActionRequest.getAccountNum(),
                        updateActionRequest.getBalance());
            case CREATE_ACCOUNT:
                CreateActionRequest createActionRequest = (CreateActionRequest) request;
                return new CreateAccountAction(accountService, createActionRequest.getBankName(),
                        createActionRequest.getAccountType(), createActionRequest.getAccountNum());
            case CLOSE_ACCOUNT:
                CloseActionRequest closeActionRequest = (CloseActionRequest) request;
                return new CloseAccountAction(accountService, closeActionRequest.getAccountNum());
            case DISPLAY_ACCOUNTS:
                DisplayActionRequest displayActionRequest = (DisplayActionRequest) request;
                return new DisplayAccountAction(accountService, displayActionRequest.getAccountNum());
        }
        return  null;
    }
}
