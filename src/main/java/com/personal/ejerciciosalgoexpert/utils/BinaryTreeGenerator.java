package com.personal.ejerciciosalgoexpert.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.ejerciciosalgoexpert.utils.dtos.NodeBinaryTree;
import com.personal.ejerciciosalgoexpert.utils.dtos.TreeDTO;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeGenerator {
    public static Tree generateTree(String entrance){
        ObjectMapper mapper = new ObjectMapper();
        TreeDTO tree = null;
        try{
            tree =  mapper.readValue(entrance, TreeDTO.class);
        }catch (JsonProcessingException ex){
            System.out.println("No se pudo parsear el Json");
        }
        /* Generar mapa con los valores */
        Map<String, NodeBinaryTree> nodes = new HashMap<>();
        if(tree != null)
        for (NodeBinaryTree node : tree.getNodes()) {
            nodes.put(node.getId(), node);
        }
        // Todo: Terminar lógica para la generación de los árboles binarios a partir de un JSON
        

        return null;
    }


}
