package com.atguigu.ticket.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Component;

@Component
@Service//将服务发布出去 注意这里是alibaba.dubbo的service
@EnableDubbo//实现类上加上这个注解 允许分布式
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "<厉害了，我的国>";
    }
}
