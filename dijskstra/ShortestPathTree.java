import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class ShortestPathTree{ 

  int[][] graph;
  ArrayList<Vertex<Integer>> vertices;
  PriorityQueue<Vertex<Integer>> unvisited;

  public void dijkstra(int[][] graph, int source) {
    
    //TODO...
    //intializing vertices (set distance to infinity and set all vertices as unvisited)
    vertices = new ArrayList<>();
    unvisited = new PriorityQueue<>();
    
    for(int i = 0; i < graph.length; i++){
      Vertex<Integer> vertex = new Vertex<>(i);
      vertex.setDistance(Integer.MAX_VALUE);
      vertices.add(vertex);
    }

    //set the distance of the source to zero
    vertices.get(source).setDistance(0);

    //fill the priority queue
    for(Vertex vertex: vertices){
      unvisited.add(vertex);
    }
    
    //while unvisited is still full
    while (!unvisited.isEmpty()){
      
    //poll smallest distance vertice in priorityqueue(unvisited.poll)
      Vertex<Integer> nextNeighbor = unvisited.poll();
      
      int[] distance = graph[nextNeighbor.getLabel()];
      
      //find neighbors of vertice using graph
      for(int k = 0; k < distance.length; k++){
        
        if(distance[k] > 0){
          
          //check if the neighbor is even in the priority queue(do we have to look at it?)
          
           if(unvisited.contains(vertices.get(k))){
                 
              // if current > alternative, pop off vertice and update distance(unvisited.remove(neighbor), unvisited.add.(neighbor))
           
              if((nextNeighbor.getDistance() + distance[k]) <       vertices.get(k).getDistance()){
                  unvisited.remove(vertices.get(k)); 
                    
                  //sum distances
                  vertices.get(k).setDistance(nextNeighbor.getDistance() + distance[k]);
                  
                  unvisited.add(vertices.get(k));
                  vertices.get(k).setPrevious(nextNeighbor);
              }
              //if current < alternative leave priority queue alone
             }
          }
        }
        
    //when you are done looking at a vertice, remove it from the unvisited priority queue
      unvisited.remove(nextNeighbor);
      if(unvisited.isEmpty()){
        System.out.println(nextNeighbor.getShortestPath());
      }
    }
    
    //print out the shortest distance for each vertice from the source
    for (int j = 0; j < vertices.size(); j++){
      
      System.out.println(vertices.get(j).getLabel() + ": " + vertices.get(j).getDistance());
    }

  }    

}
