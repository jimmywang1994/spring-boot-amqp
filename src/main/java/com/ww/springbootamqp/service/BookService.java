package com.ww.springbootamqp.service;

import com.ww.springbootamqp.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @RabbitListener(queues = "atguigu.news")
    public void receive(Book b) {
        System.out.println("收到消息" + b.getName());
    }
}
