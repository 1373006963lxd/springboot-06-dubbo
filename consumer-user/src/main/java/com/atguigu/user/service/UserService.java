package com.atguigu.user.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /*全引用，是看服务中心哪个全类名是TicketService*/
    @Reference /*注意引用的是alibaba的*/
    TicketService ticketService;


    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了"+ticket);
    }
}
