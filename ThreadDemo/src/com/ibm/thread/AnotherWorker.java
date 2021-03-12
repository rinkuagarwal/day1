package com.ibm.thread;

public class AnotherWorker implements Runnable{
@Override
public void run()
{
	System.out.println("in another thread"+Thread.currentThread());
	}
}
