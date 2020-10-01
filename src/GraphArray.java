
public class GraphArray {
		private int[][]array;
		private boolean[] visited;
		stackArray<Integer> stack;
		
		 public GraphArray(int size) {
	    array=new int[size+1][size+1];
		visited=new boolean[size+1];
			for(int i=0;i<visited.length; i++) {
				visited[i]=false;
			}
		}
		
		public int[][] getArray(){
		return array;	
        }
  public boolean isEmpty() {
	  return array==null;
  }
  
  public void addUndirectedEDGE(int x,int y) {
	  array[x][y]=1;
  }
  
  public void addCompleteEdge(int x,int y) {
	  array[x][y]=1;
	  array[y][x]=1;
  }
  public void deletUndirectedEDGE(int x,int y) {
	  array[x][y]=0;
  }
  
  public void deleteCompleteEdge(int x,int y) {
	  array[x][y]=0;
	  array[y][x]=0;  
  }
  
  public void DFS(int startv) {
	  //stack 이용한 방
	  stack=new StackArray<Integer>();
	  stack.push(startv);
	  visited[startv]=true;
	  System.out.print("DFS 순서(스택방)="+startv);
     
	  while(!stack.isEmpty()){
       int currentv=stack.peek();
       boolean flag=false;
       
       for(int i=1; i<array[0].length; i++) {
    	   if((array[currentv][i]==1)&&(visited[i]==false)) {// 간선 있고 방문하지 않은 상태 
    		   stack.push(i);
    		   visited[i]=true;
    		   flag=true;
    				   break;
    	   }
       }
      if (flag==false) stack.pop();
       }
	  visited[startv]=true;
	  System.out.print("=>startV");
	  
	  for(int i=1; i<array[0].length; i++) {
		  if((array[startv][i]==1)&&(visited[i]==false)) {
			  DFS(i);
		  }
	  }
  }
  public void BFS(int startv) {
	  Queue<Integer> q=new Queue<Integer>();
	  initVisited();
	  
	  q.enQueue(startv);
	  visited[startv]=true;
	  System.out.print("BFS순서(큐방법)="+startv);
	  
	  while(!q.isEmpty()) {
		  int v=q.deQueue();
		  visited[v]=true;
		  
		  for(int i=1; i<array[0].length; i++) {//인접행렬 체크함.
			  if((array[startv][i]==1)&&(visited[i]==false)){
				  q.enQueue(i);
				  visited[i]=true;
				  System.out.print("=>+i");
			  }
			  
		  }
	  }
  }

private void initVisited() {
	// TODO Auto-generated method stub
	
}
  }

