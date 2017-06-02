package com.github.aguilasa;

public class Conexidade {

	private NodeList complete = new NodeList();
	private NodeList list = new NodeList();
	private Node v;

	public static void main(String[] args) {
		Conexidade rf = new Conexidade();
		rf.init();
		rf.exec();
	}

	public void init() {
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
		Node i = new Node("I");
		Node j = new Node("J");

		complete.add(j);
		complete.add(i);
		complete.add(h);
		complete.add(g);
		complete.add(f);
		complete.add(e);
		complete.add(d);
		complete.add(c);
		complete.add(b);
		complete.add(a);

		a.addAdj(g);
		b.addAdj(e).addAdj(f).addAdj(g).addAdj(h);
		c.addAdj(d).addAdj(e).addAdj(g).addAdj(i);
		d.addAdj(a).addAdj(b).addAdj(c).addAdj(i);
		e.addAdj(a).addAdj(c).addAdj(f).addAdj(h);
		f.addAdj(a).addAdj(b).addAdj(e).addAdj(h);
		g.addAdj(c).addAdj(h).addAdj(i);
		h.addAdj(e).addAdj(f).addAdj(g);
		i.addAdj(b).addAdj(c).addAdj(d).addAdj(g);

		v = a;
		list.add(v);
	}

	public void exec() {
	}

}
