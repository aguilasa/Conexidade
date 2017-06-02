package com.github.aguilasa;

public class Conexidade {

	private NodeList complete = new NodeList();
	private int time = 0;

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
		b.addAdj(h).addAdj(g).addAdj(f).addAdj(e);
		c.addAdj(a);
		d.addAdj(f).addAdj(e).addAdj(c);
		g.addAdj(c);
		h.addAdj(i).addAdj(f);
		i.addAdj(j).addAdj(b);
		j.addAdj(i);
	}

	public void exec() {
		dfs();
		System.out.println(complete);
		sort();
		dfs();
		System.out.println(complete);
	}

	private void sort() {
		complete.sort((Node n1, Node n2) -> n2.getClose() - n1.getClose());
	}

	private void dfs() {
		for (Node u : complete) {
			u.setColor(Color.WHITE);
		}
		time = 0;
		for (Node u : complete) {
			if (u.getColor() == Color.WHITE) {
				visit(u);
			}
		}
	}

	private void visit(Node u) {
		u.setColor(Color.GRAY);
		time++;
		u.setOpen(time);
		for (Node v : u.getAdjacency()) {
			if (v.getColor() == Color.WHITE) {
				visit(v);
			}
		}
		u.setColor(Color.BLACK);
		time++;
		u.setClose(time);
	}

}
