package google2;

public class Vertex {

	private int id;
	private int neighbor;
	private BST neighbors=new BST();
	
		public int getId() {
			return this.id;
		}
		public void setId(int id) {
			
			this.id=id;
		}
//		public int getNeighbor() {
//			return this.neighbor;
//		}
		public void setNeighbor(int neighbor) {
			this.neighbor=neighbor;
			this.setNeighbors(neighbor);
		}
		public BST getNeighbors() {
			return this.neighbors;
		}
		public void setNeighbors(int neighbor) {
			this.neighbors.insert(neighbor);
			
		}
		
		
}
