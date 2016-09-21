package DataStructuresPractice;

import java.util.ArrayList;

/**
 * Created by sanjanabadam on 9/8/16.
 */
public class Graph {


    public class Vertex {
        String label;
        ArrayList<Edge> neighbourhood;


        Vertex(String label) {
            this.label = label;
            neighbourhood = new ArrayList<Edge>();
        }

        public void addNeighbor(Edge edge) {
            if (this.neighbourhood.contains(edge)) {
                return;
            }
            this.neighbourhood.add(edge);

        }

        public boolean hasNeighbor(Edge other) {
            return this.neighbourhood.contains(other);
        }

        public Edge getNeighbor(int index) {
            return this.neighbourhood.get(index);
        }

        public Edge removeNeighbor(int index) {
            return this.neighbourhood.remove(index);
        }

        void removeNeighbor(Edge edge) {
            this.neighbourhood.remove(edge);
        }

        int getNeighborCount() {
            return this.neighbourhood.size();
        }

        public String getLabel() {
            return this.label;
        }


        public String toString() {
            return "Vertex " + label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public boolean equals(Object other) {
            if (!(other instanceof Vertex)) {
                return false;
            }
            return true;

        }


        public class Edge {

        }

    }
}
