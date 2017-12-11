package info6205.project.GeneticAlgorithm;

import java.util.Random;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

/**
 * Traveling Salesman Problem using Genetic Algorithm
 * @author Emily Strong
 *
 * Requirements:
 * genetic code
 * gene expression
 * fitness function
 * sort function
 * evolution mechanism
 * logging function
 * unit tests
 * Bonus:
 * parallel computing for "colonies"
 *
 */
 
public class Main 
{
	final static Logger logger = Logger.getLogger(Main.class);
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	
        Random random = new Random(10);
        int n = 100;
        WeightedGraph g = new WeightedGraph(n);
        // generate a complete graph with n vertices
        for (int i = 0; i < n; i++) {
        	for(int j=i+1; j<n; j++) {
        		int weight = random.nextInt(5)+1;
        		WeightedEdge e = new WeightedEdge(i, j, weight); //create edge with weight between 1 and 5
        		g.addEdge(e);
        	}
        }
        
        GeneticAlgorithm darwin = new GeneticAlgorithm(g);
        darwin.run();
        
    }
}
