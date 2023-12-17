package com.Pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph{
    HashMap<String,List<String>> adjList=new HashMap<>();
    Graph(){
    }
    public Graph(String vertex){
        adjList.put(vertex,new ArrayList<>());
    }
    public void printGraph(){
        System.out.println(adjList);
    }
    public Map<String,List<String>> getAdjList(){
        return adjList;
    }
    public boolean addVertex(String vertex){
        if(adjList.containsKey(vertex)){
            return false;
        }
        adjList.put(vertex, new ArrayList<>());
        return true;
    }
    public boolean addEdge(String adj,String edge)
    {
        if(adjList.get(adj)!=null&&adjList.get(edge)!=null)
        {
            adjList.get(adj).add(edge);
            adjList.get(edge).add(adj);
            return true;
        }
        if(adjList.containsKey(adj)){
            adjList.get(adj).add(edge);
            addVertex(edge);
            adjList.get(edge).add(adj);
            return true;
        }
       if(adjList.containsKey(edge)){
            adjList.get(edge).add(adj);
            addVertex(adj);
            adjList.get(adj).add(edge);
            return true;
        }
        return false;
    }
    
public String removeEdge(String vertex){
    String remove=null;
    if(adjList.get(vertex)!=null){
        remove=vertex;
        for(String str:adjList.get(vertex)){
            adjList.get(str).remove(vertex);
        }
        adjList.remove(vertex);
        return remove;
    }
        return remove;
    }
}
