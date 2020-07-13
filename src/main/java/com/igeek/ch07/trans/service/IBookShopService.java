package com.igeek.ch07.trans.service;

import com.igeek.ch07.trans.exception.AccountException;
import com.igeek.ch07.trans.exception.BookStockException;

public interface IBookShopService {

    //通过账户名及书号购买书
    public void purchase(String username, int bookId) throws BookStockException, AccountException;
}
