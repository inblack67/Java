package com.intellisense;

class Main {
    public static  void main(String[] args) {
        System.out.println("Shinigamis");
        BankAccount acc = new BankAccount();
        System.out.println(acc.getAccountNumber());

        BankAccount ryuk = new BankAccount("ryuk","shinigami_world@gmail.com",666);
        System.out.println("Contact The God of Death Ryuk " + ryuk.getAccountNumber() + " " + ryuk.getPhoneNumber());
        System.out.println();

        System.out.println("Detectives");
        VipCustomer near = new VipCustomer("L", 120.7);
        VipCustomer mellow = new VipCustomer("L", 123.4, "email@email.com");
        System.out.println(mellow.getCreditLimit());
        System.out.println(near.getEmail());
    }

}

