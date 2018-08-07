package edu.advanced.tree;

import edu.advanced.tree.binary.NodoTree;

public class MainTree {
    public static void main(String[] args) {
        NodoTree root = new NodoTree(20);
        root.add(5);
        root.add(99);
        root.add(3);
        root.add(14);
        root.add(32);
        root.add(99);
        root.add(10);

        System.out.println("In Order");
        root.printInOrder();

        System.out.println("\nPre Order");
        root.printPreOrder();

        System.out.println("\nPost Order");
        root.printPosOrder();

        System.out.println("\nprintInOrderDesc");
        root.printInOrderDesc();




        // NodoTree root = new NodoTree(10);
        // root.add(5);
        // root.add(15);
        // root.add(8);

        // NodoTree result = root.find(11);
        // if (result != null) {
        //     System.out.println(result);
        // } else {
        //     System.out.println("No encontrado");
        // }

        // result = root.find(8);
        // if (result != null) {
        //     System.out.println(result);
        // } else {
        //     System.out.println("No encontrado");
        // }
        // System.out.println("Impresion: in order");
        // root.printInOrder();
        // System.out.println("Impresion: pos order");
        // root.printPosOrder();
        // System.out.println("Impresion: pre order");
        // root.printPreOrder();
    }
}
