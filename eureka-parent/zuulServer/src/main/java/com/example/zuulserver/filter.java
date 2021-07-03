package com.example.zuulserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class filter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        //获取路由信息，做灰度发布
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println(ctx.getRequest());

        System.out.println(1);
        return null;
    }
}
