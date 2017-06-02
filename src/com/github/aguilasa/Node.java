package com.github.aguilasa;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private List<Node> adjacency = new ArrayList<>();
	private Color color = Color.WHITE;
	private int open;
	private int close;

	public Node() {

	}

	public Node(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Node> getAdjacency() {
		return adjacency;
	}

	public Node addAdj(Node node) {
		adjacency.add(node);
		return this;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public int getClose() {
		return close;
	}

	public void setClose(int close) {
		this.close = close;
	}

	public boolean containsAdjNode(Node n) {
		return adjacency.contains(n);
	}

	public void reset() {
		color = Color.WHITE;
	}

	@Override
	public String toString() {
		return String.format("%s(%d/%d)", name, open, close);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
