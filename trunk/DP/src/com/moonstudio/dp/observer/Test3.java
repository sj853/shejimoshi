package com.moonstudio.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 这种设计方式
 * 
 * @author ThrFou
 * 
 */
public class Test3 {
	public static void main(String[] args) {
		
		Dad3 d = new Dad3();
		Child3 c = new Child3();
		c.addWakenUpListener(d);

		GrandFather gf = new GrandFather();
		c.addWakenUpListener(gf);

		new Thread(c).start();
	}
}

class Child3 implements Runnable {

	private List<WakenUpListener> wakenUpListeners = new ArrayList<WakenUpListener>();

	public void addWakenUpListener(WakenUpListener l) {
		wakenUpListeners.add(l);
	}

	void wakeUp() {
		for (WakenUpListener wl : wakenUpListeners) {
			wl.ActionToWakenUp(new WakenUpEvent(System.currentTimeMillis(),
					"bed", this));
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wakeUp();
	}

}

interface WakenUpListener {
	void ActionToWakenUp(WakenUpEvent e);
}

class WakenUpEvent {

	private long time;// 发生事件的时间
	private String loc;// 发生事件的位置
	private Object src;// 发生事件的源对象

	public WakenUpEvent(long time, String loc, Object src) {
		this.time = time;
		this.loc = loc;
		this.src = src;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Object getSrc() {
		return src;
	}

	public void setSrc(Object src) {
		this.src = src;
	}

}

class Dad3 implements WakenUpListener {

	public Dad3() {
	}

	@Override
	public void ActionToWakenUp(WakenUpEvent wakenUpEvent) {
		if (wakenUpEvent.getLoc().equals("bed")) {
			System.out.println("在床上醒的，爸爸抱一抱");
		} else {
			System.out.println("在其他地方醒的，爸爸喂饭");
			feed((Child3) wakenUpEvent.getSrc());
		}
	}

	public void feed(Child3 c2) {
		System.out.println("小孩醒了，喂食中...");
	}

}

class GrandFather implements WakenUpListener {

	@Override
	public void ActionToWakenUp(WakenUpEvent e) {
		if (e.getTime() > 12) {
			System.out.println("时间大于12,爷爷看看...");
		}
	}

}