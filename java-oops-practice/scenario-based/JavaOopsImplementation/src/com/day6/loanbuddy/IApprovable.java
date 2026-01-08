package com.day6.loanbuddy;

public interface IApprovable {
    boolean approveLoan();
    double calculateEMI();
}