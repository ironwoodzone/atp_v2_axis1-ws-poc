package com.bookcyprus.webservicesV2;

import javax.xml.namespace.QName;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class MyHandler extends BasicHandler {

    private static final long serialVersionUID = 1L;

	@Override
    public void init() {
        System.out.println("init called");
        super.init();
        System.out.println("init called");
    }

    @Override
    public void cleanup() {
        super.cleanup();
        System.out.println("cleanup called");
    }

    @Override
    public void invoke(MessageContext mc) throws AxisFault {
        System.out.println("invoke called");
    }

    public QName[] getHeaders() {
        System.out.println("getHeaders");
        return new QName[1];
    }
}