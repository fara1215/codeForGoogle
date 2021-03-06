package google2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;

public class BFS {

	Map<Integer, Vertex> vertecies= new HashMap<>();
	
	
	
	public Map createAdj(){
//		int id;
		Vertex v1 =new Vertex ();
		v1.setId(1);
		v1.setNeighbor(3);
		Vertex v2 =new Vertex ();
		v2.setId(2);
		v2.setNeighbor(1);
		v2.setNeighbor(3);
		Vertex v3 =new Vertex ();
		v3.setId(3);
		v3.setNeighbor(2);
		vertecies.put (1, v1);
		vertecies.put(2,v2);
		vertecies.put(3, v3);
		return vertecies;
	}
	
	public static void main (String [] args) {
		
		BFS bfs=new BFS();
		Map <Integer, Vertex> graph= bfs.createAdj();
		System.out.println(graph);
		//Iterator i=graph.iterator();
//		while (graph.hasNext()) {
//			
//		}
		
		for(Map.Entry<Integer, Vertex> v: graph.entrySet()) {
			System.out.println("ID: "+ v.getValue().getId()+" And Neighbors:");
			BST neighbors=v.getValue().getNeighbors();
			neighbors.inOrder(neighbors.root);
		}
	}
}
